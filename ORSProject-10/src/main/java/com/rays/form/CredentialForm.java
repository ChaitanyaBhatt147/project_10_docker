package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CredentialDTO;

public class CredentialForm extends BaseForm {
	@NotEmpty(message = "credential Code is required")
	private String credentialCode;
	@NotEmpty(message = "user name is required")
	private String username;
	@NotEmpty(message = "type is required")
	private String type;
	@NotEmpty(message = "status is required")
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
