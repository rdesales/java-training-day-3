package com.hcl.bankapp.data;

import java.util.ArrayList;

public class Customer extends Person{
	
	private String id;
	private int mobileNumber;
	private String email;
	private ArrayList<Account> accounts;
	private ArrayList<Transaction> transactions;

	/**
	 * Constructor
	 * @param name Name of the client
	 * @param age Age of the client
	 * @param id ID of the client
	 * @param accounts The (possible) accounts of the client
	 */
	public Customer(String name, int age, String id, ArrayList<Account> accounts) {
		super(name, age);
		this.id = id;
		this.accounts = accounts;
	}
	
	/**
	 * Returns the id of the client
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Modifies the id of the client
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns all the accounts of the client
	 * @return accounts 
	 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	/**
	 * Modifies the list of the accounts
	 * @param accounts
	 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the mobileNumber
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the transactions
	 */
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	} 

	
}
