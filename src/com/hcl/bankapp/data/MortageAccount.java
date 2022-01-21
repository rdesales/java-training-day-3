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


	
	/**
	 * @return the monthlyPayment
	 */
	public double getMonthlyPayment() {
		return monthlyPayment;
	}



	/**
	 * @param monthlyPayment the monthlyPayment to set
	 */
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}



	/**
	 * @return the expectedFinishDate
	 */
	public Date getExpectedFinishDate() {
		return expectedFinishDate;
	}



	/**
	 * @param expectedFinishDate the expectedFinishDate to set
	 */
	public void setExpectedFinishDate(Date expectedFinishDate) {
		this.expectedFinishDate = expectedFinishDate;
	}



	/**
	 * @return the currentAnnualInterestRate
	 */
	public static double getCurrentAnnualInterestRate() {
		return currentAnnualInterestRate;
	}



	/**
	 * @param currentAnnualInterestRate the currentAnnualInterestRate to set
	 */
	public static void setCurrentAnnualInterestRate(double currentAnnualInterestRate) {
		MortageAccount.currentAnnualInterestRate = currentAnnualInterestRate;
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
