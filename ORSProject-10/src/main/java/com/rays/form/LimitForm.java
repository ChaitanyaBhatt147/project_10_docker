package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LimitDTO;

public class LimitForm extends BaseForm{
	@NotEmpty(message = "Limit code is required")
	private String limitCode;
	@NotEmpty(message = "Limit name is required")
	private String limitName;
	@NotNull(message = "max value is required")
	private Integer maxValue;
	@NotEmpty(message = "status is required")
	private String status;
	public String getLimitCode() {
		return limitCode;
	}
	public void setLimitCode(String limitCode) {
		this.limitCode = limitCode;
	}
	public String getLimitName() {
		return limitName;
	}
	public void setLimitName(String limitName) {
		this.limitName = limitName;
	}
	public Integer getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		LimitDTO dto = initDTO(new LimitDTO());
		dto.setLimitCode(limitCode);
		dto.setLimitName(limitName);
		dto.setMaxValue(maxValue);
		dto.setStatus(status);
		return dto;
	}
}
