package com.thoughtfocus.collection_list;
import java.util.ArrayList;
public class ArrayListMethods {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList();
		
		list.add("java");
		list.add("python");
		list.add("SQL");
		list.add("javascript");
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Developer");
		list1.add("Tester");
		System.out.println(list);
		System.out.println(list1);
		
		
		ArrayList<String> cloneList = (ArrayList<String>)list.clone();
		System.out.println(cloneList);
		
		
		System.out.println(list.contains("python"));
		System.out.println(list.contains("c"));
		System.out.println(list.indexOf("SQL"));
		
		System.out.println(list.lastIndexOf("java"));
		
		System.out.println(list.addAll(list1));
		System.out.println(list.remove(3));
		System.out.println(list.removeAll(cloneList));
		System.out.println(list.set(0,"SQL"));
		System.out.println(list.subList(0,2));

	}

}
