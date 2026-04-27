package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionPlanDTO;

public class SubscriptionPlanForm extends BaseForm{
	@NotEmpty(message = "Plan name is required")
	private String planName;
	@NotNull(message = "Price is required")
	private Double price;
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
	@Override
	public BaseDTO getDto() {
		SubscriptionPlanDTO dto = initDTO(new SubscriptionPlanDTO());
		dto.setPlanName(planName);
		dto.setPrice(price);
		dto.setValidityDays(validityDays);
		return dto;
	}
}
