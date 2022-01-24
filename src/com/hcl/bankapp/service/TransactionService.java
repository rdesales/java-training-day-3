package com.hcl.bankapp.service;

import com.hcl.bankapp.dao.AccountDAO;

import java.util.Date;
import java.util.UUID;
//import java.time.format.DateTimeFormatter;  
//import java.time.LocalDateTime;    

//import com.hcl.bankapp.dao.CustomerDAO;
import com.hcl.bankapp.dao.TransactionDAO;
import com.hcl.bankapp.data.Account;
import com.hcl.bankapp.data.Transaction;
import com.hcl.bankapp.enums.TransactionType;

public class TransactionService {

	private AccountDAO adao;
	//private CustomerDAO cdao;
	private TransactionDAO tdao;
	
	/**
	 * Constructor
	 * @param adao
	 * @param cdao
	 * @param tdao
	 */
	public TransactionService(AccountDAO adao, TransactionDAO tdao) {
		this.adao = adao;
		//this.cdao = cdao;
		this.tdao = tdao;
	}
	
	public void makeTransaction(String idSenderAccount, String idReceiverAccount, double amount) {
		System.out.println("Begining transaction.....");
		System.out.println("Validating data.....");
		Account sender = adao.findOne(idSenderAccount);
		Account receiver = adao.findOne(idReceiverAccount);
		//Accounts not found
		if(sender == null || receiver == null) {
			System.out.println("Invalid accounts. Please verify your information.");
			return;
		}
		//amount bigger than sender balance
		if(amount > sender.getBalance()) {
			System.out.println("Insuficient funds in your account.");
			return;
		}
		//So this is a valid transaction
		
		//updating balances in both accounts
		sender.setBalance(sender.getBalance() - amount);
		receiver.setBalance(receiver.getBalance() + amount);
		//Building transactions for record
		String id = UUID.randomUUID().toString(); 	// Random String
		Date date = new Date();					  	//Date
		Transaction t1 = new Transaction(id, sender.getCustomer().getId(), sender.getId(), amount, TransactionType.DEBIT, date);
		Transaction t2 = new Transaction(id, receiver.getCustomer().getId(), receiver.getId(), amount, TransactionType.CREDIT, date);
		//Updating record
		tdao.create(t1);
		tdao.create(t2);
		System.out.println("Transaction done.\n Details bellow:\n" + t1);
				
	}
	

}
