package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table
public class JobDTO extends BaseDTO{
	@Column(name = "jobCode")
	private String jobCode;
	@Column(name = "jobName")
	private String jobName;
	@Column(name = "cronExpression")
	private String cronExpression;
	@Column(name = "status")
	private String status;
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
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
		return "jobCode";
	}
	@Override
	public String getUniqueValue() {
		return jobCode;
	}
	@Override
	public String getLabel() {
		return "Job";
	}
	@Override
	public String getTableName() {
		return "Job";
	}
	
}
