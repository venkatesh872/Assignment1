package com.thoughtfocus.abstraction;

public abstract class Bike {
	abstract void breaktype();
	abstract void seattype();
	String color;
	public void color(String color) {
		System.out.println("We have different type of colors");
	}
}
