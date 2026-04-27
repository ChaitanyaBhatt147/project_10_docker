package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CredentialDTO;

@Repository
public class CredentialDAOImpl extends BaseDAOImpl<CredentialDTO> implements CredentialDAOInt{

	@Override
	public Class<CredentialDTO> getDTOClass() {
		return CredentialDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CredentialDTO dto, CriteriaBuilder builder, Root<CredentialDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getCredentialCode())) {
			whereCondition.add(builder.like(qRoot.get("credentialCode"), dto.getCredentialCode()));
		}
		if (!isEmptyString(dto.getUsername())){
			whereCondition.add(builder.like(qRoot.get("username"), dto.getUsername()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		if (!isEmptyString(dto.getType())) {
			whereCondition.add(builder.like(qRoot.get("type"), dto.getType()));
		}
		return whereCondition;
	}

}
