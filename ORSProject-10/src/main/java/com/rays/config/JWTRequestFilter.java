package com.rays.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.rays.common.UserContext;
import com.rays.common.UserContextHolder;
import com.rays.dto.UserDTO;
import com.rays.service.JWTUserDetailsService;

/**
 * JWT Request Filter for handling authentication using JSON Web Token.
 * 
 * This filter is executed once per request and is responsible for:
 * - Extracting JWT token from Authorization header
 * - Validating the token
 * - Loading user details
 * - Setting authentication in Spring Security context
 * - Storing UserContext in ThreadLocal for application-wide access
 * 
 * If token is invalid or expired, it blocks the request and returns 401.
 * 
 * @author Chaitanya Bhatt
 */
@Component
public class JWTRequestFilter extends OncePerRequestFilter {

	/**
	 * Utility class for JWT operations like extraction and validation.
	 */
	@Autowired
	private JWTUtil jwtUtil;

	/**
	 * Service to load user details for authentication.
	 */
	@Autowired
	private JWTUserDetailsService jwtUserDetailsService;

	/**
	 * Filters each request to validate JWT token and set authentication context.
	 * 
	 * @param request HTTP request
	 * @param response HTTP response
	 * @param filterChain filter chain
	 * @throws ServletException exception during filtering
	 * @throws IOException input/output exception
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		final String authorizationHeader = request.getHeader("Authorization");

		System.out.println("JWT Token ======>>>>> " + authorizationHeader);

		// Check if Authorization header contains Bearer token
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {

			System.out.println("JWT Token ======>>>>> iiiiinnnnnn");

			String jwtToken = authorizationHeader.substring(7);

			try {

				// Extract loginId from token
				String loginId = jwtUtil.extractLoginId(jwtToken);

				// Validate token
				if (!jwtUtil.validateToken(jwtToken, loginId)) {
					throw new Exception("Invalid JWT token");
				}

				// Authenticate user if not already authenticated
				if (loginId != null && SecurityContextHolder.getContext().getAuthentication() == null) {

					UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(loginId);

					UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
							userDetails, null, userDetails.getAuthorities());

					authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

					SecurityContextHolder.getContext().setAuthentication(authenticationToken);
				}

				// Create UserContext and store in ThreadLocal
				UserDTO dto = new UserDTO();
				dto.setLoginId(loginId);

				System.out.println("request filter: " + dto.getLoginId());

				UserContext context = new UserContext(dto);

				// ThreadLocal me set
				UserContextHolder.setContext(context);

			} catch (Exception e) {
				// Handle invalid token
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().write("Token is invalid... plz login again..!!");
				return;
			}
		}
		filterChain.doFilter(request, response);
	}
}