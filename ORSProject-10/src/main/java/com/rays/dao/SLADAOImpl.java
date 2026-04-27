package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SLADTO;

@Repository
public class SLADAOImpl extends BaseDAOImpl<SLADTO> implements SLADAOInt{

	@Override
	public Class<SLADTO> getDTOClass() {
		return SLADTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SLADTO dto, CriteriaBuilder builder, Root<SLADTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getSlaCode())) {
			whereCondition.add(builder.like(qRoot.get("slaCode"), dto.getSlaCode()));
		}
		if (!isEmptyString(dto.getServiceName())) {
			whereCondition.add(builder.like(qRoot.get("serviceName"), dto.getServiceName()));
		}
		if (isNotNull(dto.getResponseTime())) {
			whereCondition.add(builder.equal(qRoot.get("responseTime"), dto.getResponseTime()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

}
