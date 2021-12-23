package com.thoughtfocus.array;

public class Months {
	private String []months = new String[12];
	private int index =0;
	
	public void printAll() {
		for (int index = 0; index <months.length;index++) {
			if (months[index]!= null) {
				System.out.println(months[index]);
			}
		}
	}
	public boolean save(String month) {
		if (index <12) {
			months[index]= month;
			index++;
		}else {
			System.out.println("month is not added");
			return false;
		}
		return false;
	}
	public String delete(String month) {
		for (int index = 0; index < months.length;index++) {
			if(months[index] != null) {
				if(months[index].equals(month)) {
					months[index] = null;
					return "month deleted";
				}	
				
			}
		
		}	
		return "month not deleted";
	}
	public String update(String oldName,String newName) {
		for (int index = 0;index<months.length;index++) {
			if(months[index] != null) {
				if(months[index].equals(oldName)) {
					months[index] = newName;
					return "Month is updated";
				}
			}
		
		}
		return "Month is not updated";
	}
}
