package com.ibs.entities;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UserDetails")
@NoArgsConstructor
@Getter
@Setter
public class User1 {
	
	@Id
	private int accNo;
	
	
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String aadharNo;
	private String panNo;
	private String dob;
	
	
	
	

	
	
	
}