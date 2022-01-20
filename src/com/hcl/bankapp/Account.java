package com.hcl.bankapp;

public abstract class Account {

	protected String id;
	protected Client client;
	protected double amount;
	
	/**
	 * Constructor
	 * @param id Id of the account
	 * @param client Owner of the account
	 * @param amount Value of the account
	 */
	public Account(String id, Client client, double amount) {
		this.id = id;
		this.client = client;
		this.amount = amount;
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
	public Client getClient() {
		return client;
	}
	
	/**
	 * Modifies the owner of the account
	 * @param client The new owner of the account
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	/**
	 * Returns the value of the account
	 * @return amount
	 */
	public double getAmount() {
		return amount;
	}
	
	/**
	 * Modifies the value of the account
	 * @param amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * Updates the amount of the account
	 * @param amount
	 */
	public void updateAmount(double update) {
		amount += update; //This value can be a negative number
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String out = "";
		out += "ID account: " + id + "\n";
		out += "Client: \n" + client + "\n";
		out += "Account balance: " + amount + "\n";
		return out;
	}
	
	public abstract void doTransactionIn(double in);
	public abstract void doTransactionOut(double out);
	
}
