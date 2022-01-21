package com.hcl.bankapp.data;

public abstract class Account {

	protected String id;
	protected Customer customer;
	protected double balance;
	
	/**
	 * Constructor
	 * @param id Id of the account
	 * @param client Owner of the account
	 * @param amount Value of the account
	 */
	public Account(String id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	/**
	 * Returns the id of the account
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Modifies the id of the account
	 * @param id The new id of the account
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Returns the owner of the account
	 * @return client
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * Modifies the owner of the account
	 * @param client The new owner of the account
	 */
	public void setCustomer(Customer client) {
		this.customer = client;
	}
	
	/**
	 * Returns the value of the account
	 * @return amount
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Modifies the value of the account
	 * @param amount
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String out = "";
		out += "ID account: " + id + "\n";
		out += "Client: \n" + customer + "\n";
		out += "Account balance: " + balance + "\n";
		return out;
	}
	
	/**
	 * Equals method
	 * @param a 
	 * @return a boolean value 
	 */
	public boolean equals(Account a) {
		return id.equals(a.getId());
	}
	
	
}
