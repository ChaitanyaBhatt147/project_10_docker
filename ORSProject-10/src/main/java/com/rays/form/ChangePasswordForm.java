package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.rays.common.BaseForm;

/**
 * Form class for changing user password.
 * 
 * This class is used to capture user input for password change functionality.
 * It includes validation constraints to ensure proper input.
 * 
 * Features:
 * - Validates old and new passwords
 * - Ensures password length constraints
 * - Holds loginId for user identification
 * 
 * @author Chaitanya Bhatt
 */
public class ChangePasswordForm extends BaseForm {

	/**
	 * Old password of the user.
	 */
	@NotEmpty(message = "Old Password is required")
	@Size(min = 2, max = 10)
	private String oldPassword;

	/**
	 * New password of the user.
	 */
	@NotEmpty(message = "New Password is required")
	@Size(min = 2, max = 10)
	private String newPassword;

	/**
	 * Login ID of the user.
	 */
	private String loginId;

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