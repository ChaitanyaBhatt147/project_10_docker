package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SubjectDAOInt;
import com.rays.dto.SubjectDTO;

/**
 * Service implementation for Subject entity.
 * 
 * This class extends BaseServiceImpl to provide standard CRUD operations
 * for SubjectDTO using SubjectDAOInt.
 * 
 * Features:
 * - Handles subject-related business logic
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
public class SubjectServiceImpl extends BaseServiceImpl<SubjectDTO, SubjectDAOInt> implements SubjectServiceInt {

}