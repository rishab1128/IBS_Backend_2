package com.ibs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.entities.Account;


public interface AccountRepo extends JpaRepository<Account, Integer>{

}
