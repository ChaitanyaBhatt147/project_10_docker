package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CriptoCurrencyDTO;

public class CriptoCurrencyForm extends BaseForm {

	@NotEmpty(message = "wallet address is required")
	private String walletAddress;

	@NotEmpty(message = "currency type is required")
	private String currencyType;

	@NotNull(message = "balance is required")
	private Integer balance;

	@NotNull(message = "last transation is required")
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
