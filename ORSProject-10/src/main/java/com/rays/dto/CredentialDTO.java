package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Credential")
public class CredentialDTO extends BaseDTO{
	@Column(name = "credential_code")
	private String credentialCode;
	@Column(name = "user_name")
	private String username;
	@Column(name = "type")
	private String type;
	@Column(name = "status")
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "credentialCode";
	}

	@Override
	public String getUniqueValue() {
		return credentialCode;
	}

	@Override
	public String getLabel() {
		return "Credential";
	}

	@Override
	public String getTableName() {
		return "Credential";
	}
}
