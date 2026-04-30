package com.rays.form;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClickDTO;

/**
 * Form class for Click entity.
 * 
 * This class is used to capture user input for Click operations
 * such as create and update.
 * 
 * Features:
 * - Validates click code (alphanumeric)
 * - Validates user name (alphabets only)
 * - Validates status (fixed values)
 * - Maintains click time (system-generated)
 * - Converts form data into ClickDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class ClickForm extends BaseForm {

	/**
	 * Unique click code.
	 */
	@NotEmpty(message = "Click Code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Click Code must be alphanumeric")
	private String clickCode;

	/**
	 * Name of the user performing the click.
	 */
	@NotEmpty(message = "User Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "User Name must contain only alphabets")
	private String userName;

	/**
	 * Timestamp of the click event.
	 * Usually system-generated, hence no validation applied.
	 */
	private Timestamp clickTime;

	/**
	 * Status of the click event.
	 */
	@NotEmpty(message = "Status is required")
	@Pattern(regexp = "^(Success|Failed|Pending)$", message = "Status must be Success, Failed or Pending")
	private String status;

	// ================== GETTERS & SETTERS ==================

	public String getClickCode() {
		return clickCode;
	}

	public void setClickCode(String clickCode) {
		this.clickCode = clickCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getClickTime() {
		return clickTime;
	}

	public void setClickTime(Timestamp clickTime) {
		this.clickTime = clickTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// ================== DTO CONVERSION ==================

	/**
	 * Converts form data into ClickDTO.
	 * 
	 * @return ClickDTO object
	 */
	@Override
	public BaseDTO getDto() {
		ClickDTO dto = initDTO(new ClickDTO());
		dto.setClickCode(clickCode);
		dto.setClickTime(clickTime);
		dto.setUserName(userName);
		dto.setStatus(status);
		return dto;
	}
}