package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for Marksheet entity.
 * 
 * This class represents student marksheet details in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores student marks for Physics, Chemistry, and Maths
 * - Maintains student reference using studentId
 * - Provides unique key and label for identification
 * 
 * Mapped to table: st_marksheet
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_marksheet")
public class MarksheetDTO extends BaseDTO {

	/**
	 * Roll number of the student.
	 */
	@Column(name = "roll_no", length = 20)
	protected String rollNo = null;

	/**
	 * Student ID (foreign key).
	 */
	@Column(name = "student_id")
	protected Long studentId;

	/**
	 * Student name.
	 */
	@Column(name = "name", length = 50)
	protected String name = null;

	/**
	 * Marks in Physics.
	 */
	@Column(name = "physics")
	protected Integer physics;

	/**
	 * Marks in Chemistry.
	 */
	@Column(name = "chemistry")
	protected Integer chemistry;

	/**
	 * Marks in Maths.
	 */
	@Column(name = "maths")
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
	 * Returns unique key.
	 * 
	 * @return "rollNo"
	 */
	@Override
	public String getUniqueKey() {
		return "rollNo";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return roll number
	 */
	@Override
	public String getUniqueValue() {
		return rollNo;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "Roll No"
	 */
	@Override
	public String getLabel() {
		return "Roll No";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "Marksheet"
	 */
	@Override
	public String getTableName() {
		return "Marksheet";
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