package com.ibs.payloads;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class AccountDto{
	
	@NotNull
	private int AccNo;
	
	@NotNull
	@Size(min = 6 , message = "UserId must be of atleast 6 characters")
	private String UserID;
	
	@NotNull
	@Size(min = 6 , message = "Password must be of atleast 6 characters")
	private String LoginPass;
	
	@NotNull
	@Size(min = 6 , message = "Password must be of atleast 6 characters")
	private String TransPass;
	
	
	
	
}