package com.rays.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Standard Response Wrapper for ORS Application.
 * 
 * This class is used to send consistent API responses
 * from backend to frontend.
 * 
 * It contains:
 * - Success status
 * - Messages
 * - Data payload
 * - Validation errors
 * - Additional result attributes
 * 
 * Response structure is maintained using a Map.
 * 
 * @author Chaitanya Bhatt
 */
public class ORSResponse {

	/**
	 * Key for input validation errors.
	 */
	public static final String INPUT_ERROR = "inputerror";

	/**
	 * Key for message.
	 */
	public static final String MESSAGE = "message";

	/**
	 * Key for response data.
	 */
	public static final String DATA = "data";

	/**
	 * Map to store response data dynamically.
	 */
	private Map<String, Object> result = new HashMap<String, Object>();

	/**
	 * Indicates success or failure of the operation.
	 */
	public boolean success = false;

	/**
	 * Default constructor.
	 */
	public ORSResponse() {
	}

	/**
	 * Constructor with success flag.
	 * 
	 * @param success operation status
	 */
	public ORSResponse(boolean success) {
		this.success = success;
	}

	/**
	 * Constructor with success flag and message.
	 * 
	 * @param success operation status
	 * @param message response message
	 */
	public ORSResponse(boolean success, String message) {
		this.success = success;
		addMessage(message);
	}

	/**
	 * Constructor with success flag, message, and data.
	 * 
	 * @param success operation status
	 * @param message response message
	 * @param value response data
	 */
	public ORSResponse(boolean success, String message, Object value) {
		this.success = success;
		addMessage(message);
		addData(value);
	}

	/**
	 * Gets success status.
	 * 
	 * @return true if successful
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets success status.
	 * 
	 * @param success operation status
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Gets result map.
	 * 
	 * @return result map
	 */
	public Map<String, Object> getResult() {
		return result;
	}

	/**
	 * Sets result map.
	 * 
	 * @param result response map
	 */
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	/**
	 * Adds input validation errors to response.
	 * 
	 * @param value validation error object
	 */
	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);
	}

	/**
	 * Adds message to response.
	 * 
	 * @param value message
	 */
	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}

	/**
	 * Adds data payload to response.
	 * 
	 * @param value data object
	 */
	public void addData(Object value) {
		result.put(DATA, value);
	}

	/**
	 * Adds custom key-value pair to response.
	 * 
	 * @param key result key
	 * @param value result value
	 */
	public void addResult(String key, Object value) {
		result.put(key, value);
	}
}