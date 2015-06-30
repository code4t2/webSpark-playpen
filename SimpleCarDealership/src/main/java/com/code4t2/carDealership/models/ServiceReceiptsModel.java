package com.code4t2.carDealership.models;

public class ServiceReceiptsModel {

	private int ServiceReceiptID;
	private int ServiceReceiptAmount;

	public int getServiceReceiptAmount() {
		return ServiceReceiptAmount;
	}
	public void setServiceReceiptAmount(int serviceReceiptAmount) {
		ServiceReceiptAmount = serviceReceiptAmount;
	}
	
	public int getServiceReceiptID() {
		return ServiceReceiptID;
	}
	public void setServiceReceiptID(int serviceReceiptID) {
		ServiceReceiptID = serviceReceiptID;
	} 
	
}
