package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.JobDTO;

public class JobForm extends BaseForm {

    @NotEmpty(message = "Job Code is required")
    @Size(min = 2, max = 20, message = "Job Code must be 2-20 characters")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Job Code must be alphanumeric")
    private String jobCode;

    @NotEmpty(message = "Job Name is required")
    @Size(min = 2, max = 50, message = "Job Name must be 2-50 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Job Name must contain only letters")
    private String jobName;

    @NotEmpty(message = "Cron Expression is required")
    @Pattern(regexp = "^\\d+$", message = "Only numbers allowed")
    private String cronExpression;

    @NotEmpty(message = "Status is required")
    @Pattern(
        regexp = "^(Active|Inactive)$",
        message = "Status must be Active or Inactive"
    )
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
    public BaseDTO getDto() {
    	JobDTO dto = initDTO(new JobDTO());
    	dto.setJobCode(jobCode);
    	dto.setJobName(jobName);
    	dto.setCronExpression(cronExpression);
    	dto.setStatus(status);
    	return dto;
    }
}