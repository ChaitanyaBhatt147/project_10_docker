package com.rays.form;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClickDTO;

public class ClickForm extends BaseForm{
	@NotEmpty(message = "Click Code is required")
	private String clickCode;
	@NotEmpty(message = "user Name is required")
	private String userName;
	private Timestamp clickTime;
	@NotEmpty(message = "status required")
	private String status;
	
	public String getClickCode() {
		return clickCode;
	}

	public void setClickCode(String clickCode) {
		this.clickCode = clickCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getClickTime() {
		return clickTime;
	}

	public void setClickTime(Timestamp clickTime) {
		this.clickTime = clickTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		ClickDTO dto = initDTO(new ClickDTO());
		dto.setClickCode(clickCode);
		dto.setClickTime(clickTime);
		dto.setUserName(userName);
		dto.setStatus(status);
		return dto;
	}
}
