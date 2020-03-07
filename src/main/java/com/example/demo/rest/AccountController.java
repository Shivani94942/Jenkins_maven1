package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {

	
	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	@RequestMapping("/accounts")
	public List<Account> getAllAccounts() {

		return accountService.getAllAccounts();
	}

	@PostMapping("/accounts")
	public Account createAccount(@RequestBody Account account) {

		return accountService.createAccount(account);
	}
}
