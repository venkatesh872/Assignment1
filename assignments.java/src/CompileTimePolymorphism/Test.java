package CompileTimePolymorphism;

public class Test {
	int sum(int a,int b) {
		return (a+b);
	}
	int sum(int a,int b,int c) {
		return (a+b+c);
	}
	int sum(int a,double b,int c) {
		return (int)(a+b+c);
	}
	int sum(double a,double b) {
		return (int) (a+b);
	}
}
