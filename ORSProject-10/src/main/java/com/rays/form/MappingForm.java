package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MappingDTO;

/**
 * Form class for Mapping entity.
 * 
 * This class is used to capture user input for Mapping operations
 * such as create and update.
 * 
 * Features:
 * - Validates mapping code (alphanumeric)
 * - Validates source and target fields (valid characters)
 * - Validates status (fixed values)
 * - Converts form data into MappingDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class MappingForm extends BaseForm {

	/**
	 * Unique mapping code.
	 */
	@NotEmpty(message = "mapping code is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Mapping Code must be alphanumeric")
	private String mappingCode;

	/**
	 * Source field name.
	 */
	@NotEmpty(message = "sourse field is required")
	@Pattern(regexp = "^[A-Za-z0-9_]+$", message = "Invalid Source Field")
	private String sourseField;

	/**
	 * Target field name.
	 */
	@NotEmpty(message = "targetField is required")
	@Pattern(regexp = "^[A-Za-z0-9_]+$", message = "Invalid Target Field")
	private String targetField;

	/**
	 * Status of the mapping.
	 */
	@NotEmpty(message = "status is required")
	@Pattern(regexp = "^(Active|Inactive)$", message = "Status must be Active or Inactive")
	private String status;

	public String getMappingCode() {
		return mappingCode;
	}

	public void setMappingCode(String mappingCode) {
		this.mappingCode = mappingCode;
	}

	public String getSourseField() {
		return sourseField;
	}

	public void setSourseField(String sourseField) {
		this.sourseField = sourseField;
	}

	public String getTargetField() {
		return targetField;
	}

	public void setTargetField(String targetField) {
		this.targetField = targetField;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Converts form data into MappingDTO.
	 * 
	 * @return MappingDTO object
	 */
	@Override
	public BaseDTO getDto() {
		MappingDTO dto = initDTO(new MappingDTO());
		dto.setMappingCode(mappingCode);
		dto.setSourseField(sourseField);
		dto.setTargetField(targetField);
		dto.setStatus(status);
		return dto;
	}
}