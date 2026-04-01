package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.RoleDTO;

/**
 * Service interface for Role entity.
 * 
 * This interface extends BaseServiceInt to provide standard CRUD operations
 * for RoleDTO and additional role-specific business methods.
 * 
 * Features:
 * - Find role by name
 * 
 * @author Chaitanya Bhatt
 */
public interface RoleServiceInt extends BaseServiceInt<RoleDTO> {

	/**
	 * Finds role by name.
	 * 
	 * @param name role name
	 * @param userContext user context
	 * @return RoleDTO object
	 */
	public RoleDTO findByName(String name, UserContext userContext);

}