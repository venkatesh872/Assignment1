package com.thoughtfocus.linked_list;

import java.util.LinkedList;
import java.util.Iterator;

public class customLinkedList {

	public static void main(String args[]) {
		LinkedList<Laptop> laptopList= new LinkedList<>();
		Laptop dell = new Laptop("dell","i-7 10thgen",16,75000);
		Laptop hp = new Laptop("hp","i-5 10thgen",16,65000);
		Laptop acer = new Laptop("acer","i-3 10thgen",4,45000);
		Laptop asus = new Laptop("asus","i-7 11thgen",8,65000);
		
		laptopList.add(dell);
		laptopList.add(hp);
		laptopList.add(acer);
		laptopList.add(asus);
		
		java.util.Iterator<Laptop> itr = laptopList.iterator();
		
		while(itr.hasNext()) {
			Laptop laptop = (Laptop)itr.next();
			if (laptop.getRamSize() <16) {
				System.out.println(laptop);
			}
		}
		laptopList.forEach((Laptop)-> {
			System.out.println(Laptop.getName());
			System.out.println(Laptop.getRamSize());
			
		});
		
	
	}
}
