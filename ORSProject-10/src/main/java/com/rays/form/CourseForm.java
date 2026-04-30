package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CourseDTO;

/**
 * Form class for Course entity.
 * 
 * This class is used to capture user input for Course operations
 * such as create and update.
 * 
 * Features:
 * - Validates required fields like name, duration, and description
 * - Converts form data into CourseDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class CourseForm extends BaseForm {

	/**
	 * Course name.
	 */
	@NotEmpty(message = "Name is required")
	@Pattern(regexp = "^[A-Za-z0-9 .,&-]{2,50}$", message = "Invalid Course Name")
	private String name;

	/**
	 * Course duration.
	 */
	@NotEmpty(message = "Duration is required")
	@Pattern(regexp = "^[0-9 ]+(Days|Months|Years)$", message = "Duration must be like '3 Months', '6 Days'")
	private String duration;

	/**
	 * Course description.
	 */
	@NotEmpty(message = "Description is required")
	@Pattern(regexp = "^[A-Za-z0-9 ,.\\-]{5,200}$", message = "Invalid Description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Converts form data into CourseDTO.
	 * 
	 * @return CourseDTO object
	 */
	@Override
	public BaseDTO getDto() {

		CourseDTO dto = initDTO(new CourseDTO());
		dto.setName(name);
		dto.setDuration(duration);
		dto.setDescription(description);

		return dto;
	}
}