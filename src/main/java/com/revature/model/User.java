package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String username;
	
	private String password;
	
	private long mobileno;
	
	private String emailid;
	
	private String active;
	
	private String role;


	public User(){}
	public User(int id,String name, String username, String password, long mobileno, String emailid, String active, String role) {
		super();
		this.id = id;
		this.name =name;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.active = active;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
	    return id+" "+username+" "+password+" "+mobileno+" "+emailid+" "+active+" "+role;
	}

}
