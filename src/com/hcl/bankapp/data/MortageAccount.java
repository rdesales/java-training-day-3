package com.hcl.bankapp.data;

import java.util.Date;

public class MortageAccount extends Account {
	
	private double monthlyPayment;
	private Date expectedFinishDate;
	private static double currentAnnualInterestRate;
	
	static {
		currentAnnualInterestRate = 13.5;
	}
	
	public MortageAccount(String id, Customer customer, double amount, double monthlyPayment, Date expectedFinishDate ) {
		super(id, customer, amount);
		this.monthlyPayment = monthlyPayment;
		this.expectedFinishDate = expectedFinishDate;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public Date getExpectedFinishDate() {
		return expectedFinishDate;
	}

	public void setExpectedFinishDate(Date expectedFinishDate) {
		this.expectedFinishDate = expectedFinishDate;
	}

	public static double getCurrentAnnualInterestRate() {
		return currentAnnualInterestRate;
	}

	public static void setCurrentAnnualInterestRate(double currentAnnualInterestRate) {
		MortageAccount.currentAnnualInterestRate = currentAnnualInterestRate;
	}

	@Override
	public void doTransactionIn(double in) {
		if(in < monthlyPayment) {
			System.out.println("Not sufficient funds to pay the montly payment.");
		} else {
			this.amount -= in;
			System.out.println("Monthly payment done");
		} 
	}
	
	@Override
	public void doTransactionOut(double out) {
		updateAmount(25);
		System.out.println("Due to missing of payment, the new value of this mortage is: $"+this.amount);
	}  
	
	@Override
	public String toString() {
		String out = "";
		out += "Mortage account: ";
		out += super.toString();
		out += "Monthly payment: $"+ monthlyPayment + "\n";
		out	+= "Expected finish date:" + expectedFinishDate + "\n";
		out += "Current annual interest rate: " + currentAnnualInterestRate + "\n"; 
		return out;
	}
	
	

}
