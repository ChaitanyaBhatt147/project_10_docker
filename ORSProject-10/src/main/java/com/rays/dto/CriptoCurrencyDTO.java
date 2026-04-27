package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "CriptoCurrency")
public class CriptoCurrencyDTO extends BaseDTO{
	
	@Column(name = "wallet_address")
	private String walletAddress;
	
	@Column(name = "currency_type")
	private String currencyType;
	
	@Column(name = "balance")
	private Integer balance;
	
	@Column(name = "last_transation")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "walletAddress";
	}

	@Override
	public String getUniqueValue() {
		return walletAddress;
	}

	@Override
	public String getLabel() {
		return "walletAddress";
	}

	@Override
	public String getTableName() {
		return "CriptoCurrency";
	}
	
}
