package com.hcl.bankapp.dao;

import java.util.ArrayList;

import com.hcl.bankapp.data.Transaction;

public class TransactionDAO extends GenericDAO <Transaction> {

	public TransactionDAO(ArrayList<Transaction> transactions) {
		super(transactions);
	}

	@Override
	public Transaction findOne(String id) {
		for(Transaction a : items)
			if(a.getId().equals(id))
				return a;
		return null;
	}

	@Override
	public void deleteById(String id) {
		for(Transaction a : items)
			if(a.getId().equals(id))
				items.remove(a);
	}

}
