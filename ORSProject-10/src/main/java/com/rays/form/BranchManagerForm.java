package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BranchManagerDTO;

/**
 * Form class for BranchManager entity.
 * 
 * This class is used to capture user input for Branch Manager operations
 * such as create and update.
 * 
 * Features:
 * - Validates manager name (alphabets only)
 * - Validates branch name (alphanumeric)
 * - Validates contact number (10-digit Indian format)
 * - Converts form data into BranchManagerDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class BranchManagerForm extends BaseForm {

	/**
	 * Name of the branch manager.
	 */
	@NotEmpty(message = "Manager Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Manager Name must contain only alphabets")
	private String managerName;

	/**
	 * Name of the branch.
	 */
	@NotEmpty(message = "Branch Name is required")
	@Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Branch Name must be valid")
	private String branchName;

	/**
	 * Contact number of the branch manager.
	 */
	@NotEmpty(message = "Contact Number is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid Contact Number")
	private String contactNumber;

	// ================== GETTERS & SETTERS ==================

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

	// ================== DTO CONVERSION ==================

	/**
	 * Converts form data into BranchManagerDTO.
	 * 
	 * @return BranchManagerDTO object
	 */
	@Override
	public BaseDTO getDto() {
		BranchManagerDTO dto = initDTO(new BranchManagerDTO());
		dto.setBranchName(branchName);
		dto.setManagerName(managerName);
		dto.setContactNumber(contactNumber);
		return dto;
	}
}