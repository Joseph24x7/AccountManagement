package com.account.management.models;

public class Account{
	
	private String accountNumber;
	private String category;
	private Long balanceAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(Long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", category=" + category + ", balanceAmount=" + balanceAmount
				+ "]";
	}
	
}
