package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.SubjectDTO;

/**
 * DAO Interface for Subject entity.
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
 * custom Subject-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface SubjectDAOInt extends BaseDAOInt<SubjectDTO> {

}