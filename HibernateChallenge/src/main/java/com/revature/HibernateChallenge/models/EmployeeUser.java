package com.revature.HibernateChallenge.models;

import java.util.List;

public class EmployeeUser extends User {
	//private List<Reimbursement> rm;
	
	Reimbursement rm;

	public EmployeeUser() {
		super();
	}

	public EmployeeUser(int userID, String username, String password, String firstName, String lastName, String email) {
		super(userID, username, password, firstName, lastName, email);
	}
	
	
}
