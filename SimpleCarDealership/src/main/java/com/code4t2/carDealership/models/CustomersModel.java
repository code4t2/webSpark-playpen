package com.code4t2.carDealership.models;

public class CustomersModel {

	private int CustomerID;
	private String CustomerName;
	private int CustomerMobile;
	private String CustomerEmail;
	
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	public int getCustomerMobile() {
		return CustomerMobile;
	}
	public void setCustomerMobile(int customerMobile) {
		CustomerMobile = customerMobile;
	}
	
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
		
}
