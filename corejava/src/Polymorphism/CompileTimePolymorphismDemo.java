package Polymorphism;

public class CompileTimePolymorphismDemo {
public static void main(String args[]) {
	Friend friend = new Friend();
	Unkown unkown = new Unkown();
	
	human Venkatesh = new human();
	Venkatesh.speak(friend);
	Venkatesh.speak(unkown);
}
}
