package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SLADTO;

/**
 * Form class for SLA (Service Level Agreement) entity.
 * 
 * This class is used to capture user input for SLA operations
 * such as create and update.
 * 
 * Features:
 * - Validates SLA code (alphanumeric)
 * - Validates service name (valid characters)
 * - Validates response time (non-null numeric value)
 * - Validates status (fixed values)
 * - Converts form data into SLADTO object
 * 
 * @author Chaitanya Bhatt
 */
public class SLAForm extends BaseForm {

	/**
	 * Unique SLA code.
	 */
	@NotEmpty(message = "sla code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "SLA Code must be alphanumeric")
	private String slaCode;

	/**
	 * Name of the service.
	 */
	@NotEmpty(message = "service name is required")
	@Pattern(regexp = "^[A-Za-z0-9 .,&-]+$", message = "Invalid Service Name")
	private String serviceName;

	/**
	 * Response time for the SLA.
	 */
	@NotNull(message = "response time is required")
	private Integer responseTime;

	/**
	 * Status of the SLA.
	 */
	@NotEmpty(message = "status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
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

	/**
	 * Converts form data into SLADTO.
	 * 
	 * @return SLADTO object
	 */
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