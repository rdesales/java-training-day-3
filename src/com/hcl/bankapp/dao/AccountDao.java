package com.hcl.bankapp.dao;

import java.util.ArrayList;

import com.hcl.bankapp.data.Account;

public class AccountDAO extends GenericDAO <Account>{ 

	
	public AccountDAO(ArrayList<Account> accounts) {
		super(accounts);
	}
	
	@Override
	public Account findOne(String id) {
		for(Account a : items)
			if(a.getId().equals(id))
				return a;
		return null;
	}

	@Override
	public void deleteById(String id) {
		for(Account a : items)
			if(a.getId().equals(id))
				items.remove(a);
	}

	
	
	
}
