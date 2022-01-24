package com.hcl.bankapp.service;

import com.hcl.bankapp.dao.AccountDAO;
import com.hcl.bankapp.dao.CustomerDAO;
import com.hcl.bankapp.dao.TransactionDAO;

public class TransactionService {

	private AccountDAO adao;
	private CustomerDAO cdao;
	private TransactionDAO tdao;
	
	/**
	 * Constructor
	 * @param adao
	 * @param cdao
	 * @param tdao
	 */
	public TransactionService(AccountDAO adao, CustomerDAO cdao, TransactionDAO tdao) {
		this.adao = adao;
		this.cdao = cdao;
		this.tdao = tdao;
	}
	
	public void makeTransaction(String idSenderAccount, String idReceiverAccount, double amount) {
		
	}
}
