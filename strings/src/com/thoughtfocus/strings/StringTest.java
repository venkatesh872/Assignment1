package com.thoughtfocus.strings;

import java.util.Arrays;

public class StringTest {
	public static void main(String args[]) {
		String str1 = "Venkatesh";
		String str2 =new String (" ThoughtFocus");
		System.out.println("length of str1 is :"+str1.length());
		System.out.println("length of str2 is :"+str2.length());
		System.out.println(str1.indexOf("V"));
		System.out.println(str1.charAt(6));
		System.out.println(str1.concat(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.replace('V','$'));
	}
}
