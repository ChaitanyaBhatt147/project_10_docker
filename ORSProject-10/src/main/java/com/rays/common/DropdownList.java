package com.rays.common;

/**
 * Interface for Dropdown List representation.
 * 
 * This interface is used to provide key-value pairs
 * for dropdown components in UI.
 * 
 * Implementing classes (usually DTOs) must define:
 * - Key (typically ID)
 * - Value (display label)
 * 
 * It helps in dynamically populating dropdown lists.
 * 
 * @author Chaitanya Bhatt
 */
public interface DropdownList {

	/**
	 * Returns the key for dropdown option.
	 * Typically represents unique identifier (e.g., ID).
	 * 
	 * @return key as String
	 */
	public String getKey();

	/**
	 * Returns the value for dropdown option.
	 * Typically represents display label.
	 * 
	 * @return value as String
	 */
	public String getValue();

}