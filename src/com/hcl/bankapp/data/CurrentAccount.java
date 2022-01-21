package com.hcl.bankapp.data;

public class CurrentAccount extends Account {
	
	private static double minimumBalance;
	
	static {
		minimumBalance = 200;
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
	
	@Override
	public void doTransactionIn(double in) {
		updateAmount(in);
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
			System.out.println("Operation -withdrall- done.");
		} else {
			System.out.println("You don't have sufficient founds.");
		}
	} 

	@Override
	public String toString() {
		String out = "";
		out += "Current account (with a minimum balance of $"+minimumBalance+")";
		out += super.toString();
		return out;
		
	}
}
