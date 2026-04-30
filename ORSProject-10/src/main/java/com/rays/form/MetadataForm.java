package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MetadataDTO;

/**
 * Form class for Metadata entity.
 * 
 * This class is used to capture user input for Metadata operations
 * such as create and update.
 * 
 * Features:
 * - Validates file metadata code (alphanumeric)
 * - Validates file name (valid characters)
 * - Validates status (fixed values)
 * - Validates file size (non-null)
 * - Converts form data into MetadataDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class MetadataForm extends BaseForm {

	/**
	 * File metadata code.
	 */
	@NotEmpty(message = "File Mata Data is rrquired")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "File Meta Code must be alphanumeric")
	private String fileMetaCode;

	/**
	 * File name.
	 */
	@NotEmpty(message = "File Name is rrquired")
	@Pattern(regexp = "^[A-Za-z0-9 ._-]+$", message = "Invalid File Name")
	private String fileName;

	/**
	 * Status of the file.
	 */
	@NotEmpty(message = "Status is rrquired")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
	private String status;

	/**
	 * File size.
	 */
	@NotNull(message = "Size is rrquired")
	private Long size;

	public String getFileMetaCode() {
		return fileMetaCode;
	}

	public void setFileMetaCode(String fileMetaCode) {
		this.fileMetaCode = fileMetaCode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * Converts form data into MetadataDTO.
	 * 
	 * @return MetadataDTO object
	 */
	@Override
	public BaseDTO getDto() {
		MetadataDTO dto = initDTO(new MetadataDTO());
		dto.setFileMetaCode(fileMetaCode);
		dto.setFileName(fileName);
		dto.setSize(size);
		dto.setStatus(status);
		return dto;
	}
}