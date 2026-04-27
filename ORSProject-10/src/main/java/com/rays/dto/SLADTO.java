package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "SLA")
public class SLADTO extends BaseDTO{
	@Column(name = "slaCode")
	private String slaCode;
	@Column(name = "serviceName")
	private String serviceName;
	@Column(name = "responseTime")
	private Integer responseTime;
	@Column(name = "status")
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
	public String getKey() {
		return status;
	}

	@Override
	public String getValue() {
		return status;
	}

	@Override
	public String getUniqueKey() {
		return "slaCode";
	}

	@Override
	public String getUniqueValue() {
		return slaCode;
	}

	@Override
	public String getLabel() {
		return "SLA";
	}

	@Override
	public String getTableName() {
		return "SLA";
	}
}
