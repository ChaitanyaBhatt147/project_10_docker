package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoanDTO;

/**
 * Form class for Loan entity.
 * 
 * This class is used to capture user input for Loan operations
 * such as create and update.
 * 
 * Features:
 * - Validates loan ID, amount, interest rate, and issue date
 * - Ensures all numeric and date fields are not null
 * - Converts form data into LoanDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class LoanForm extends BaseForm {

	/**
	 * Unique loan ID.
	 */
	@NotNull(message = "loan id is ewquired")
	private Long loanId;

	/**
	 * Loan amount.
	 */
	@NotNull(message = "loan ammount is ewquired")
	private Double loanAmount;

	/**
	 * Interest rate of the loan.
	 */
	@NotNull(message = "interest rate is ewquired")
	private Double interestRate;

	/**
	 * Issue date of the loan.
	 */
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

	/**
	 * Converts form data into LoanDTO.
	 * 
	 * @return LoanDTO object
	 */
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