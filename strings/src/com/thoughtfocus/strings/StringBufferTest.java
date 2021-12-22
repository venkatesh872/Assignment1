package com.thoughtfocus.strings;

public class StringBufferTest {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Welcome ");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.append("ThoughtFocus"));
		System.out.println(sb);

		System.out.println(sb.hashCode());
		System.out.println(sb.insert(4, "HOW"));
		System.out.println(sb.delete(4, 7));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.indexOf("Welcome"));
		System.out.println(sb.indexOf("W"));
		System.out.println(sb.charAt(8));
		System.out.println(sb.substring(8));
		System.out.println(sb.substring(0, 7));
		System.out.println(sb.subSequence(15, 20));
		System.out.println(sb);

		
	}
}
