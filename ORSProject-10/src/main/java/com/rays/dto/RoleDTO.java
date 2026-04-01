package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for Role entity.
 * 
 * This class represents user roles in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores role name and description
 * - Used for role-based access control
 * - Provides unique key and label for dropdown usage
 * 
 * Mapped to table: st_role
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_role")
public class RoleDTO extends BaseDTO {

	/**
	 * Role name.
	 */
	@Column(name = "name", length = 50)
	private String name = null;

	/**
	 * Role description.
	 */
	@Column(name = "description", length = 100)
	private String description = null;

	/**
	 * @return role name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name role name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description role description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns unique key.
	 * 
	 * @return "name"
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return role name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "Role Name"
	 */
	@Override
	public String getLabel() {
		return "Role Name";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "Role"
	 */
	@Override
	public String getTableName() {
		return "Role";
	}

	/**
	 * Returns value for dropdown.
	 * 
	 * @return role name
	 */
	@Override
	public String getValue() {
		return name;
	}
}