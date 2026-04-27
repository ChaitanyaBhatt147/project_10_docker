package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RateLimitDTO;

@Repository
public class RateLimitDAOImpl extends BaseDAOImpl<RateLimitDTO> implements RateLimitDAOInt{

	@Override
	public Class<RateLimitDTO> getDTOClass() {
		return RateLimitDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(RateLimitDTO dto, CriteriaBuilder builder, Root<RateLimitDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getApiName())) {
			whereCondition.add(builder.like(qRoot.get("apiName"), dto.getApiName()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		if (!isEmptyString(dto.getRateLimitCode())) {
			whereCondition.add(builder.like(qRoot.get("rateLimitCode"), dto.getRateLimitCode()));
		}
		if (isNotNull(dto.getLimitPerMin())) {
			whereCondition.add(builder.equal(qRoot.get("limitPerMin"), dto.getLimitPerMin()));
		}
		return whereCondition;
	}

}
