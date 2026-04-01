package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rays.dto.UserDTO;

/**
 * Service class for loading user-specific data for authentication.
 * 
 * This class implements Spring Security's UserDetailsService interface
 * and is used during authentication to load user details from the database.
 * 
 * Features:
 * - Fetches user details using login ID
 * - Encodes password using BCrypt
 * - Builds UserDetails object for Spring Security
 * 
 * Annotated with @Service to indicate service layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Service
public class JWTUserDetailsService implements UserDetailsService {

	/**
	 * Bean for password encoding using BCrypt algorithm.
	 * 
	 * @return PasswordEncoder instance
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	UserServiceInt userService;

	/**
	 * Loads user details by username (login ID).
	 * 
	 * @param username login ID of the user
	 * @return UserDetails object for authentication
	 * @throws UsernameNotFoundException if user is not found
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserDTO user = userService.findByLoginId(username, null);

		if (user == null) {
			System.out.println("user found nuulllll");
			throw new UsernameNotFoundException("User not found with username : " + username);
		}

		return User.builder()
				.username(user.getLoginId())
				.password(passwordEncoder().encode(user.getPassword()))
				.roles("USER")
				.build();
	}
}