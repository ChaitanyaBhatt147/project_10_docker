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
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;
import com.rays.dto.FacultyDTO;
import com.rays.dto.SubjectDTO;

/**
 * DAO Implementation for Faculty entity.
 * 
 * This class extends BaseDAOImpl to provide database operations
 * for FacultyDTO using JPA Criteria API.
 * 
 * Features:
 * - Populates related entity names (College, Course, Subject)
 * - Dynamic search using multiple fields
 * 
 * Annotated with @Repository to indicate DAO layer component.
 * 
 * @author Chaitanya Bhatt
 */
@Repository
public class FacultyDAOImpl extends BaseDAOImpl<FacultyDTO> implements FacultyDAOInt {

	/**
	 * DAO for College entity.
	 */
	@Autowired
	CollegeDAOInt collegeDao;

	/**
	 * DAO for Course entity.
	 */
	@Autowired
	CourseDAOInt courseDao;

	/**
	 * DAO for Subject entity.
	 */
	@Autowired
	SubjectDAOInt subjectDao;

	/**
	 * Returns the DTO class type.
	 * 
	 * @return FacultyDTO class
	 */
	@Override
	public Class<FacultyDTO> getDTOClass() {
		return FacultyDTO.class;
	}

	/**
	 * Populates related entity data such as:
	 * - College Name
	 * - Course Name
	 * - Subject Name
	 * 
	 * @param dto FacultyDTO object
	 * @param userContext current user context
	 */
	@Override
	protected void populate(FacultyDTO dto, UserContext userContext) {

		if (dto.getCollegeId() > 0) {
			CollegeDTO collegeDto = collegeDao.findByPK(dto.getCollegeId(), userContext);
			dto.setCollegeName(collegeDto.getName());
		}
		if (dto.getCourseId() > 0) {
			CourseDTO courseDto = courseDao.findByPK(dto.getCourseId(), userContext);
			dto.setCourseName(courseDto.getName());
		}
		if (dto.getSubjectId() > 0) {
			SubjectDTO subjectDto = subjectDao.findByPK(dto.getSubjectId(), userContext);
			dto.setSubjectName(subjectDto.getName());
		}
	}

	/**
	 * Builds dynamic where clause for Faculty search.
	 * 
	 * Filters applied:
	 * - First Name (starts with)
	 * - Email (starts with)
	 * - College Name (starts with)
	 * - Course Name (starts with)
	 * - Subject Name (starts with)
	 * 
	 * @param dto FacultyDTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(FacultyDTO dto, CriteriaBuilder builder, Root<FacultyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getFirstName())) {
			whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));
		}
		
		if (!isEmptyString(dto.getEmail())) {
			whereCondition.add(builder.like(qRoot.get("email"), dto.getEmail() + "%"));
		}

		if (!isEmptyString(dto.getCollegeName())) {
			whereCondition.add(builder.like(qRoot.get("collegeName"), dto.getCollegeName() + "%"));
		}

		if (!isEmptyString(dto.getCourseName())) {
			whereCondition.add(builder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}

		if (!isEmptyString(dto.getSubjectName())) {
			whereCondition.add(builder.like(qRoot.get("subjectName"), dto.getSubjectName() + "%"));
		}

		return whereCondition;
	}

}