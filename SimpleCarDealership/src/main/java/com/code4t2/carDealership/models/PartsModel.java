/**
 * 
 */
package com.code4t2.carDealership.models;

/**
 * @author titu.bg
 *
 */
public class PartsModel {
	
	private int PartID;
	private String PartName;
	private int PartPrice;
	
	public int getPartID() {
		return PartID;
	}
	public void setPartID(int partID) {
		PartID = partID;
	}
	
	public String getPartName() {
		return PartName;
	}
	public void setPartName(String partName) {
		PartName = partName;
	}
	
	public int getPartPrice() {
		return PartPrice;
	}
	public void setPartPrice(int partPrice) {
		PartPrice = partPrice;
	}
	
}
