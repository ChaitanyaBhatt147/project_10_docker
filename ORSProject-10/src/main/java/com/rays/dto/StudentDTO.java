package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for Student entity.
 * 
 * This class represents student details in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores student personal and academic details
 * - Maintains relationship with College
 * - Provides unique key and label for identification
 * 
 * Mapped to table: st_student
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_student")
public class StudentDTO extends BaseDTO {

	/**
	 * Enrollment number of the student.
	 */
	@Column(name = "enrol_no", length = 20)
	private String enrolNo;

	/**
	 * First name of the student.
	 */
	@Column(name = "first_name", length = 50)
	private String firstName;

	/**
	 * Last name of the student.
	 */
	@Column(name = "last_name", length = 50)
	private String lastName;

	/**
	 * Date of birth.
	 */
	@Column(name = "dob")
	private Date dob;

	/**
	 * Phone number.
	 */
	@Column(name = "phone_no", length = 15)
	private String phoneNo;

	/**
	 * Email address.
	 */
	@Column(name = "email", length = 50)
	private String email;

	/**
	 * College ID (foreign key).
	 */
	@Column(name = "college_id")
	private Long collegeId;

	/**
	 * College name.
	 */
	@Column(name = "college_name", length = 50)
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
	 * Returns unique key.
	 * 
	 * @return "enrolNo"
	 */
	@Override
	public String getUniqueKey() {
		return "enrolNo";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return enrollment number
	 */
	@Override
	public String getUniqueValue() {
		return enrolNo;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "Enroll No"
	 */
	@Override
	public String getLabel() {
		return "Enroll No";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "Student"
	 */
	@Override
	public String getTableName() {
		return "Student";
	}

	/**
	 * Returns value for dropdown.
	 * 
	 * @return full name of student
	 */
	@Override
	public String getValue() {
		return firstName + " " + lastName;
	}
}