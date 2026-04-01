package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.UserDTO;

/**
 * DAO Interface for User entity.
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
 * custom User-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface UserDAOInt extends BaseDAOInt<UserDTO>{

}