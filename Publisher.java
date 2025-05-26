package com.publisher;

public class Publisher {
	
	private String publisherName;
	private String publisherLocation;
	private String licenseCode;
	
	public Publisher(String publisherName, String publisherLocation, String licenseCode) {
	
		this.publisherName = publisherName;
		this.publisherLocation = publisherLocation;
		this.licenseCode = licenseCode;
		
	}
	
	//getters and setters
	
	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherLocation() {
		return publisherLocation;
	}

	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}

	public String getLicenseCode() {
		return licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		if(licenseCode.startsWith("PUB")&& licenseCode.length()==8) {
			this.licenseCode = licenseCode;
		}
		else {
			this.licenseCode=null;
		}
	}
	public String toString() {
		
		return "Publisher Name: " + "[" + publisherName + "]" + " Publisher Location: " + "[" + publisherLocation + "]"
				+ " License Code" + "[" + licenseCode + "]";
	}
	
	public static Publisher getPublisherObject(String publisherName, String publisherLocation, String licenseCode) {
		
		return new Publisher(publisherName, publisherLocation, licenseCode);
	}
	

}
