package com.revature.HibernateChallenge.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@Column(name="U_ID")
	private int userID;
	
	@Column(name="U_USERNAME")
	private String username;
	
	@Column(name="U_PASSWORD")
	private String password;
	
	@Column(name="U_FIRSTNAME")
	private String firstName;
	
	@Column(name="U_LASTNAME")
	private String lastName;
	
	@Column(name="U_EMAIL")
	private String email;
	
	

	public User(int userID, String username, String password, String firstName, String lastName, String email) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public User() {
	}
}

	