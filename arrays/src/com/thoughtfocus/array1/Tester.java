package com.thoughtfocus.array1;


public class Tester {
	public static void main(String[] args) {
		ProgrammingLanguages languages = new ProgrammingLanguages();
		
		languages.save("HTML");
		languages.save("CSS");
		languages.save("BOOTSTRAP");
		languages.save("JAVASCRIPT");
		languages.save("PYTHON");
		languages.save("SQL");
		languages.save("JAVA");
		languages.save("NODE JS");
		languages.save("REACT JS");
		languages.save("ANGULAR JS");
		
		System.out.println("Programming languages are added:");
		
		languages.printAll();
		
		System.out.println("*****************************************");
		String remove = languages.delete("REACT JS");
		String remove1 = languages.delete("NODE JS");
		
		System.out.println(remove);
		System.out.println(remove1);
		
	
		languages.printAll();
		System.out.println("*******************************************");
		System.out.println("Updated Programming laguages are:");
		languages.update("SQL","MySQL");
		languages.update("JAVA", "CORE JAVA");
		languages.printAll();
	}
}
