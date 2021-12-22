package com.thoughtfocus.strings;

public class StringBuilderTest {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.append("Developers"));
		System.out.println(sb);

		System.out.println(sb.hashCode());
		System.out.println(sb.insert(4, "HOW"));
		System.out.println(sb.delete(4, 7));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.indexOf("Hello"));
		System.out.println(sb.indexOf("D"));
		System.out.println(sb.charAt(8));
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(0, 6));
		System.out.println(sb.subSequence(6, 16));
		System.out.println(sb);

		
	}
}
