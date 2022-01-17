package com.thoughtfocus.jdbc.dto;

public class StationaryShopDTO {
	private String name;
	private String type;
	private String brandName;
	private Double price;
	private int quantity;
	private int serialNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(double d) {
		this.price = d;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int i) {
		this.quantity = i;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "StationaryShopDTO [name=" + name + ", type=" + type + ", brandName=" + brandName + ", price=" + price
				+ ", quantity=" + quantity + ", serialNumber=" + serialNumber + "]";
	}
}
