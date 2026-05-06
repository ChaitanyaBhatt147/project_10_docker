package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.JobDTO;

@Repository
public class JobDAOImpl extends BaseDAOImpl<JobDTO> implements JobDAOInt{

	@Override
	public Class<JobDTO> getDTOClass() {
		return JobDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(JobDTO dto, CriteriaBuilder builder, Root<JobDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();
		if (!isEmptyString(dto.getJobCode())) {
			whereCondition.add(builder.like(qRoot.get("jobCode"), dto.getJobCode()));
		}
		if (!isEmptyString(dto.getJobName())) {
			whereCondition.add(builder.like(qRoot.get("jobName"), dto.getJobName()));
		}
		if (!isEmptyString(dto.getCronExpression())) {
			whereCondition.add(builder.like(qRoot.get("CronExpression"), dto.getCronExpression()));
		}
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

}
