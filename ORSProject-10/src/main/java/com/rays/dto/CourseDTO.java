package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for Course entity.
 * 
 * This class represents course information in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores course details such as name, duration, and description
 * - Provides unique key and display label for dropdown usage
 * 
 * Mapped to table: st_course
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_course")
public class CourseDTO extends BaseDTO {

	/**
	 * Course name.
	 */
	@Column(name = "name", length = 50)
	private String name;

	/**
	 * Course duration.
	 */
	@Column(name = "duration", length = 50)
	private String duration;

	/**
	 * Course description.
	 */
	@Column(name = "description", length = 50)
	private String description;

	/**
	 * @return course name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name course name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration course duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description course description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns unique key.
	 * 
	 * @return "name"
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return course name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "Course Name"
	 */
	@Override
	public String getLabel() {
		return "Course Name";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "Course"
	 */
	@Override
	public String getTableName() {
		return "Course";
	}

	/**
	 * Returns value for dropdown.
	 * 
	 * @return course name
	 */
	@Override
	public String getValue() {
		return name;
	}
}