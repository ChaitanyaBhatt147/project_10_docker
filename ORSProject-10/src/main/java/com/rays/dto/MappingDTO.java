package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "mapping")
public class MappingDTO extends BaseDTO{
	@Column(name = "mappingCode")
	private String mappingCode;
	@Column(name = "sourseField")
	private String sourseField;
	@Column(name = "targetField")
	private String targetField;
	@Column(name = "status")
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
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUniqueKey() {
		return "mappingCode";
	}
	@Override
	public String getUniqueValue() {
		return mappingCode;
	}
	@Override
	public String getLabel() {
		return "mapping";
	}
	@Override
	public String getTableName() {
		return "Mapping";
	}
	
}
