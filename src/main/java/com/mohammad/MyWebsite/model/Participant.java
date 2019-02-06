package com.mohammad.MyWebsite.model;

public class Participant {

	
	private String name;
	private String category;
	private double balance;
	
	
	
	
	
	
	
	public Participant(String name, String category, double balance) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.category = category;
		this.balance = balance;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
