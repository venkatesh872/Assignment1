package com.thoughtfocus.array;

public class Tester {
	public static void main(String[] args) {
		Months months = new Months();
		
		months.save("Jan");
		months.save("Feb");
		months.save("March");
		months.save("April");
		months.save("May");
		months.save("June");
		months.save("July");
		months.save("August");
		months.save("September");
		months.save("October");
		months.save("November");
		months.save("December");
		
		months.printAll();
		
		System.out.println("*****************************************");
		
		String remove = months.delete("Jan");
		
	
		months.printAll();
	}
}
