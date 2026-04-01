package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TimeTableDAOInt;
import com.rays.dto.TimeTableDTO;

/**
 * Service implementation for TimeTable entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for TimeTableDTO using TimeTableDAOInt.
 * 
 * Features:
 * - Handles timetable-related business logic
 * - Supports transactional operations
 * - Inherits generic service methods like add, update, delete, search, etc.
 * 
 * Annotated with @Service to indicate service layer component.
 * Annotated with @Transactional to manage database transactions.
 * 
 * @author Chaitanya Bhatt
 */
@Service
@Transactional
public class TimeTableServiceImpl extends BaseServiceImpl<TimeTableDTO, TimeTableDAOInt>
		implements TimeTableServiceInt {

}