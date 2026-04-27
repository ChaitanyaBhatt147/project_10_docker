package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "SubscriptionPlan")
public class SubscriptionPlanDTO extends BaseDTO{

	@Column(name = "planName")
	private String planName;
	@Column(name = "price")
	private Double price;
	@Column(name = "ValidityDays")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "planName";
	}

	@Override
	public String getUniqueValue() {
		return planName;
	}

	@Override
	public String getLabel() {
		return "SubscriptionPlan";
	}

	@Override
	public String getTableName() {
		return "SubscriptionPlan";
	}
}
