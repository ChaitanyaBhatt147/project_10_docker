package com.rays.exception;

/**
 * Custom exception for database-related errors.
 * 
 * This exception is used to handle scenarios where
 * database operations fail, such as:
 * - Record not found
 * - Database access issues
 * - Transaction failures
 * 
 * It extends RuntimeException, so it is unchecked.
 * 
 * @author Chaitanya Bhatt
 */
public class DatabaseException extends RuntimeException {

	/**
	 * Constructor to create DatabaseException with message.
	 * 
	 * @param msg error message
	 */
	public DatabaseException(String msg) {
		super(msg);
	}
}