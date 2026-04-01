package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;

/**
 * Form class for College entity.
 * 
 * This class is used to capture user input for College operations
 * such as create and update.
 * 
 * Features:
 * - Validates required fields like name, address, state, city
 * - Validates phone number format (10 digits)
 * - Converts form data into CollegeDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class CollegeForm extends BaseForm {

	/**
	 * College name.
	 */
	@NotEmpty(message = "Name is required")
	private String name;

	/**
	 * College address.
	 */
	@NotEmpty(message = "Address is required")
	private String address;

	/**
	 * State of the college.
	 */
	@NotEmpty(message = "State is required")
	private String state;

	/**
	 * City of the college.
	 */
	@NotEmpty(message = "City is required")
	private String city;

	/**
	 * Phone number (must be 10 digits).
	 */
	@NotNull(message = "Phone No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Converts form data into CollegeDTO.
	 * 
	 * @return CollegeDTO object
	 */
	@Override
	public BaseDTO getDto() {

		CollegeDTO dto = initDTO(new CollegeDTO());
		dto.setName(name);
		dto.setAddress(address);
		dto.setState(state);
		dto.setCity(city);
		dto.setPhoneNo(phoneNo);

		return dto;
	}
}