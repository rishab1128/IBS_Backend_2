package com.ibs.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.payloads.ApiResponse;
import com.ibs.payloads.User1Dto;
import com.ibs.payloads.AccountDto;
import com.ibs.services.impl.*;

import jakarta.validation.Valid;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")

public class AccountController{
	@Autowired
	private AccountServiceImpl accountService;
	
	@PostMapping("/register")
	public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto accountDto)
	{
		AccountDto createAccountDto = this.accountService.createAccount(accountDto);
		return new ResponseEntity<>(createAccountDto, HttpStatus.CREATED);
	}
	
}