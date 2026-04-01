package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubjectDTO;

/**
 * Form class for Subject entity.
 * 
 * This class is used to capture user input for Subject operations
 * such as create and update.
 * 
 * Features:
 * - Validates course selection (must be greater than 0)
 * - Validates required fields like name and description
 * - Converts form data into SubjectDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class SubjectForm extends BaseForm {

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
	 * Subject name.
	 */
	@NotEmpty(message = "Name is required")
	private String name;

	/**
	 * Subject description.
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Converts form data into SubjectDTO.
	 * 
	 * @return SubjectDTO object
	 */
	@Override
	public BaseDTO getDto() {

		SubjectDTO dto = initDTO(new SubjectDTO());

		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setName(name);
		dto.setDescription(description);

		return dto;
	}
}