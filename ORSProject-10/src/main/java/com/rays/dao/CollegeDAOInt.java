package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.CollegeDTO;

/**
 * DAO Interface for College entity.
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
 * custom College-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface CollegeDAOInt extends BaseDAOInt<CollegeDTO> {

}