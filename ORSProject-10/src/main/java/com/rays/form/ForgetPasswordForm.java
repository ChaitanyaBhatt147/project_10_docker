package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;

/**
 * Form class for Forget Password functionality.
 * 
 * This class is used to capture user input when requesting
 * password recovery.
 * 
 * Features:
 * - Validates that login ID is provided
 * 
 * @author Chaitanya Bhatt
 */
public class ForgetPasswordForm extends BaseForm {

	/**
	 * Login ID of the user.
	 */
	@NotEmpty(message = "Login Id is required")
	@Pattern(
		regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		message = "Invalid Email format"
	)
	private String loginId;

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
}