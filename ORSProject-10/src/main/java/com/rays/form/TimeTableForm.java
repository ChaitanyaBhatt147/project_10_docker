package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TimeTableDTO;

/**
 * Form class for TimeTable entity.
 * 
 * This class is used to capture user input for TimeTable operations
 * such as create and update.
 * 
 * Features:
 * - Validates course and subject selection (must be greater than 0)
 * - Validates required fields like exam date, time, semester, and description
 * - Converts form data into TimeTableDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class TimeTableForm extends BaseForm {

	/**
	 * Course ID (must be greater than 0).
	 */
	@NotNull(message = "Course is required")
	@Min(1)
	private Long courseId = 0L;

	/**
	 * Course name.
	 */
	private String courseName;

	/**
	 * Subject ID (must be greater than 0).
	 */
	@NotNull(message = "Subject is required")
	@Min(1)
	private Long subjectId = 0L;

	/**
	 * Subject name.
	 */
	private String subjectName;

	/**
	 * Exam date.
	 */
	@NotNull(message = "Exam Date is required")
	private Date examDate;

	/**
	 * Exam time.
	 */
	@NotEmpty(message = "Exam Time is required")
	private String examTime;

	/**
	 * Semester.
	 */
	@NotEmpty(message = "Semester is required")
	private String semester;

	/**
	 * Description.
	 */
	@NotEmpty(message = "Description is required")
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
	 * Converts form data into TimeTableDTO.
	 * 
	 * @return TimeTableDTO object
	 */
	@Override
	public BaseDTO getDto() {

		TimeTableDTO dto = initDTO(new TimeTableDTO());
		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setSubjectId(subjectId);
		dto.setSubjectName(subjectName);
		dto.setExamDate(examDate);
		dto.setExamTime(examTime);
		dto.setSemester(semester);
		dto.setDescription(description);

		return dto;
	}
}