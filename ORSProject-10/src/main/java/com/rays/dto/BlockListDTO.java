package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "BlockList")
public class BlockListDTO extends BaseDTO{
	@Column(name = "blockCode")
	private String blockCode;
	@Column(name = "userName")
	private String userName;
	@Column(name = "reason")
	private String reason;
	@Column(name = "status")
	private String status;

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
		return "blockCode";
	}

	@Override
	public String getUniqueValue() {
		return blockCode;
	}

	@Override
	public String getLabel() {
		return "BlockList";
	}

	@Override
	public String getTableName() {
		return "BlockList";
	}
}
