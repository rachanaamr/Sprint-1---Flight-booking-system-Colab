package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userId;
	
	private String email;
	private String password;
	private String fName;
	private String lName;
	private int contactNo;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String email, String password, String fName, String lName, int contactNo) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.contactNo = contactNo;
	}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
}
