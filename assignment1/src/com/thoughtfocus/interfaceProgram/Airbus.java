package com.thoughtfocus.interfaceProgram;

public class Airbus implements Bus,Plane{
	@Override
	public void nameOfBus() {
		System.out.println("bus name is Garuda...");
			
	}
	@Override
	public void ticketPriceOfBus() {
		System.out.println("bus ticket price is :500");
			
	}
	@Override
	public void busTimings() {
		System.out.println("bus timings is 10 am to 10 pm.");
			
	}
	@Override
	public void nameOfPlane() {
		System.out.println("Plane name is Kingfisher");
			
	}
	@Override
	public void ticketPriceOfPlane() {
		System.out.println("Plane ticket price range between 5000 to 50000");
			
	}
	@Override
	public void planeTimings(){
		System.out.println("Plane timings are weekly thrice at 10 pm.");
			
	}
}
