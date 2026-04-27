package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BranchManagerDTO;

public class BranchManagerForm extends BaseForm{
	@NotEmpty(message = "Manager Name is required")
	private String managerName;
	@NotEmpty(message = "Branch Name is required")
	private String branchName;
	@NotEmpty(message = "Contact Number is required")
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
	public BaseDTO getDto() {
		BranchManagerDTO dto = initDTO(new BranchManagerDTO());
		dto.setBranchName(branchName);
		dto.setManagerName(managerName);
		dto.setContactNumber(contactNumber);
		return dto;
	}
}
