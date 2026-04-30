package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseForm;

/**
 * Form class for changing user password.
 * 
 * This class is used to capture user input for password change functionality.
 * 
 * Features:
 * - Validates old and new passwords
 * - Enforces password length (6-8 characters)
 * - Ensures password contains letter, number and special character
 * - Validates loginId as email
 * 
 * @author Chaitanya Bhatt
 */
public class ChangePasswordForm extends BaseForm {

	/**
	 * Old password of the user.
	 */
	@NotEmpty(message = "Old Password is required")
	@Size(min = 6, max = 8, message = "Old Password must be 6-8 characters")
	@Pattern(
		regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&]).*$",
		message = "Old Password must contain letter, number & special character"
	)
	private String oldPassword;

	/**
	 * New password of the user.
	 */
	@NotEmpty(message = "New Password is required")
	@Size(min = 6, max = 8, message = "New Password must be 6-8 characters")
	@Pattern(
		regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&]).*$",
		message = "New Password must contain letter, number & special character"
	)
	private String newPassword;

	/**
	 * Login ID of the user (email).
	 */
	@NotEmpty(message = "Login Id is required")
	@Email(message = "Invalid Email format")
	private String loginId;

	// ================== GETTERS & SETTERS ==================

	/**
	 * @return old password
	 */
	public String getOldPassword() {
		return oldPassword;
	}

	/**
	 * @param oldPassword old password
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * @return new password
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * @param newPassword new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

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