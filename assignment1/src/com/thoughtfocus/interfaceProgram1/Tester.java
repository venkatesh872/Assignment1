package com.thoughtfocus.interfaceProgram1;


public class Tester {
	public static void main(String args[]) {
		SmartPhone mobile = new SmartPhone();
		System.out.println("Google Map Information:");
		mobile.start();
		mobile.follow();
		mobile.end();
		System.out.println("------------------------------");
		System.out.println("GooglePay Information:");
		mobile.money();
		mobile.payingFor();
		mobile.transferBy();

}
}
