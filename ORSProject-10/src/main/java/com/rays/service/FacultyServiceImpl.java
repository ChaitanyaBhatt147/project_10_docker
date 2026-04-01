package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FacultyDAOInt;
import com.rays.dto.FacultyDTO;

/**
 * Service implementation for Faculty entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for FacultyDTO using FacultyDAOInt.
 * 
 * Features:
 * - Handles faculty-related business logic
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
public class FacultyServiceImpl extends BaseServiceImpl<FacultyDTO, FacultyDAOInt> implements FacultyServiceInt {

}