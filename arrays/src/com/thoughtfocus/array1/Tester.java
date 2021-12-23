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
		
		languages.printAll();
		
		System.out.println("*****************************************");
		
		String remove = languages.delete("REACT JS");
		
	
		languages.printAll();
	}
}
