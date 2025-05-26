package com.product;
import com.manufacturer.Manufacturer;
public class Product {
	
	private String productName;
	private String category;
	private Manufacturer manufacturer;
	private double price;
	
	public Product(String productName, String category,double price,Manufacturer manufacturer) {
		this.productName = productName;
		this.category = category;
		this.manufacturer=manufacturer;
		this.setPrice(price);
	}
	
	//getters and setters
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0) {
			
			this.price=0;
		}
		else {
			
			this.price = price;
		}
		
	}
	
	public String toString() {
		
		return "productName"+productName+"category:"+category+"price:"+price+" manufacturer:"+ manufacturer;
	}
	
	public static Product getProductObject(String productName, String category, double price,Manufacturer manufacturer) {
		return new Product(productName, category, price,manufacturer);
		
	}
	
	
	
	
	
	

}
