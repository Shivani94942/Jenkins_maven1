package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;
@Service
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;
	

	@Override
	@Transactional
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.save(account);
	}


	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}

}
