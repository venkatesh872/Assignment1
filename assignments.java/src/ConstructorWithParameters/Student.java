package ConstructorWithParameters;

public class Student {
	int id;
	String name;
	//creating a parameterized construcor
	Student(int i ,String n){
		id = i;
		name = n;
	}
	//method to display the values
	void display() {
		System.out.println(id +" "+name);
	}

}
