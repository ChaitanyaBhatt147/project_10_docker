package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.CourseDTO;

/**
 * DAO Interface for Course entity.
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
 * custom Course-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface CourseDAOInt extends BaseDAOInt<CourseDTO> {

}