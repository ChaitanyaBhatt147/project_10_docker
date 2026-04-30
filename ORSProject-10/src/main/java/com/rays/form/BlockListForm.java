package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BlockListDTO;

/**
 * Form class for BlockList entity.
 * 
 * This class is used to capture user input for BlockList operations
 * such as create and update.
 * 
 * Features:
 * - Validates block code (alphanumeric)
 * - Validates user name (alphabets only)
 * - Validates reason (controlled characters and length)
 * - Validates status (fixed values)
 * - Converts form data into BlockListDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class BlockListForm extends BaseForm {

	/**
	 * Unique block code.
	 */
	@NotEmpty(message = "Block Code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Block Code must be alphanumeric")
	private String blockCode;

	/**
	 * Name of the user.
	 */
	@NotEmpty(message = "User Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "User Name must contain only alphabets")
	private String userName;

	/**
	 * Reason for blocking.
	 */
	@NotEmpty(message = "Reason is required")
	@Pattern(regexp = "^[A-Za-z0-9 ,.\\-]{3,100}$", message = "Reason must be valid and 3-100 characters long")
	private String reason;

	/**
	 * Status of the block entry.
	 */
	@NotEmpty(message = "Status is required")
	@Pattern(regexp = "^(Active|Inactive|Blocked)$", message = "Status must be Active, Inactive or Blocked")
	private String status;

	// ================== GETTERS & SETTERS ==================

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// ================== DTO CONVERSION ==================

	/**
	 * Converts form data into BlockListDTO.
	 * 
	 * @return BlockListDTO object
	 */
	@Override
	public BaseDTO getDto() {
		BlockListDTO dto = initDTO(new BlockListDTO());
		dto.setBlockCode(blockCode);
		dto.setUserName(userName);
		dto.setReason(reason);
		dto.setStatus(status);
		return dto;
	}
}