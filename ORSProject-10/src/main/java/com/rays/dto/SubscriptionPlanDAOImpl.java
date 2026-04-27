package com.rays.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;

@Repository
public class SubscriptionPlanDAOImpl extends BaseDAOImpl<SubscriptionPlanDTO> implements SubscriptionPlanDAOInt{

	@Override
	public Class<SubscriptionPlanDTO> getDTOClass() {
		return SubscriptionPlanDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SubscriptionPlanDTO dto, CriteriaBuilder builder,
			Root<SubscriptionPlanDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getPlanName())) {
			whereCondition.add(builder.like(qRoot.get("planName"), dto.getPlanName()));
		}
		if (isNotNull(dto.getPrice())) {
			whereCondition.add(builder.equal(qRoot.get("price"), dto.getPrice()));
		}
		if (isNotNull(dto.getValidityDays())) {
			whereCondition.add(builder.equal(qRoot.get("validityDays"), dto.getValidityDays()));
		}
		return whereCondition;
	}

}
