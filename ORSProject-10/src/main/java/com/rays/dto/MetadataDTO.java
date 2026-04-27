package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Metadata")
public class MetadataDTO extends BaseDTO{
	@Column(name = "fileMetaCode")
	private String fileMetaCode;
	@Column(name = "fileName")
	private String fileName;
	@Column(name = "size")
	private Long size;
	@Column(name = "status")
	private String status;
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
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUniqueKey() {
		return "fileMetaCode";
	}
	@Override
	public String getUniqueValue() {
		return fileMetaCode;
	}
	@Override
	public String getLabel() {
		return "Metadata";
	}
	@Override
	public String getTableName() {
		return "Metadata";
	}
	
}
