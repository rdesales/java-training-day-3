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
	 * Add a new account to the lists of accounts
	 * @param account
	 */
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	/**
	 * Remove the account from the list of the accounts
	 * @param account
	 */
	public void deleteAccount(Account account) {
		accounts.remove(account);
	}
	
}
