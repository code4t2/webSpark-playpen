package com.code4t2.carDealership.models;

public class MechanicsModel {

	private int MechanicID;
	private String MechanicName;
	private int MechanicMobile;
	private String MechanicEmail;
	
	public int getMechanicID() {
		return MechanicID;
	}
	public void setMechanicID(int mechanicID) {
		MechanicID = mechanicID;
	}
	
	public String getMechanicName() {
		return MechanicName;
	}
	public void setMechanicName(String mechanicName) {
		MechanicName = mechanicName;
	}
	
	public int getMechanicMobile() {
		return MechanicMobile;
	}
	public void setMechanicMobile(int mechanicMobile) {
		MechanicMobile = mechanicMobile;
	}
	
	public String getMechanicEmail() {
		return MechanicEmail;
	}
	public void setMechanicEmail(String mechanicEmail) {
		MechanicEmail = mechanicEmail;
	}
	
}
