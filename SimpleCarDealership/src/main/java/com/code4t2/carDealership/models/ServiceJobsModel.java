package com.code4t2.carDealership.models;

import com.code4t2.carDealership.models.PartsModel;

public class ServiceJobsModel {

	private int ServiceJobID;
	private String ServiceJobName;
	private int ServiceJobCost;
	private PartsModel Part;
	
	public int getPartID() {
		return Part.getPartID();
	}
	public void setPartID(int PartID) {
		Part.setPartID(PartID);
	}
	
	public int getServiceJobID() {
		return ServiceJobID;
	}
	public void setServiceJobID(int serviceJobID) {
		ServiceJobID = serviceJobID;
	}
	
	public String getServiceJobName() {
		return ServiceJobName;
	}
	public void setServiceJobName(String serviceJobName) {
		ServiceJobName = serviceJobName;
	}
	
	public int getServiceJobCost() {
		return ServiceJobCost;
	}
	public void setServiceJobCost(int serviceJobCost) {
		ServiceJobCost = serviceJobCost;
	}
	
}
