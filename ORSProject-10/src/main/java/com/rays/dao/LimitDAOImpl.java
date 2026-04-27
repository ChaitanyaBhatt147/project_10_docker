package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LimitDTO;

@Repository
public class LimitDAOImpl extends BaseDAOImpl<LimitDTO> implements LimitDAOInt{

	@Override
	public Class<LimitDTO> getDTOClass() {
		return LimitDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LimitDTO dto, CriteriaBuilder builder, Root<LimitDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getLimitCode())) {
			whereCondition.add(builder.like(qRoot.get("limitCode"), dto.getLimitCode()));
		}
		if (!isEmptyString(dto.getLimitName())) {
			whereCondition.add(builder.like(qRoot.get("limitName"), dto.getLimitName()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		if (!isNotNull(dto.getMaxValue())) {
			whereCondition.add(builder.equal(qRoot.get("maxValue"), dto.getMaxValue()));
		}
		return whereCondition;
	}

}
