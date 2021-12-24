package com.thoughtFocus.traineeDetails;

public class Tester {
	public static void main(String[] args) {
		TraineeDetails trainee1 = new TraineeDetails();
		trainee1.setId(106587);
		trainee1.setName("Venkatesh");
		trainee1.setPhoneNumber(630952005);
		
		TraineeDetails trainee2 = new TraineeDetails();
		trainee2.setId(106588);
		trainee2.setName("Vamsi");
		trainee2.setPhoneNumber(567178628);
		
		TraineeDetails trainee3 = new TraineeDetails();
		trainee3.setId(106580);
		trainee3.setName("sunil");
		trainee3.setPhoneNumber(967178628);
		
		TraineeDetailsDao dao = new TraineeDetailsDao();
		dao.save(trainee1);
		dao.save(trainee2);
		dao.save(trainee3);
		
		dao.printAll();
		System.out.println("-------------------------------------------------");
		
		String deletebyId = dao.deletebyId(106580);
		System.out.println(deletebyId);
		dao.printAll();
		System.out.println("-------------------------------------------------");
		
		String deletebyName = dao.deletebyName("Venky");
		System.out.println(deletebyName);
		dao.printAll();
		System.out.println("-------------------------------------------------");
		
		dao.updatebyPhoneNumber(630952005, 628177709);
		dao.printAll();
	}
}
