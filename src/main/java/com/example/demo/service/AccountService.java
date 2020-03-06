package com.example.demo.service;

import com.example.demo.model.Account;

public interface AccountService {

	
	public Iterable<Account> getAllAccount();
	public Account createAccount(Account account);
}
