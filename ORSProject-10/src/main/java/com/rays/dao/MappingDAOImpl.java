package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MappingDTO;

@Repository
public class MappingDAOImpl extends BaseDAOImpl<MappingDTO> implements MappingDAOInt{

	@Override
	public Class<MappingDTO> getDTOClass() {
		return MappingDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MappingDTO dto, CriteriaBuilder builder, Root<MappingDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getMappingCode())) {
			whereCondition.add(builder.like(qRoot.get("mappingCode"), dto.getMappingCode()));
		}
		if (!isEmptyString(dto.getSourseField())) {
			whereCondition.add(builder.like(qRoot.get("sourseField"), dto.getSourseField()));
		}
		if (!isEmptyString(dto.getTargetField())) {
			whereCondition.add(builder.like(qRoot.get("targetField"), dto.getTargetField()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

}
