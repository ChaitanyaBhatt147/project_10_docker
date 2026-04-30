package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Form class for My Profile functionality.
 * 
 * This class is used to capture user input for updating
 * personal profile details.
 * 
 * Features:
 * - Validates required fields like first name, last name, login ID, and gender
 * - Validates mobile number format (10 digits)
 * - Ensures date of birth is provided
 * 
 * @author Chaitanya Bhatt
 */
public class MyProfileForm {

	/**
	 * First name of the user.
	 */
	@NotEmpty(message = "First Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "First Name must contain only alphabets")
	private String firstName;

	/**
	 * Last name of the user.
	 */
	@NotEmpty(message = "Last Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Last Name must contain only alphabets")
	private String lastName;

	/**
	 * Login ID of the user.
	 */
	@NotEmpty(message = "Login Id is required")
	@Pattern(
		regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		message = "Invalid Email format"
	)
	private String loginId;

	/**
	 * Gender of the user.
	 */
	@NotEmpty(message = "Gender is required")
	@Pattern(regexp = "^(Male|Female|Other)$", message = "Invalid Gender")
	private String gender;

	/**
	 * Mobile number (must be 10 digits).
	 */
	@NotEmpty(message = "Mobile No is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid Mobile Number")
	private String phone;

	/**
	 * Date of birth.
	 */
	@NotNull(message = "Date of birth is required")
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}