package com.hcl.bankapp;

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
	public SavingAccount(String id, Client client, double amount, int minimumBalance, int availableTransactions) {
		super(id, client, amount);
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

	/**
	 * Decreases the number of available transactions
	 */
	public void decreaseTransactionsNumber() {
		availableTransactions--;
	}
	
	@Override
	public void doTransactionIn(double in) {
		this.amount += in;
		updateAmount(in);
		decreaseTransactionsNumber();
		System.out.println("Operation -deposit- done.");
	}
	
	@Override
	public void doTransactionOut(double out) {
		if(amount >= out) {
			if (amount-out < minimumBalance) {
				System.out.println("Minimum balance violated. Operation aborted");
				return;
			}
			updateAmount(-1*out);
			decreaseTransactionsNumber();
			System.out.println("Operation -withdrall- done.");
		} else {
			System.out.println("You don't have sufficient founds.");
		}
	} 
	
	@Override
	public String toString() {
		String out = "";
		out += "Saving account (with a minimum balance of $"+minimumBalance+")";
		out += super.toString();
		return out;
	}

}
