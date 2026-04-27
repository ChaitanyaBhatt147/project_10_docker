package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RateLimitDTO;

public class RateLimitForm extends BaseForm{

	@NotEmpty(message = "rate Limit Code is required")
	private String rateLimitCode;
	@NotEmpty(message = "apiName is required")
	private String apiName;
	@NotNull(message = "limitPerMin is required")
	private Integer limitPerMin;
	@NotEmpty(message = "status is required")
	private String status;
	public String getRateLimitCode() {
		return rateLimitCode;
	}
	public void setRateLimitCode(String rateLimitCode) {
		this.rateLimitCode = rateLimitCode;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public Integer getLimitPerMin() {
		return limitPerMin;
	}
	public void setLimitPerMin(Integer limitPerMin) {
		this.limitPerMin = limitPerMin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		RateLimitDTO dto = initDTO(new RateLimitDTO());
		dto.setApiName(apiName);
		dto.setRateLimitCode(rateLimitCode);
		dto.setLimitPerMin(limitPerMin);
		dto.setStatus(status);
		return dto;
	}
}
