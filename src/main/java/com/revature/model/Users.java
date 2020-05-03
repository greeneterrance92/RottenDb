package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table
public class Users {
	
	@Id
	@GeneratedValue(generator = "users_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "users_id_seq", allocationSize = 1)
	private int usersid;
	@Column
	private String username;
	@Column
	private String pass; //password is a protected word in SQL 

}
