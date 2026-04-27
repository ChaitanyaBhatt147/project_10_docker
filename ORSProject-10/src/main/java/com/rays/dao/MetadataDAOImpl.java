package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MetadataDTO;

@Repository
public class MetadataDAOImpl extends BaseDAOImpl<MetadataDTO> implements MetadataDAOInt{

	@Override
	public Class<MetadataDTO> getDTOClass() {
		return MetadataDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MetadataDTO dto, CriteriaBuilder builder, Root<MetadataDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getFileMetaCode())) {
			whereCondition.add(builder.like(qRoot.get("fileMetaCode"), dto.getFileMetaCode()));
		}
		if (!isEmptyString(dto.getFileName())) {
			whereCondition.add(builder.like(qRoot.get("fileName"), dto.getFileName()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		if (isNotNull(dto.getSize())) {
			whereCondition.add(builder.equal(qRoot.get("size"), dto.getSize()));
		}
		return whereCondition;
	}

}
