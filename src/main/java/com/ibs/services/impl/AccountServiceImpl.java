package com.ibs.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.entities.Account;
import com.ibs.entities.User1;
import com.ibs.exceptions.ResourceNotFoundException;
import com.ibs.payloads.AccountDto;
import com.ibs.payloads.User1Dto;
import com.ibs.repositories.AccountRepo;
import com.ibs.services.AccountService;

@Service
 public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = this.dtoToAccount(accountDto);
		Account savedaccount = this.accountRepo.save(account);
		return this.accountToDto(savedaccount);
		
		
	}
	
	private Account dtoToAccount(AccountDto accountDto)
	{
		Account account = this.modelMapper.map(accountDto, Account.class);
		return account;
	}
	
	public AccountDto accountToDto(Account account)
	{
		AccountDto accountDto = this.modelMapper.map(account, AccountDto.class);
		return accountDto;
    }

	
}


