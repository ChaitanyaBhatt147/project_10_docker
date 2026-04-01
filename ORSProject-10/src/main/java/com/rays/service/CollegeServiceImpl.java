package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CollegeDAOInt;
import com.rays.dto.CollegeDTO;

/**
 * Service implementation for College entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for CollegeDTO using CollegeDAOInt.
 * 
 * Features:
 * - Handles college-related business logic
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
public class CollegeServiceImpl extends BaseServiceImpl<CollegeDTO, CollegeDAOInt> implements CollegeServiceInt {

}