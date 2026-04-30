package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RateLimitDTO;

/**
 * Form class for RateLimit entity.
 * 
 * This class is used to capture user input for Rate Limit operations
 * such as create and update.
 * 
 * Features:
 * - Validates rate limit code (alphanumeric)
 * - Validates API name (valid characters)
 * - Validates limit per minute (non-null numeric value)
 * - Validates status (fixed values)
 * - Converts form data into RateLimitDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class RateLimitForm extends BaseForm {

	/**
	 * Unique rate limit code.
	 */
	@NotEmpty(message = "rate Limit Code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Rate Limit Code must be alphanumeric")
	private String rateLimitCode;

	/**
	 * Name of the API.
	 */
	@NotEmpty(message = "apiName is required")
	@Pattern(regexp = "^[A-Za-z0-9/_-]+$", message = "Invalid API Name")
	private String apiName;

	/**
	 * Request limit per minute.
	 */
	@NotNull(message = "limitPerMin is required")
	private Integer limitPerMin;

	/**
	 * Status of the rate limit.
	 */
	@NotEmpty(message = "status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
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

	/**
	 * Converts form data into RateLimitDTO.
	 * 
	 * @return RateLimitDTO object
	 */
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