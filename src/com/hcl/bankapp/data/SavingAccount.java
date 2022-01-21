package com.hcl.bankapp.data;

public class SavingAccount extends Account {
	
	private static int minimumBalance;
	private int availableTransactions;
	
	static {
		 minimumBalance = 50000;
	}
	
	/**
	 * Constructor
	 * @param id ID of the 
	 * @param client Owner of the account
	 * @param amount Value of the account
	 * @param minimumBalance Minimum balance that the
	 * @param availableTransactions
	 */
	public SavingAccount(String id, Customer customer, double amount, int minimumBalance, int availableTransactions) {
		super(id, customer, amount);
		this.availableTransactions = availableTransactions;
	}

	/**
	 * Returns the number of monthly available transactions 
	 * @return availableTransactions
	 */
	public int getAvailableTransactions() {
		return availableTransactions;
	}
	
	/**
	 * Modifies the number of available transactions
	 * @param availableTransactions 
	 */
	public void setAvailableTransactions(int availableTransactions) {
		this.availableTransactions = availableTransactions;
	}
	
	/**
	 * Returns the minimum balance of the account
	 * @return
	 */
	public static int getMinimumBalance() {
		return minimumBalance;
	}

	
	@Override
	public String toString() {
		String out = "";
		out += "Saving account (with a minimum balance of $"+minimumBalance+")";
		out += super.toString();
		return out;
	}

}
