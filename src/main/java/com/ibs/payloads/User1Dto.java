package com.ibs.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class User1Dto {
	
	private int AccNo;
		
	
	@NotNull
	
	private String FirstName;
	
	@NotNull
	private String LastName;
	

	
	
	@NotNull
	@Size(min = 10 , message = "Mobile Number Ivalid")
	private String Mobile;
	
	@Email(message = "Email address is invalid")
	private String Email;
	
	@NotNull
	@Size(min = 16 , message = "Invalid entry")
	private String AadharNo;
	
	@NotNull
	private String PanNo;
	
	@NotNull
	private String DOB;
}