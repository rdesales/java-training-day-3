package com.hcl.bankapp.data;

import java.util.Date;
import java.util.Objects;

import com.hcl.bankapp.enums.TransactionType;

public class Transaction {
	
	private String id;
	private String customerID;
	private String accountID;
	private double amount;
	private TransactionType transactionType;
	private Date date;
	/**
	 * @param customerID
	 * @param accountID
	 * @param amount
	 * @param transactionType
	 * @param date
	 */
	public Transaction(String id, String customerID, String accountID, double amount, TransactionType transactionType, Date date) {
		this.id = id;
		this.customerID = customerID;
		this.accountID = accountID;
		this.amount = amount;
		this.transactionType = transactionType;
		this.date = date;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the accountID
	 */
	public String getAccountID() {
		return accountID;
	}
	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountID, amount, customerID, date, transactionType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(accountID, other.accountID)
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(customerID, other.customerID) && Objects.equals(date, other.date)
				&& transactionType == other.transactionType;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += "Transaction with ID:" + id +"\n";
		out += "Customer ID:" + customerID + "\n";
		out += "Account ID:" + accountID + "\n";
		out += "Transactin type: " +transactionType + "\n";
		out += "Transaction date: " + date + "\n";
		out += "-----------------------------------";
		return out;
	}
	

}
