package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for Subject entity.
 * 
 * This class represents subject details in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores subject information such as name and description
 * - Maintains relationship with Course
 * - Provides unique key and label for identification
 * 
 * Mapped to table: st_subject
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_subject")
public class SubjectDTO extends BaseDTO {

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
	 * Subject name.
	 */
	@Column(name = "name", length = 50)
	private String name;

	/**
	 * Subject description.
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
	 * @return subject name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "Subject Name"
	 */
	@Override
	public String getLabel() {
		return "Subject Name";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "Subject"
	 */
	@Override
	public String getTableName() {
		return "Subject";
	}

	/**
	 * Returns value for dropdown.
	 * 
	 * @return subject name
	 */
	@Override
	public String getValue() {
		return name;
	}
}