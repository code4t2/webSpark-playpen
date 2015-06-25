package com.code4t2.carDealership.models;

import com.code4t2.carDealership.models.PaymentTypesModel;
import com.code4t2.carDealership.models.SalespersonsModel;

public class SalesModel {
	
	private int SalesInvoiceID;
	private int SalesAmount;
	private SalespersonsModel Salesperson;
	private PaymentTypesModel PaymentTypes;
	
	public int getSalesInvoiceID() {
		return SalesInvoiceID;
	}
	public void setSalesInvoiceID(int salesInvoiceID) {
		SalesInvoiceID = salesInvoiceID;
	}
	
	public int getSalesAmount() {
		return SalesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		SalesAmount = salesAmount;
	}
	
	public int getSalespersonID() {
		return Salesperson.getSalespersonID();
	}
	public void setSalespersonID(int SalespersonID) {
		Salesperson.setSalespersonID(SalespersonID);
	}
	
	public int getPaymentTypeID() {
		return PaymentTypes.getPaymentTypeID();
	}
	public void setPaymentTypeID(int PaymentTypeID) {
		PaymentTypes.setPaymentTypeID(PaymentTypeID);
	}
}
