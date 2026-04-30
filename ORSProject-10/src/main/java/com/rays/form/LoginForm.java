package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * Form class for Login functionality.
 * 
 * This class is used to capture user credentials for authentication.
 * It includes validation constraints to ensure proper input.
 * 
 * Features:
 * - Validates login ID as a required email
 * - Validates password as a required field
 * 
 * @author Chaitanya Bhatt
 */
public class LoginForm {

	/**
	 * Login ID (must be a valid email).
	 */
	@NotEmpty(message = "Login Id is required")
	@Email(message = "Invalid Email format")
	@Pattern(
		regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		message = "Invalid Email format"
	)
	private String loginId;

	/**
	 * User password.
	 */
	@NotEmpty(message = "Password is required")
	@Pattern(
		regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&]).{6,8}$",
		message = "Password must be 6-8 characters and include letter, number & special character"
	)
	private String password;

	/**
	 * @return login ID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId user login ID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password user password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}