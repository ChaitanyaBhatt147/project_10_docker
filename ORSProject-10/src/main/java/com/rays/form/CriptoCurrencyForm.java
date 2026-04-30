package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CriptoCurrencyDTO;

/**
 * Form class for CriptoCurrency entity.
 * 
 * This class is used to capture user input for Cryptocurrency operations
 * such as create and update.
 * 
 * Features:
 * - Validates wallet address (alphanumeric)
 * - Validates currency type (controlled values)
 * - Validates balance and last transaction (non-null numeric values)
 * - Converts form data into CriptoCurrencyDTO object
 * 
 * @author Chaitanya Bhatt
 */
public class CriptoCurrencyForm extends BaseForm {

	/**
	 * Wallet address of the cryptocurrency.
	 */
	@NotEmpty(message = "Wallet Address is required")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Wallet Address must be alphanumeric")
	private String walletAddress;

	/**
	 * Type of cryptocurrency.
	 */
	@NotEmpty(message = "Currency Type is required")
	@Pattern(regexp = "^(Bitcoin|Ethereum|USDT|Other)$", message = "Invalid Currency Type")
	private String currencyType;

	/**
	 * Current balance.
	 */
	@NotNull(message = "Balance is required")
	private Integer balance;

	/**
	 * Last transaction amount or ID.
	 */
	@NotNull(message = "Last Transaction is required")
	private Integer lastTransation;

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getLastTransation() {
		return lastTransation;
	}

	public void setLastTransation(Integer lastTransation) {
		this.lastTransation = lastTransation;
	}

	/**
	 * Converts form data into CriptoCurrencyDTO.
	 * 
	 * @return CriptoCurrencyDTO object
	 */
	@Override
	public BaseDTO getDto() {
		CriptoCurrencyDTO dto = initDTO(new CriptoCurrencyDTO());
		dto.setBalance(balance);
		dto.setLastTransation(lastTransation);
		dto.setWalletAddress(walletAddress);
		dto.setCurrencyType(currencyType);
		
		return dto;
	}
}