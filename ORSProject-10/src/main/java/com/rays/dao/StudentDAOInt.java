package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.StudentDTO;

/**
 * DAO Interface for Student entity.
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
 * custom Student-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface StudentDAOInt extends BaseDAOInt<StudentDTO> {

}