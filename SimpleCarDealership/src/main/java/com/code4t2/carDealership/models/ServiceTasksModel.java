package com.code4t2.carDealership.models;

import com.code4t2.carDealership.models.MechanicsModel;
import com.code4t2.carDealership.models.ServiceJobsModel;
import com.code4t2.carDealership.models.ServiceReceiptsModel;

public class ServiceTasksModel {

	private int ServiceTaskID;
	private MechanicsModel Mechanic;
	private ServiceJobsModel ServiceJob;
	private ServiceReceiptsModel ServiceReceipt;
	
	public int getServiceTaskID() {
		return ServiceTaskID;
	}
	public void setServiceTaskID(int serviceTaskID) {
		ServiceTaskID = serviceTaskID;
	}
	
	public int getMechanicID() {
		return Mechanic.getMechanicID();
	}
	public void setMechanicID(int MechanicID) {
		Mechanic.setMechanicID(MechanicID);	
	}
	
	public int getServiceJobID() {
		return ServiceJob.getServiceJobID();
	}
	public void setServiceJobID(int ServiceJobID) {
		ServiceJob.setServiceJobID(ServiceJobID);
	}
	
	public int getServiceReceiptID() {
		return ServiceReceipt.getServiceReceiptID();
	}
	public void setServiceReceiptID(int ServiceReceiptID) {
		ServiceReceipt.setServiceReceiptID(ServiceReceiptID);
	}
}
