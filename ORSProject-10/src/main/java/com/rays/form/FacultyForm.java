package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FacultyDTO;

/**
 * Form class for Faculty entity.
 * 
 * This class is used to capture user input for Faculty operations
 * such as create and update.
 * 
 * Features:
 * - Validates required fields like name, DOB, gender, email, etc.
 * - Validates phone number format (10 digits)
 * - Ensures valid selection of college, course, and subject
 * - Converts form data into FacultyDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class FacultyForm extends BaseForm {

	/**
	 * First name of faculty.
	 */
	@NotEmpty(message = "First Name is required")
	private String firstName;

	/**
	 * Last name of faculty.
	 */
	@NotEmpty(message = "Last Name is required")
	private String lastName;

	/**
	 * Date of birth.
	 */
	@NotNull(message = "Date of birth is required")
	private Date dob;

	/**
	 * Gender.
	 */
	@NotEmpty(message = "Gender is required")
	private String gender;

	/**
	 * Phone number (must be 10 digits).
	 */
	@NotNull(message = "Phone No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNo;

	/**
	 * Email address.
	 */
	@NotEmpty(message = "Email ID is required")
	@Email
	private String email;

	/**
	 * Qualification.
	 */
	@NotEmpty(message = "Qualification is required")
	private String qualification;

	/**
	 * College ID (must be greater than 0).
	 */
	@NotNull(message = "College is required")
	@Min(1)
	private Long collegeId = 0L;

	/**
	 * College name.
	 */
	private String collegeName;

	/**
	 * Course ID (must be greater than 0).
	 */
	@NotNull(message = "Course is required")
	@Min(1)
	private Long courseId = 0L;

	/**
	 * Course name.
	 */
	private String courseName;

	/**
	 * Subject ID (must be greater than 0).
	 */
	@NotNull(message = "Subject is required")
	@Min(1)
	private Long subjectId = 0L;

	/**
	 * Subject name.
	 */
	private String subjectName;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * Converts form data into FacultyDTO.
	 * 
	 * @return FacultyDTO object
	 */
	@Override
	public BaseDTO getDto() {

		FacultyDTO dto = initDTO(new FacultyDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setPhoneNo(phoneNo);
		dto.setEmail(email);
		dto.setQualification(qualification);
		dto.setCollegeId(collegeId);
		dto.setCollegeName(collegeName);
		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setSubjectId(subjectId);
		dto.setSubjectName(subjectName);

		return dto;
	}
}