package com.code4t2.carDealership.models;

import com.code4t2.carDealership.models.CarsModel;
import com.code4t2.carDealership.models.CustomersModel;
import com.code4t2.carDealership.models.PurposesModel;
import com.code4t2.carDealership.models.SalesModel;
import com.code4t2.carDealership.models.ServiceReceiptsModel;

public class InteractionsModel {
	
	private int InteractionID;
	private CustomersModel Customer;
	private SalesModel Sale;
	private ServiceReceiptsModel ServiceReceipt;
	private PurposesModel Purpose;
	private CarsModel Car;
	
	public int getInteractionID() {
		return InteractionID;
	}
	public void setInteractionID(int interactionID) {
		InteractionID = interactionID;
	}
	
	public int getCustomerID() {
		return Customer.getCustomerID();
	}
	public void setCustomerID(int CustomerID) {
		Customer.setCustomerID(CustomerID);
	}
	
	public int getSaleInvoiceID() {
		return Sale.getSalesInvoiceID();
	}
	public void setSaleInvoiceID(int SaleInvoiceID) {
		Sale.setSalesInvoiceID(SaleInvoiceID);
	}
	
	public int getServiceReceiptID() {
		return ServiceReceipt.getServiceReceiptID();
	}
	public void setServiceReceiptID(int ServiceReceiptID) {
		ServiceReceipt.setServiceReceiptID(ServiceReceiptID);
	}
	
	public int getPurposeID() {
		return Purpose.getPurposeID();
	}
	public void setPurposeID(int PurposeID) {
		Purpose.setPurposeID(PurposeID);
	}
	
	public int getCarID() {
		return Car.getCarID();
	}
	public void setCarID(int CarID) {
		Car.setCarID(CarID);
	}
}
