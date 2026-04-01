package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RoleDTO;

/**
 * Form class for Role entity.
 * 
 * This class is used to capture user input for Role operations
 * such as create and update.
 * 
 * Features:
 * - Defines role constants (Admin, Student, Faculty, Kiosk)
 * - Validates required fields like name and description
 * - Converts form data into RoleDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class RoleForm extends BaseForm {

	/**
	 * Role constants.
	 */
	public static final int ADMIN = 1;
	public static final int STUDENT = 2;
	public static final int FACULTY = 3;
	public static final int KIOSK = 4;

	/**
	 * Role name.
	 */
	@NotEmpty(message = "Name is required")
	private String name;

	/**
	 * Role description.
	 */
	@NotEmpty(message = "Description is required")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Converts form data into RoleDTO.
	 * 
	 * @return RoleDTO object
	 */
	@Override
	public BaseDTO getDto() {
		RoleDTO dto = initDTO(new RoleDTO());
		dto.setDescription(description);
		dto.setName(name);
		return dto;
	}
}