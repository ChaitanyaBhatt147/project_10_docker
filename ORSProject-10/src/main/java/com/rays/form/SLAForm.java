package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SLADTO;

public class SLAForm extends BaseForm {
	@NotEmpty(message = "sla code is required")
	private String slaCode;
	@NotEmpty(message = "service name is required")
	private String serviceName;
	@NotNull(message = "response time is required")
	private Integer responseTime;
	@NotEmpty(message = "status is required")
	private String status;

	public String getSlaCode() {
		return slaCode;
	}

	public void setSlaCode(String slaCode) {
		this.slaCode = slaCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Integer responseTime) {
		this.responseTime = responseTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		SLADTO dto = initDTO(new SLADTO());
		dto.setSlaCode(slaCode);
		dto.setServiceName(serviceName);
		dto.setResponseTime(responseTime);
		dto.setStatus(status);
		return dto;
	}
}
