package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DonationCampDTO;

@Repository
public class DonationCampDAOImpl extends BaseDAOImpl<DonationCampDTO> implements DonationCampDAOInt{

	@Override
	public Class<DonationCampDTO> getDTOClass() {
		return DonationCampDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DonationCampDTO dto, CriteriaBuilder builder,
			Root<DonationCampDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getCampName())) {
			whereCondition.add(builder.like(qRoot.get("campName"), dto.getCampName()));
		}
		if (isNotNull(dto.getCampDate())) {
			whereCondition.add(builder.equal(qRoot.get("campDate"), dto.getCampDate()));
		}
		if (!isEmptyString(dto.getOrganizer())) {
			whereCondition.add(builder.like(qRoot.get("organizer"), dto.getOrganizer()));
		}
		return whereCondition;
	}

}
