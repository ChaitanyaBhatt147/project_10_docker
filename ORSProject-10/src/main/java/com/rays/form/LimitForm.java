package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LimitDTO;

/**
 * Form class for Limit entity.
 * 
 * This class is used to capture user input for Limit operations
 * such as create and update.
 * 
 * Features:
 * - Validates limit code (alphanumeric)
 * - Validates limit name (alphabets and spaces)
 * - Validates max value (non-null numeric)
 * - Validates status (fixed values)
 * - Converts form data into LimitDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class LimitForm extends BaseForm {

	/**
	 * Unique limit code.
	 */
	@NotEmpty(message = "Limit Code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Limit Code must be alphanumeric")
	private String limitCode;

	/**
	 * Name of the limit.
	 */
	@NotEmpty(message = "Limit Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Limit Name must contain only alphabets")
	private String limitName;

	/**
	 * Maximum value of the limit.
	 */
	@NotNull(message = "Max Value is required")
	private Integer maxValue;

	/**
	 * Status of the limit.
	 */
	@NotEmpty(message = "Status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
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

	/**
	 * Converts form data into LimitDTO.
	 * 
	 * @return LimitDTO object
	 */
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