package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_branch_manager")
public class BranchManagerDTO extends BaseDTO{
	@Column(name = "manager_name")
	private String managerName;
	
	@Column(name = "branch_name")
	private String branchName;
	
	@Column(name = "contact_number")
	private String contactNumber;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "managerName";
	}

	@Override
	public String getUniqueValue() {
		return managerName;
	}

	@Override
	public String getLabel() {
		return "Manager Name";
	}

	@Override
	public String getTableName() {
		return "Branch Manager";
	}
}
