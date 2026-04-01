package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.TimeTableDTO;

/**
 * DAO Interface for TimeTable entity.
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
 * custom TimeTable-specific database operations.
 * 
 * @author Chaitanya Bhatt
 */
public interface TimeTableDAOInt extends BaseDAOInt<TimeTableDTO> {

}