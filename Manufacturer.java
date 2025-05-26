package com.manufacturer;

public class Manufacturer {

	private String manufacturerName;
	private String manufacturerAddress;
	private String registrationNumber;

	private Manufacturer(String manufacturerName, String manufacturerAddress, String registrationNumber) {
		this.manufacturerName = manufacturerName;
		this.manufacturerAddress = manufacturerAddress;
		this.setRegistrationNumber(registrationNumber);
	}

	// getters and setters

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		if(registrationNumber!=null && registrationNumber.length()==10) {
			this.registrationNumber=registrationNumber;
		}
		else {
			this.registrationNumber = null;
		}
	}

	public String toString() {
		return "Manufacturer:" + "[" + manufacturerName + "]" + "reg#:" + "[" + registrationNumber + "]" + "Address:"
				+ "[" + manufacturerAddress + "]";
	}

	public static Manufacturer getManufacturerObject(String manufacturerName, String manufacturerAddress,
			String registrationNumber) {

		if (manufacturerName == null || manufacturerAddress == null || registrationNumber == null) {
			return null;
		}

		return new Manufacturer(manufacturerName, manufacturerAddress, registrationNumber);

	}

}
