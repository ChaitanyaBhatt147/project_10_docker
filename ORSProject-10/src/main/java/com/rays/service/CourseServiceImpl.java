package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CourseDAOInt;
import com.rays.dto.CourseDTO;

/**
 * Service implementation for Course entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for CourseDTO using CourseDAOInt.
 * 
 * Features:
 * - Handles course-related business logic
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
public class CourseServiceImpl extends BaseServiceImpl<CourseDTO, CourseDAOInt> implements CourseServiceInt {

}