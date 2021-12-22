package ConstructorWithParameters;

public class ParameterizedConstructorTest {
	public static void main(String args[]) {
		//creating objects and passing values
		Student s1= new Student (106587,"Venkatesh");
		Student s2 = new Student (106588,"Vamsi");
		//calling method to display the values of object
		s1.display();
		s2.display();
	}

}
