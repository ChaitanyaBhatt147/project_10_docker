package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * DTO class for College entity.
 * 
 * This class represents college information in the system.
 * It extends BaseDTO to inherit common fields like id,
 * created/modified details.
 * 
 * Features:
 * - Stores college details such as name, address, state, city, and phone number
 * - Provides unique key and display label for dropdown usage
 * 
 * Mapped to table: st_college
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "st_college")
public class CollegeDTO extends BaseDTO {

	/**
	 * College name.
	 */
	@Column(name = "name", length = 50)
	private String name;

	/**
	 * College address.
	 */
	@Column(name = "address", length = 50)
	private String address;

	/**
	 * State of the college.
	 */
	@Column(name = "state", length = 50)
	private String state;

	/**
	 * City of the college.
	 */
	@Column(name = "city", length = 50)
	private String city;

	/**
	 * College phone number.
	 */
	@Column(name = "phone_no", length = 15)
	private String phoneNo;

	/**
	 * @return college name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name college name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address college address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state college state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city college city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return phone number
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo college phone number
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
	 * @return college name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns label for UI.
	 * 
	 * @return "College Name"
	 */
	@Override
	public String getLabel() {
		return "College Name";
	}
	
	/**
	 * Returns table name.
	 * 
	 * @return "College"
	 */
	@Override
	public String getTableName() {
		return "College";
	}

	/**
	 * Returns value for dropdown.
	 * 
	 * @return college name
	 */
	@Override
	public String getValue() {
		return name;
	}
}