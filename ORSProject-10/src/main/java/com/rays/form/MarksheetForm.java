package com.rays.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MarksheetDTO;

/**
 * Form class for Marksheet entity.
 * 
 * This class is used to capture user input for Marksheet operations
 * such as create and update.
 * 
 * Features:
 * - Validates roll number and student selection
 * - Validates marks range (0 to 99) for each subject
 * - Converts form data into MarksheetDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class MarksheetForm extends BaseForm {

	/**
	 * Roll number of the student.
	 */
	@NotEmpty(message = "Roll No is required")
	protected String rollNo = null;

	/**
	 * Student ID (must be greater than 0).
	 */
	@NotNull(message = "Student Name is required")
	@Min(1)
	protected Long studentId;

	/**
	 * Student name.
	 */
	protected String name = null;

	/**
	 * Marks in Physics (0-99).
	 */
	@NotNull(message = "Physics is required")
	@Max(99)
	@Min(0)
	protected Integer physics;

	/**
	 * Marks in Chemistry (0-99).
	 */
	@NotNull(message = "Chemistry is required")
	@Max(99)
	@Min(0)
	protected Integer chemistry;

	/**
	 * Marks in Maths (0-99).
	 */
	@NotNull(message = "Maths is required")
	@Max(99)
	@Min(0)
	protected Integer maths;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhysics() {
		return physics;
	}

	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	public Integer getChemistry() {
		return chemistry;
	}

	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	/**
	 * Converts form data into MarksheetDTO.
	 * 
	 * @return MarksheetDTO object
	 */
	@Override
	public BaseDTO getDto() {

		MarksheetDTO dto = initDTO(new MarksheetDTO());
		dto.setRollNo(rollNo);
		dto.setName(name);
		dto.setStudentId(studentId);
		dto.setPhysics(physics);
		dto.setChemistry(chemistry);
		dto.setMaths(maths);

		return dto;
	}
}