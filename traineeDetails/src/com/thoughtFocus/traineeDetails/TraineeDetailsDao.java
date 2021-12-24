package com.thoughtFocus.traineeDetails;

public class TraineeDetailsDao {
	private TraineeDetails[] details = new TraineeDetails[11];
	private int index = 0;
	
	public void printAll() {
		for (int index =0;index<details.length;index++) {
			if (details[index] != null) {
				System.out.println(details[index]);
			}
		}
	}
	public String save(TraineeDetails EmployeeDetails) {
		if (EmployeeDetails.getName() != null && EmployeeDetails.getId() != 0) {
			details[index] = EmployeeDetails;
			index++;
			return "Employee details are save..";
		}
		return "Employee details are not saved";
	}
	
	
	public String deletebyId(int id) {
		for (int index= 0;index<details.length;index++) {
			if (details[index]!= null) {
				if (id == (details[index].getId())) {
					details[index]=null;
					return "Trainee details deleted by id:"+id;
				
				}
				
			}
		
		}
	return "Trainee details are not deleted";
	}
	
	
	public String deletebyName(String name) {
		for (int index= 0;index<details.length;index++) {
			if (details[index]!= null) {
				if (name.equals(details[index].getName())) {
					details[index]=null;
					return "Trainee details deleted by name :"+name;
				
				}
				
			}
		
		}
	return "Trainee details are not deleted";
	}
	public String deletebyPhoneNumber(long number) {
		for (int index= 0;index<details.length;index++) {
			if (details[index]!= null) {
				if (number == (details[index].getPhoneNumber())) {
					details[index]=null;
					return "Trainee details deleted :"+number;
				
				}
				
			}
		
		}
	return "Trainee details are not deleted";
	}
	public String updatebyPhoneNumber(long oldNumber,long newNumber) {
		for (int index= 0;index<details.length;index++) {
			if (details[index]!= null) {
				if (oldNumber == (details[index].getPhoneNumber())) {
					details[index].setPhoneNumber(newNumber);
					return "Trainee details are updated by phone number:";
				
				}
				
			}
		
		}
	return "Trainee phone number is not updated.";
	}
	
}
