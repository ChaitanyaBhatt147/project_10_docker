package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "loan")
public class LoanDTO extends BaseDTO {
	@Column(name = "loan_id")
	private Long loanId;
	@Column(name = "loan_ammount")
	private Double loanAmount;
	@Column(name = "interest_rate")
	private Double interestRate;
	@Column(name = "issue_date")
	private Date issueDate;

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

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "loanId";
	}

	@Override
	public String getUniqueValue() {
		return loanId + "";
	}

	@Override
	public String getLabel() {
		return null;
	}

	@Override
	public String getTableName() {
		return "loan";
	}
}
