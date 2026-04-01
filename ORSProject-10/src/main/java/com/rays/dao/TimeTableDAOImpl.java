package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;

/**
 * DAO Implementation for TimeTable entity.
 * 
 * This class extends BaseDAOImpl to provide database operations
 * for TimeTableDTO using JPA Criteria API.
 * 
 * Features:
 * - Populates subject and course names
 * - Dynamic search using subject name and course name
 * 
 * Annotated with @Repository to indicate DAO layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Repository
public class TimeTableDAOImpl extends BaseDAOImpl<TimeTableDTO> implements TimeTableDAOInt {

	/**
	 * DAO for Subject entity.
	 */
	@Autowired
	SubjectDAOInt subjectService;

	/**
	 * DAO for Course entity.
	 */
	@Autowired
	CourseDAOInt courseService;

	/**
	 * Returns the DTO class type.
	 * 
	 * @return TimeTableDTO class
	 */
	@Override
	public Class<TimeTableDTO> getDTOClass() {
		return TimeTableDTO.class;
	}

	/**
	 * Populates additional fields such as subject name and course name.
	 * 
	 * @param dto TimeTableDTO object
	 * @param userContext current user context
	 */
	@Override
	protected void populate(TimeTableDTO dto, UserContext userContext) {

		SubjectDTO subjectDto = subjectService.findByPK(dto.getSubjectId(), userContext);
		if (subjectDto != null) {
			dto.setSubjectName(subjectDto.getName());
		}

		CourseDTO courseDto = courseService.findByPK(dto.getCourseId(), userContext);
		if (courseDto != null) {
			dto.setCourseName(courseDto.getName());
		}
	}

	/**
	 * Builds dynamic where clause for TimeTable search.
	 * 
	 * Filters applied:
	 * - Subject Name (starts with)
	 * - Course Name (starts with)
	 * 
	 * @param dto TimeTableDTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(TimeTableDTO dto, CriteriaBuilder builder, Root<TimeTableDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSubjectName())) {
			whereCondition.add(builder.like(qRoot.get("subjectName"), dto.getSubjectName() + "%"));
		}

		if (!isEmptyString(dto.getCourseName())) {
			whereCondition.add(builder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}

		return whereCondition;
	}
}