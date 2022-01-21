package com.hcl.bankapp.service;

import com.hcl.bankapp.dao.AccountDAO;
import com.hcl.bankapp.data.Account;

public class AccountService {
	
	private AccountDAO adao; 
	
	/**
	 * Constructor
	 * @param adao
	 */
	public AccountService(AccountDAO adao){
		this.adao = adao;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void checkBalance(String id) {
		Account a = adao.findOne(id);
		if(a  != null)
			System.out.println("Balance of account " + id + ": $"+a.getBalance());
		else
			System.out.println("Account not found! :O");
	}
	
	/**
	 * 
	 * @param id
	 */
	public void updateBalance(String id, double amount) {
		Account a = adao.findOne(id);
		if(a == null)
			System.out.println("Account not found! :0");
		else {
			a.setBalance(a.getBalance()+amount);
			adao.update(a);
			System.out.println("Balance updated.\n Current balance: $"+a.getBalance());
		}
	}

}
