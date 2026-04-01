package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CollegeDTO;

/**
 * DAO Implementation for College entity.
 * 
 * This class extends BaseDAOImpl to provide database operations
 * for CollegeDTO using JPA Criteria API.
 * 
 * Features:
 * - Dynamic search using multiple fields
 * - Supports filtering based on name, city, state, address, and phone number
 * 
 * Annotated with @Repository to indicate DAO layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Repository
public class CollegeDAOImpl extends BaseDAOImpl<CollegeDTO> implements CollegeDAOInt {

	/**
	 * Returns the DTO class type.
	 * 
	 * @return CollegeDTO class
	 */
	@Override
	public Class<CollegeDTO> getDTOClass() {
		return CollegeDTO.class;
	}

	/**
	 * Builds dynamic where clause for College search.
	 * 
	 * Filters applied:
	 * - Name (starts with)
	 * - City (starts with)
	 * - State (starts with)
	 * - Address (starts with)
	 * - Phone Number (starts with)
	 * 
	 * @param dto CollegeDTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(CollegeDTO dto, CriteriaBuilder builder, Root<CollegeDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (!isEmptyString(dto.getCity())) {
			whereCondition.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
		}

		if (!isEmptyString(dto.getState())) {
			whereCondition.add(builder.like(qRoot.get("state"), dto.getState() + "%"));
		}

		if (!isEmptyString(dto.getAddress())) {
			whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress() + "%"));
		}

		if (!isEmptyString(dto.getPhoneNo())) {
			whereCondition.add(builder.like(qRoot.get("phoneNo"), dto.getPhoneNo() + "%"));
		}

		return whereCondition;
	}

}