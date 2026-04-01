package com.rays.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Spring Security Configuration class.
 * 
 * This class configures:
 * - Security rules for endpoints
 * - JWT-based authentication filter
 * - Stateless session management
 * - CORS and CSRF settings
 * 
 * Key Features:
 * - Disables CSRF protection (for REST APIs)
 * - Allows public access to authentication and profile image APIs
 * - Secures all other endpoints
 * - Uses JWT filter for authentication
 * - Configures stateless session (no HTTP session stored)
 * 
 * @author Chaitanya Bhatt
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * JWT Request Filter for validating tokens.
	 */
	@Autowired
	private JWTRequestFilter jwtRequestFilter;

	/**
	 * Configures HTTP security for the application.
	 * 
	 * @param http HttpSecurity object
	 * @throws Exception in case of configuration errors
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/Auth/**", "/User/profilePic/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		// Add JWT filter before UsernamePasswordAuthenticationFilter
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

		// Enable CORS
		http.cors();
	}
}