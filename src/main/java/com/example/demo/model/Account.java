package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountNumber;
	private String accountHolderName;
	private Double initialBalance;
	private AccountType accountType;
	public Account(String accountHolderName, Double initialBalance, AccountType accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.initialBalance = initialBalance;
		this.accountType = accountType;
	}
	
}
