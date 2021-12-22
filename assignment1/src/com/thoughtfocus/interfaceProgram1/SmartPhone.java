package com.thoughtfocus.interfaceProgram1;

public class SmartPhone implements GoogleMaps,GooglePay{
	@Override
	public void start(){
		System.out.println("Starts the google map.");
			
	}
	@Override
	public void follow(){
		System.out.println("Follows the google map route.");
			
	}
	@Override
	public void end(){
		System.out.println("Stop the google map after reaching our destination.");
			
	}
	@Override
	public void money(){
		System.out.println("Enter the money of 500 rupees.");
			
	}
	@Override
	public void payingFor(){
		System.out.println("for paying the rechargebills.");
			
	}
	@Override
	public void transferBy(){
		System.out.println("transfer by QR code.");
			
	}
	
}
