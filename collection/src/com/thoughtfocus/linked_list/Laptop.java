package com.thoughtfocus.linked_list;

public class Laptop {
	private  String name;
	private String processor;
	private  int ramSize;
	private  double price;
	
	public Laptop(String name,String processor,int ramSize,double price) {
		this.name= name;
		this.processor= processor;
		this.ramSize= ramSize;
		this.price= price;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public  double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", processor=" + processor + ", ramSize=" + ramSize + ", price=" + price + "]";
	}
	

}
