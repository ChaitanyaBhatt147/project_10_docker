package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UserDTO;

/**
 * Form class for User entity with complete validation.
 * 
 * This class is used to capture user input for User operations
 * such as create and update.
 * 
 * Features:
 * - Validates user details like name, email, password, etc.
 * - Ensures proper format for phone numbers and gender
 * - Applies strong password validation rules
 * - Converts form data into UserDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class UserForm extends BaseForm {

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
	 * Login ID (email address).
	 */
	@NotEmpty(message = "Login Id is required")
	@Email(message = "Invalid Email format")
	@Pattern(
		regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		message = "Invalid Email format"
	)
	private String loginId;

	/**
	 * User password (6-8 characters with at least one letter, number, and special character).
	 */
	@NotEmpty(message = "Password is required")
	@Size(min = 6, max = 8, message = "Password must be between 6 and 8 characters")
	@Pattern(
		regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&]).*$",
		message = "Password must contain at least one letter, one number and one special character"
	)
	private String password;

	/**
	 * Role ID associated with the user.
	 */
	@NotNull(message = "Role is required")
	@Min(value = 1, message = "Please select a valid role")
	private Long roleId;

	/**
	 * Role name of the user.
	 */
	private String roleName;

	/**
	 * Date of birth of the user.
	 */
	@NotNull(message = "Date of birth is required")
	private Date dob;

	/**
	 * Gender of the user.
	 */
	@NotEmpty(message = "Gender is required")
	@Pattern(regexp = "^(Male|Female|Other)$", message = "Invalid Gender")
	private String gender;

	/**
	 * Primary mobile number.
	 */
	@NotNull(message = "Mobile No is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid Mobile Number")
	private String phone;

	/**
	 * Alternate mobile number.
	 */
	@NotEmpty(message = "Alternate Mobile No is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid Alternate Mobile Number")
	private String alternateMobile;

	/**
	 * Status of the user.
	 */
	@NotEmpty(message = "Status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
	private String status;

	// ================== GETTERS & SETTERS ==================

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// ================== DTO CONVERSION ==================

	/**
	 * Converts form data into UserDTO.
	 * 
	 * @return UserDTO object
	 */
	@Override
	public BaseDTO getDto() {

		UserDTO dto = initDTO(new UserDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setLoginId(loginId);
		dto.setPassword(password);
		dto.setRoleId(roleId);
		dto.setRoleName(roleName);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setPhone(phone);
		dto.setAlternateMobile(alternateMobile);
		dto.setStatus(status);

		return dto;
	}
}