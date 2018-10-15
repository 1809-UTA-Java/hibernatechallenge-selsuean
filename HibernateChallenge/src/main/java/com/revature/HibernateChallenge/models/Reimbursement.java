package com.revature.HibernateChallenge.models;

import java.sql.Timestamp;

public class Reimbursement {
	private int rID;
	private float amount;
	private String description;
	private Timestamp timeSubmitted;
	private Timestamp timeResolved;
	private String author;
	private String resolver;
	private String type;
	private String status;

	public Reimbursement(int rID, float amount, String description, Timestamp timeSubmitted, Timestamp timeResolved,
			String author, String resolver, String type, String status) {
		super();
		this.rID = rID;
		this.amount = amount;
		this.description = description;
		this.timeSubmitted = timeSubmitted;
		this.timeResolved = timeResolved;
		this.author = author;
		this.resolver = resolver;
		this.type = type;
		this.status = status;
	}

	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTimeSubmitted() {
		return timeSubmitted;
	}

	public void setTimeSubmitted(Timestamp timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}

	public Timestamp getTimeResolved() {
		return timeResolved;
	}

	public void setTimeResolved(Timestamp timeResolved) {
		this.timeResolved = timeResolved;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getResolver() {
		return resolver;
	}

	public void setResolver(String resolver) {
		this.resolver = resolver;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reimbursement [rID=" + rID + ", amount=" + amount + ", description=" + description + ", timeSubmitted="
				+ timeSubmitted + ", timeResolved=" + timeResolved + ", author=" + author + ", resolver=" + resolver
				+ ", type=" + type + ", status=" + status + "]";
	}

}
