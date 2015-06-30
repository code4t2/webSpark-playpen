package com.code4t2.carDealership.test;

public class TestUser {
	
	private String FirstName;
	private String LastName;
	private int EmailPromotion;
	
	public TestUser(String FirstName, String LastName, int EmailPromotion) {
		// TODO Auto-generated constructor stub
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setEmailPromotion(EmailPromotion);
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public int getEmailPromotion() {
		return EmailPromotion;
	}
	public void setEmailPromotion(int emailPromotion) {
		EmailPromotion = emailPromotion;
	} 
	
}
