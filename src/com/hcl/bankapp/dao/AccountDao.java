package com.hcl.bankapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.hcl.bankapp.data.Account;

public class AccountDAO implements GenericDAO <Account>{ 

	private ArrayList<Account> accounts;
	
	
	public AccountDAO(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	/**
	 * @return the accounts
	 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public Account findOne(String id) {
		for(Account a : accounts)
			if(a.getId().equals(id))
				return a;
		return null;
	}

	@Override
	public List<Account> findAll() {
		return accounts;
	}

	@Override
	public void create(Account entity) {
		accounts.add(entity);
	}

	@Override
	public void update(Account entity) {
		for(Account a : accounts) {
			if(a.equals(entity))
				a = entity;			
		}
	}

	@Override
	public void delete(Account entity) {
		for(Account  a : accounts) {
			if(a.equals(entity)) {
				accounts.remove(entity);
				break;
			}
		}
	}

	@Override
	public void deleteById(String id) {
		for(Account a : accounts)
			if(a.getId().equals(id))
				accounts.remove(a);
	}

	
	
	
}
