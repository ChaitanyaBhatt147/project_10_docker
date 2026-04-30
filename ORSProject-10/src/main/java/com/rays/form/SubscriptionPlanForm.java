package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionPlanDTO;

/**
 * Form class for SubscriptionPlan entity.
 * 
 * This class is used to capture user input for Subscription Plan operations
 * such as create and update.
 * 
 * Features:
 * - Validates plan name (valid characters)
 * - Validates price (non-null numeric value)
 * - Validates validity days (non-null numeric value)
 * - Converts form data into SubscriptionPlanDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class SubscriptionPlanForm extends BaseForm {

	/**
	 * Name of the subscription plan.
	 */
	@NotEmpty(message = "Plan name is required")
	@Pattern(regexp = "^[A-Za-z0-9 .,&-]+$", message = "Invalid Plan Name")
	private String planName;

	/**
	 * Price of the subscription plan.
	 */
	@NotNull(message = "Price is required")
	private Double price;

	/**
	 * Validity period in days.
	 */
	@NotNull(message = "Validity days are rrquired")
	private Integer validityDays;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getValidityDays() {
		return validityDays;
	}

	public void setValidityDays(Integer validityDays) {
		this.validityDays = validityDays;
	}

	/**
	 * Converts form data into SubscriptionPlanDTO.
	 * 
	 * @return SubscriptionPlanDTO object
	 */
	@Override
	public BaseDTO getDto() {
		SubscriptionPlanDTO dto = initDTO(new SubscriptionPlanDTO());
		dto.setPlanName(planName);
		dto.setPrice(price);
		dto.setValidityDays(validityDays);
		return dto;
	}
}