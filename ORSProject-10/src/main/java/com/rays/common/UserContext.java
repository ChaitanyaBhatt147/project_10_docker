package com.rays.common;

import com.rays.dto.UserDTO;

/**
 * UserContext class holds information about the currently logged-in user.
 * 
 * This class is used across the application to:
 * - Maintain user session details
 * - Provide user information to DAO/Service layers
 * - Track audit fields (createdBy, modifiedBy)
 * 
 * It is typically stored in session or thread-local context.
 * 
 * @author Chaitanya Bhatt
 */
public class UserContext {

	/**
	 * Unique ID of the user.
	 */
	private Long userId = 0L;

	/**
	 * Login ID (username/email) of the user.
	 */
	private String loginId = "root";

	/**
	 * Name of the user.
	 */
	private String name = null;

	/**
	 * Role ID assigned to the user.
	 */
	private Long roleId = 0L;

	/**
	 * Role name assigned to the user.
	 */
	private String roleName = "root";

	/**
	 * Complete UserDTO object.
	 */
	private UserDTO userDTO = null;

	/**
	 * Default constructor.
	 */
	public UserContext() {
	}

	/**
	 * Parameterized constructor to initialize UserContext from UserDTO.
	 * 
	 * @param dto UserDTO object
	 */
	public UserContext(UserDTO dto) {
		this.userDTO = dto;
		this.userId = dto.getId();
		this.loginId = dto.getLoginId();
		this.name = dto.getName();
		this.roleId = dto.getRoleId();
		this.roleName = dto.getRoleName();
	}

	/**
	 * Gets user ID.
	 * 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Sets user ID.
	 * 
	 * @param userId unique identifier
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Gets login ID.
	 * 
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * Sets login ID.
	 * 
	 * @param loginId username/email
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * Gets user name.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets user name.
	 * 
	 * @param name user name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets role ID.
	 * 
	 * @return roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * Sets role ID.
	 * 
	 * @param roleId role identifier
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * Gets role name.
	 * 
	 * @return roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets role name.
	 * 
	 * @param roleName role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Gets UserDTO object.
	 * 
	 * @return userDTO
	 */
	public UserDTO getUserDTO() {
		return userDTO;
	}

	/**
	 * Sets UserDTO object.
	 * 
	 * @param userDTO user data transfer object
	 */
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
}