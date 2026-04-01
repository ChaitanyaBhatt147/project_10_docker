package com.rays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rays.common.FrontCtl;

/**
 * Main class for ORS Project 10 Spring Boot Application.
 * This class is responsible for bootstrapping the application
 * and configuring global settings such as CORS.
 * 
 * @author Chaitanya Bhatt
 */
@SpringBootApplication
public class ORSProject10Application {

	/**
	 * Front Controller Interceptor used for request handling.
	 */
	@Autowired
	private FrontCtl frontCtl;

	/**
	 * Main method to launch the Spring Boot application.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ORSProject10Application.class, args);
	}

	/**
	 * Bean configuration for CORS (Cross-Origin Resource Sharing).
	 * This allows frontend applications (e.g., Angular running on localhost:4200)
	 * to communicate with the backend APIs.
	 * 
	 * @return WebMvcConfigurer instance with CORS configuration
	 */
	@Bean
	public WebMvcConfigurer corsConfig() {
		WebMvcConfigurer w = new WebMvcConfigurer() {

			/**
			 * Configure CORS mappings for the application.
			 * 
			 * @param registry CorsRegistry to register mappings
			 */
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("*")
						.allowCredentials(true);
			}

			/*
			 * Configure interceptors for request handling.
			 * Currently commented out.
			 * 
			 * @param registry InterceptorRegistry to add interceptors
			 */
			/*
			 * @Override public void addInterceptors(InterceptorRegistry registry) {
			 * registry.addInterceptor(frontCtl).addPathPatterns("/**").excludePathPatterns(
			 * "/Auth/**"); }
			 */
		};

		return w;
	}
}