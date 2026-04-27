package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BranchManagerDTO;

@Repository
public class BranchManagerDAOImpl extends BaseDAOImpl<BranchManagerDTO> implements BranchManagerDAOInt{

	@Override
	public Class<BranchManagerDTO> getDTOClass() {
		return BranchManagerDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BranchManagerDTO dto, CriteriaBuilder builder,
			Root<BranchManagerDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getBranchName())) {
			whereCondition.add(builder.like(qRoot.get("branchName"), dto.getBranchName()));
		}
		if (!isEmptyString(dto.getManagerName())) {
			whereCondition.add(builder.like(qRoot.get("managerName"), dto.getManagerName()));
		}
		if (!isEmptyString(dto.getContactNumber())) {
			whereCondition.add(builder.like(qRoot.get("contactNumber"), dto.getContactNumber()));
		}
		return whereCondition;
	}

}
