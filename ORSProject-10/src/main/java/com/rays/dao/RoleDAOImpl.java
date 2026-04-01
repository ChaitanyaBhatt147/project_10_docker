package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RoleDTO;

/**
 * DAO Implementation for Role entity.
 * 
 * This class extends BaseDAOImpl to provide database operations
 * for RoleDTO using JPA Criteria API.
 * 
 * Features:
 * - Dynamic search using ID and name
 * 
 * Annotated with @Repository to indicate DAO layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Repository
public class RoleDAOImpl extends BaseDAOImpl<RoleDTO> implements RoleDAOInt {

	/**
	 * Returns the DTO class type.
	 * 
	 * @return RoleDTO class
	 */
	@Override
	public Class<RoleDTO> getDTOClass() {
		return RoleDTO.class;
	}

	/**
	 * Builds dynamic where clause for Role search.
	 * 
	 * Filters applied:
	 * - ID (exact match)
	 * - Name (starts with)
	 * 
	 * @param dto RoleDTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(RoleDTO dto, CriteriaBuilder builder, Root<RoleDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getId())) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		return whereCondition;
	}
}