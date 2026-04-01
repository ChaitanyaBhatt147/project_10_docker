package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CourseDTO;

/**
 * DAO Implementation for Course entity.
 * 
 * This class extends BaseDAOImpl to provide database operations
 * for CourseDTO using JPA Criteria API.
 * 
 * Features:
 * - Dynamic search using multiple fields
 * - Supports filtering based on name, description, and duration
 * 
 * Annotated with @Repository to indicate DAO layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Repository
public class CourseDAOImpl extends BaseDAOImpl<CourseDTO> implements CourseDAOInt {

	/**
	 * Returns the DTO class type.
	 * 
	 * @return CourseDTO class
	 */
	@Override
	public Class<CourseDTO> getDTOClass() {
		return CourseDTO.class;
	}

	/**
	 * Builds dynamic where clause for Course search.
	 * 
	 * Filters applied:
	 * - Name (starts with)
	 * - Description (starts with)
	 * - Duration (starts with)
	 * 
	 * @param dto CourseDTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(CourseDTO dto, CriteriaBuilder builder, Root<CourseDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (!isEmptyString(dto.getDescription())) {
			whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
		}

		if (!isEmptyString(dto.getDuration())) {
			whereCondition.add(builder.like(qRoot.get("duration"), dto.getDuration() + "%"));
		}

		return whereCondition;
	}

}