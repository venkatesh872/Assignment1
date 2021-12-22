package CompileTimePolymorphism;

public class CompileTest {
	public static void main(String args[]) {
		Test obj = new Test();
		System.out.println(obj.sum(10, 20))	;
		System.out.println(obj.sum(1,2,3))	;
		System.out.println(obj.sum(1.1,2.2));
		System.out.println(obj.sum(5,3.3,8));
		}

}
