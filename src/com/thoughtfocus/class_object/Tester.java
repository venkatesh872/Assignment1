package com.thoughtfocus.class_object;

public class Tester {
	public static void main(String args[]) {
		Bike RoyalEnfield= new Bike();
		Bike R15 = new Bike();
		Bike Duke = new Bike();
		System.out.println(RoyalEnfield.wheels);
		System.out.println(R15.wheels);
		System.out.println(Duke.wheels);
		
		RoyalEnfield.color="black";
		R15.color="blue";
		Duke.color="orange";
		System.out.println("RoyalEnfield color is:"+RoyalEnfield.color);
		System.out.println("R15 color is :"+R15.color);
		System.out.println("Duke color is:"+ Duke.color);
		RoyalEnfield.breakingApply();
		R15.breakingApply();
		Duke.breakingApply();
		RoyalEnfield.mileage(40);
		R15.mileage(45);
		Duke.mileage(30);
	}
}
