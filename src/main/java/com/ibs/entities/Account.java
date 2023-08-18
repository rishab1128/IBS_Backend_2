package com.ibs.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Account")
@NoArgsConstructor
@Getter
@Setter
public class Account {

	
	@Id
	
	private int accNo;
	
	
	private String userId;
	
	private String loginPass;
	private String transPAss;
	
}
	