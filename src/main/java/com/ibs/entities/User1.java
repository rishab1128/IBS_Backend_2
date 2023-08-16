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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AccNo;
	
	@Column(name = "FirstName",nullable = false , length = 100)
	private String FirstName;
	private String LastName;
	private String Mobile;
	private String Email;
	private String AadharNo;
	private String PanNo;
	private String DOB;
	
	
	
	

	
	
	
}