package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseForm;

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
    @Pattern(
        regexp = "^([0-5]?\\d|\\*)\\s+([0-5]?\\d|\\*)\\s+([0-2]?\\d|\\*)\\s+([1-9]|[12]\\d|3[01]|\\*)\\s+([1-9]|1[0-2]|\\*)\\s+(\\?|\\*|[0-6])$",
        message = "Invalid Cron Expression format"
    )
    private String cronExpression;

    @NotEmpty(message = "Status is required")
    @Pattern(regexp = "^(ACTIVE|INACTIVE)$", message = "Status must be ACTIVE or INACTIVE")
    private String status;

    // Getters and Setters

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
}