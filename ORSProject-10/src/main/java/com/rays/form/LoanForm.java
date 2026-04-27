package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoanDTO;

public class LoanForm extends BaseForm{
	@NotNull(message = "loan id is ewquired")
	private Long loanId;
	@NotNull(message = "loan ammount is ewquired")
	private Double loanAmount;
	@NotNull(message = "interest rate is ewquired")
	private Double interestRate;
	@NotNull(message = "issue date is ewquired")
	private Date issueDate;
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	
	@Override
	public BaseDTO getDto() {
		LoanDTO dto = initDTO(new LoanDTO());
		dto.setLoanAmount(loanAmount);
		dto.setLoanId(loanId);
		dto.setInterestRate(interestRate);
		dto.setIssueDate(issueDate);
		return dto;
	}
}
