package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;
@Service
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {

	
	private AccountDAO accountDAO;
	
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}


	@Override
	@Transactional
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.save(account);
	}


	@Override
	@Transactional
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}

}
