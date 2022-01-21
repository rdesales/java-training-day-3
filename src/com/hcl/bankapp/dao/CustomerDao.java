package com.hcl.bankapp.dao;

import java.util.ArrayList;

import com.hcl.bankapp.data.Customer;

public class CustomerDAO extends GenericDAO <Customer> {

	public CustomerDAO(ArrayList<Customer> items) {
		super(items);
	}

	@Override
	public Customer findOne(String id) {
		for(Customer a : items)
			if(a.getId().equals(id))
				return a;
		return null;
	}

	@Override
	public void deleteById(String id) {
		for(Customer a : items)
			if(a.getId().equals(id))
				items.remove(a);
	}

}
