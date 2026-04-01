package com.rays.exception;

/**
 * Custom exception for duplicate record errors.
 * 
 * This exception is used when attempting to insert or update
 * a record that violates unique constraints, such as:
 * - Duplicate login ID
 * - Duplicate email
 * - Duplicate unique fields
 * 
 * It extends RuntimeException, so it is unchecked.
 * 
 * @author Chaitanya Bhatt
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * Constructor to create DuplicateRecordException with message.
	 * 
	 * @param msg error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}