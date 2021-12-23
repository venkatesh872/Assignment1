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
		months.save("Oct");
		months.save("Nov");
		months.save("December");
		System.out.println("months added are:");
		
		months.printAll();
		
		System.out.println("*****************************************");
		
		String remove = months.delete("Jan");
		String remove1 = months.delete("Feb");
		System.out.println(remove);
		System.out.println(remove1);

		months.printAll();
		
		System.out.println("*******************************************");
		System.out.println("Updated months are:");
		months.update("Oct","October");
		months.update("Nov", "November");
		months.printAll();
	}
}
