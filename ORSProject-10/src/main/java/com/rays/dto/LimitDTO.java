package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Limit_table")
public class LimitDTO extends BaseDTO{
	@Column(name = "limit_code")
	private String limitCode;
	@Column(name = "limit_name")
	private String limitName;
	@Column(name = "max_value")
	private Integer maxValue;
	@Column(name = "status")
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

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "limitCode";
	}

	@Override
	public String getUniqueValue() {
		return limitCode;
	}

	@Override
	public String getLabel() {
		return "Limit";
	}

	@Override
	public String getTableName() {
		return "Limit";
	}
}
