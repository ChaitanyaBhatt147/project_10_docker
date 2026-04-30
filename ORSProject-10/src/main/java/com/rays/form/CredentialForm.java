package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CredentialDTO;

/**
 * Form class for Credential entity.
 * 
 * This class is used to capture user input for Credential operations
 * such as create and update.
 * 
 * Features:
 * - Validates credential code (alphanumeric)
 * - Validates username (alphabets only)
 * - Validates type (controlled values)
 * - Validates status (fixed values)
 * - Converts form data into CredentialDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class CredentialForm extends BaseForm {

	/**
	 * Unique credential code.
	 */
	@NotEmpty(message = "Credential Code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Credential Code must be alphanumeric")
	private String credentialCode;

	/**
	 * Username associated with the credential.
	 */
	@NotEmpty(message = "User Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "User Name must contain only alphabets")
	private String username;

	/**
	 * Type of credential.
	 */
	@NotEmpty(message = "Type is required")
	@Pattern(regexp = "^(Admin|User|Guest)$", message = "Type must be Admin, User or Guest")
	private String type;

	/**
	 * Status of the credential.
	 */
	@NotEmpty(message = "Status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
	private String status;

	public String getCredentialCode() {
		return credentialCode;
	}

	public void setCredentialCode(String credentialCode) {
		this.credentialCode = credentialCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Converts form data into CredentialDTO.
	 * 
	 * @return CredentialDTO object
	 */
	@Override
	public BaseDTO getDto() {
		CredentialDTO dto = initDTO(new CredentialDTO());
		dto.setCredentialCode(credentialCode);
		dto.setUsername(username);
		dto.setType(type);
		dto.setStatus(status);
		return dto;
	}
}