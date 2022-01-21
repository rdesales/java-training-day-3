package com.hcl.bankapp.data;

public class CurrentAccount extends Account {
	
	private static double minimumBalance;
	private static double interestRate;
	
	static {
		minimumBalance = 200;
		interestRate = 7;
	}
	
	/**
	 * Constuctor
	 * @param id ID of the owner of the account
	 * @param client Owner of the account
	 * @param amount value of the account
	 */
	public CurrentAccount(String id, Customer client, double amount){
		super(id, client, amount);
	}
	
	/**
	 * Returns the minimum balance of the account
	 * @return
	 */
	public double getMinimumBalance() {
		return minimumBalance;
	}

	/**
	 * @return the interestRate
	 */
	public static double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public static void setInterestRate(double interestRate) {
		CurrentAccount.interestRate = interestRate;
	}

	@Override
	public String toString() {
		String out = "";
		out += "Current account (with a minimum balance of $"+minimumBalance+")";
		out += super.toString();
		return out;
		
	}
}
