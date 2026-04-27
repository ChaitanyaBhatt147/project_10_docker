package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MetadataDTO;

public class MetadataForm extends BaseForm{
	@NotEmpty(message = "File Mata Data is rrquired")
	private String fileMetaCode;
	@NotEmpty(message = "File Name is rrquired")
	private String fileName;
	@NotEmpty(message = "Status is rrquired")
	private String status;
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
