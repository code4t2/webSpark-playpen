/**
 * 
 */
package com.code4t2.carDealership.models;

/**
 * @author titu.bg
 *
 */
public class PaymentTypesModel {
	
	private int PaymentTypeID;
	private String PaymentType;
	
	/**
	 * @return the paymentTypeID
	 */
	public int getPaymentTypeID() {
		return PaymentTypeID;
	}
	/**
	 * @param paymentTypeID the paymentTypeID to set
	 */
	public void setPaymentTypeID(int paymentTypeID) {
		PaymentTypeID = paymentTypeID;
	}
	
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	
}
