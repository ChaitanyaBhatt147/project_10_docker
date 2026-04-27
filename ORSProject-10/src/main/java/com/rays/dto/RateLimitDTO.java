package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "rate_limit")
public class RateLimitDTO extends BaseDTO{

	@Column(name = "rateLimitCode")
	private String rateLimitCode;
	
	@Column(name = "apiName")
	private String apiName;
	
	@Column(name = "limitPerMin")
	private Integer limitPerMin;
	
	@Column(name = "status")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "rateLimitCode";
	}

	@Override
	public String getUniqueValue() {
		return rateLimitCode;
	}

	@Override
	public String getLabel() {
		return "RateLimit";
	}

	@Override
	public String getTableName() {
		return "rate_limit";
	}
}
