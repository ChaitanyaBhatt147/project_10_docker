package com.rays.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "click")
public class ClickDTO extends BaseDTO {
	@Column(name = "click_code")
	private String clickCode;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "click_time")
	private Timestamp clickTime;
	@Column(name = "status")
	private String status;

	public String getClickCode() {
		return clickCode;
	}

	public void setClickCode(String clickCode) {
		this.clickCode = clickCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getClickTime() {
		return clickTime;
	}

	public void setClickTime(Timestamp clickTime) {
		this.clickTime = clickTime;
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
		return "clickCode";
	}

	@Override
	public String getUniqueValue() {
		return clickCode;
	}

	@Override
	public String getLabel() {
		return "click";
	}

	@Override
	public String getTableName() {
		return "click";
	}
}
