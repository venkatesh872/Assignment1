package com.thoughtfocus.HashCode;

public class HashCodeTest {
	public static void main(String args[]) {
		Bulb bulb = new Bulb();
		System.out.println(bulb.hashCode());
		Bulb bulb1= new Bulb();
		System.out.println(bulb1.hashCode());
	}
}
