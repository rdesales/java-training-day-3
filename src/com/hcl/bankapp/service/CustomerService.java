package com.hcl.bankapp.service;

import java.util.Scanner;

import com.hcl.bankapp.dao.AccountDAO;
import com.hcl.bankapp.dao.CustomerDAO;

public class CustomerService {
	
	
	private CustomerDAO cdao;
	private AccountDAO adao;

	
	/**
	 * 
	 * @param idCustomer
	 * @return
	 */
	public boolean login(String idCustomer) {
		if(adao.findOne(idCustomer) != null)
			return true;
		return false;
		
	}
	
	public void createCustomerAccount() {
		System.out.println("Let's create a new account. ");
		
	}
	
	
	
	

	
	
}
