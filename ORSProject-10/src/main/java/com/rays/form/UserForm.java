package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UserDTO;

/**
 * Form class for User entity.
 * 
 * This class is used to capture user input for User operations
 * such as create and update.
 * 
 * Features:
 * - Validates required fields like name, login ID, password, etc.
 * - Validates mobile number format (10 digits)
 * - Ensures valid role selection
 * - Converts form data into UserDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class UserForm extends BaseForm {

	/**
	 * First name of the user.
	 */
	@NotEmpty(message = "First Name is required")
	private String firstName;

	/**
	 * Last name of the user.
	 */
	@NotEmpty(message = "Last Name is required")
	private String lastName;

	/**
	 * Login ID of the user.
	 */
	@NotEmpty(message = "Login Id is required")
	private String loginId;

	/**
	 * Password of the user.
	 */
	@NotEmpty(message = "Password is required")
	private String password;

	/**
	 * Role ID (must be greater than 0).
	 */
	@NotNull(message = "Role is required")
	@Min(1)
	private Long roleId;

	/**
	 * Role name.
	 */
	private String roleName = null;

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
	 * Mobile number (must be 10 digits).
	 */
	@NotNull(message = "Mobile No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	/**
	 * Alternate mobile number.
	 */
	@NotEmpty(message = "Alternate Mobile No is required")
	private String alternateMobile;

	/**
	 * User status.
	 */
	@NotEmpty(message = "Status is required")
	private String status;

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