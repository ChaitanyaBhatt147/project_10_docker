package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StudentDTO;

/**
 * Form class for Student entity.
 * 
 * This class is used to capture user input for Student operations
 * such as create and update.
 * 
 * Features:
 * - Validates required fields like enrollment number, name, DOB, email, etc.
 * - Validates phone number format (10 digits)
 * - Ensures valid college selection
 * - Converts form data into StudentDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class StudentForm extends BaseForm {

	/**
	 * Enrollment number of the student.
	 */
	@NotEmpty(message = "Enroll No is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Enroll No must be alphanumeric")
	private String enrolNo;

	/**
	 * First name of the student.
	 */
	@NotEmpty(message = "First Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "First Name must contain only alphabets")
	private String firstName;

	/**
	 * Last name of the student.
	 */
	@NotEmpty(message = "Last Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Last Name must contain only alphabets")
	private String lastName;

	/**
	 * Date of birth.
	 */
	@NotNull(message = "Date of birth is required")
	private Date dob;

	/**
	 * Phone number (must be 10 digits).
	 */
	@NotNull(message = "Phone No is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid Phone Number")
	private String phoneNo;

	/**
	 * Email address.
	 */
	@NotEmpty(message = "Email ID is required")
	@Email(message = "Invalid Email format")
	@Pattern(
		regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		message = "Invalid Email format"
	)
	private String email;

	/**
	 * College ID (must be greater than 0).
	 */
	@NotNull(message = "College Name is required")
	@Min(1)
	private Long collegeId;

	/**
	 * College name.
	 */
	private String collegeName;

	public String getEnrolNo() {
		return enrolNo;
	}

	public void setEnrolNo(String enrolNo) {
		this.enrolNo = enrolNo;
	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * Converts form data into StudentDTO.
	 * 
	 * @return StudentDTO object
	 */
	@Override
	public BaseDTO getDto() {

		StudentDTO dto = initDTO(new StudentDTO());

		dto.setEnrolNo(enrolNo);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(dob);
		dto.setPhoneNo(phoneNo);
		dto.setEmail(email);
		dto.setCollegeId(collegeId);
		dto.setCollegeName(collegeName);

		return dto;
	}
}