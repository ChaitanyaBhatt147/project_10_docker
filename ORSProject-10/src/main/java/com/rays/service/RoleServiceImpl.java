package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.RoleDAOInt;
import com.rays.dto.RoleDTO;

/**
 * Service implementation for Role entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for RoleDTO using RoleDAOInt.
 * 
 * Additional Features:
 * - Find role by name
 * 
 * Annotated with @Service to indicate service layer component.
 * Annotated with @Transactional to manage database transactions.
 * 
 * @author Chaitanya Bhatt
 */
@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<RoleDTO, RoleDAOInt> implements RoleServiceInt {

	/**
	 * Finds role by name.
	 * 
	 * @param name role name
	 * @param userContext user context
	 * @return RoleDTO object
	 */
	@Transactional(readOnly = true)
	public RoleDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}
}