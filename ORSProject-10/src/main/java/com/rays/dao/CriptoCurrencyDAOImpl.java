package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CriptoCurrencyDTO;

@Repository
public class CriptoCurrencyDAOImpl extends BaseDAOImpl<CriptoCurrencyDTO> implements CriptoCurrencyDAOInt {

	@Override
	public Class<CriptoCurrencyDTO> getDTOClass() {
		return CriptoCurrencyDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CriptoCurrencyDTO dto, CriteriaBuilder builder,
			Root<CriptoCurrencyDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getCurrencyType())) {
			whereCondition.add(builder.like(qRoot.get("currencyType"), dto.getCurrencyType()));
		}
		if (!isEmptyString(dto.getWalletAddress())) {
			whereCondition.add(builder.like(qRoot.get("walletAddress"), dto.getWalletAddress()));
		}
		if (isNotNull(dto.getBalance())) {
			System.out.println("balance ====>" +dto.getBalance());
			whereCondition.add(builder.equal(qRoot.get("balance"), dto.getBalance()));
		}
		if (isNotNull(dto.getLastTransation())) {
			whereCondition.add(builder.equal(qRoot.get("lastTransation"), dto.getLastTransation()));
		}
		return whereCondition;
	}

}
