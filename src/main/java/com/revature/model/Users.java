package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="Users")

public class Users {
	
	@Id




	@GeneratedValue(generator = "users_usersid_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "users_usersid_seq", allocationSize = 1)
	private int usersid;
	@Column
	private String username;
	@Column
	private String pass; //password is a protected word in SQL 
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int usersid, String username, String pass) {
		super();
		this.usersid = usersid;
		this.username = username;
		this.pass = pass;
	}
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + usersid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (usersid != other.usersid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Users [usersid=" + usersid + ", username=" + username + ", pass=" + pass + "]";
	}
	
	 

}
