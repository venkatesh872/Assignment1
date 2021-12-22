class NestedIf {
	public static void main(String val[]){
	String name ="focus";
	if (name == "force"){
		System.out.println("first condition is true");
		if (name.endsWith("us")){
			System.out.println("Second condition is true");
		}	
		else{
			System.out.println("first condition is false");
		}
	}
	else{
		System.out.println("first condition is true");
		if (name =="focus"){
			System.out.println("third condition is true");
		}	
		else{
			System.out.println("third condition is false");
		}
	}
	}
}