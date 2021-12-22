package com.thoughtfocus.interfaceProgram;

public class Tester {
	public static void main(String args[]) {
		Airbus airBus = new Airbus();
		System.out.println("Bus Details:");
		airBus.nameOfBus();
		airBus.ticketPriceOfBus();
		airBus.busTimings();
		System.out.println("------------------------------");
		System.out.println("Plane Details:");
		airBus.nameOfPlane();
		airBus.ticketPriceOfPlane();
		airBus.planeTimings();
		
	}

}
