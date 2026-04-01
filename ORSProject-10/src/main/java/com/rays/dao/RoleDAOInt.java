package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.RoleDTO;

/**
 * DAO Interface for Role entity.
 * 
 * This interface extends BaseDAOInt to inherit
 * generic CRUD operations such as:
 * - Add
 * - Update
 * - Delete
 * - Find by ID
 * - Search
 * 
 * It can be extended further to define
 * custom Role-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface RoleDAOInt extends BaseDAOInt<RoleDTO> {

}