package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LoanDTO;

@Repository
public class LoanDAOImpl extends BaseDAOImpl<LoanDTO> implements LoanDAOInt{

	@Override
	public Class<LoanDTO> getDTOClass() {
		return LoanDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LoanDTO dto, CriteriaBuilder builder, Root<LoanDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isNotNull(dto.getLoanId())) {
			whereCondition.add(builder.equal(qRoot.get("loanId"), dto.getLoanId()));
		}
		if (!isNotNull(dto.getLoanAmount())) {
			whereCondition.add(builder.equal(qRoot.get("loanAmount"), dto.getLoanAmount()));
		}
		if (!isNotNull(dto.getIssueDate())) {
			whereCondition.add(builder.equal(qRoot.get("issueDate"), dto.getIssueDate()));
		}
		if (!isNotNull(dto.getInterestRate())) {
			whereCondition.add(builder.equal(qRoot.get("interestRate"), dto.getInterestRate()));
		}
		return whereCondition;
	}

}
