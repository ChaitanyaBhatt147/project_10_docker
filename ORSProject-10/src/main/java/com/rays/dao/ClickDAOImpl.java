package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ClickDTO;

@Repository
public class ClickDAOImpl extends BaseDAOImpl<ClickDTO> implements ClickDAOInt{

	@Override
	public Class<ClickDTO> getDTOClass() {
		return ClickDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ClickDTO dto, CriteriaBuilder builder, Root<ClickDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getClickCode())) {
			whereCondition.add(builder.like(qRoot.get("clickCode"), dto.getClickCode()));
		}
		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

}
