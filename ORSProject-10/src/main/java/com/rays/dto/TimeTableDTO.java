package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for TimeTable entity.
 * 
 * This class represents timetable details for exams in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores exam details such as course, subject, date, time, and semester
 * - Maintains relationships with Course and Subject
 * - Provides unique key for identification
 * 
 * Mapped to table: st_timetable
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_timetable")
public class TimeTableDTO extends BaseDTO {

	/**
	 * Course ID (foreign key).
	 */
	@Column(name = "course_id", length = 50)
	private long courseId;

	/**
	 * Course name.
	 */
	@Column(name = "course_name", length = 50)
	private String courseName;

	/**
	 * Subject ID (foreign key).
	 */
	@Column(name = "subject_id", length = 50)
	private long subjectId;

	/**
	 * Subject name.
	 */
	@Column(name = "subject_name", length = 50)
	private String subjectName;

	/**
	 * Exam date.
	 */
	@Column(name = "exam_date")
	private Date examDate;

	/**
	 * Exam time.
	 */
	@Column(name = "exam_time", length = 50)
	private String examTime;

	/**
	 * Semester.
	 */
	@Column(name = "semester", length = 30)
	private String semester;

	/**
	 * Description.
	 */
	@Column(name = "description", length = 50)
	private String description;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns unique key.
	 * 
	 * @return "courseName"
	 */
	@Override
	public String getUniqueKey() {
		return "courseName";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return course name
	 */
	@Override
	public String getUniqueValue() {
		return courseName;
	}

	/**
	 * Returns label (not implemented).
	 * 
	 * @return null
	 */
	@Override
	public String getLabel() {
		return null;
	}

	/**
	 * Returns table name.
	 * 
	 * @return "TimeTable"
	 */
	@Override
	public String getTableName() {
		return "TimeTable";
	}

	/**
	 * Returns dropdown value (not implemented).
	 * 
	 * @return null
	 */
	@Override
	public String getValue() {
		return null;
	}
}