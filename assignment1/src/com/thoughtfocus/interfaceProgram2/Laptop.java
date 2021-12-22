package com.thoughtfocus.interfaceProgram2;

public abstract class Laptop implements Specifications{
	@Override
	public void brand() {
		System.out.println("Laptop brand : HP");
	}
	@Override
	public void ramSize() {
		System.out.println("Laptop RAM size :16GB");
	}
	@Override
	public void processorType(){
		System.out.println("Laptop processor type :Intel core(i-7)");
	}
	@Override
	public void screenSize() {
		System.out.println("Laptop screen size : 14inches");
	}
	@Override
	public void color(){
		System.out.println("Laptop color :Grey");
	}
	@Override
	public void storageType() {
		System.out.println("Laptop storage type :SSD");
	}
}
