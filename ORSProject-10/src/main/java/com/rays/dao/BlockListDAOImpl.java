package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BlockListDTO;

@Repository
public class BlockListDAOImpl extends BaseDAOImpl<BlockListDTO> implements BlockListDAOInt{

	@Override
	public Class<BlockListDTO> getDTOClass() {
		return BlockListDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BlockListDTO dto, CriteriaBuilder builder, Root<BlockListDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getBlockCode())) {
			whereCondition.add(builder.like(qRoot.get("blockCode"), dto.getBlockCode()));
		}
		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName()));
		}
		if (!isEmptyString(dto.getReason())) {
			whereCondition.add(builder.like(qRoot.get("reason"), dto.getReason()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

}
