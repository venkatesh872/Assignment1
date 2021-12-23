package com.thoughtfocus.array1;

public class ProgrammingLanguages {
	private String []languages = new String[10];
	private int index =0;
	
	public void printAll() {
		for (int index = 0; index <languages.length;index++) {
			System.out.println(languages[index]);
		}
	}
	public boolean save(String language) {
		if (index <12) {
			languages[index]= language;
			index++;
		}else {
			System.out.println("programming language is not added");
			return false;
		}
		return false;
	}
	public String delete(String language) {
		for (int index = 0; index < languages.length;index++) {
			if(languages[index].equals(language)) {
				languages[index] = null;
				return "programming language is deleted";
			}	
		}
		return "programming language is not deleted";
	}

}
