package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
@Repository
//public interface AccountDAO extends CrudRepository<Account, Integer>{
public interface AccountDAO extends JpaRepository<Account, Integer>{	
}
