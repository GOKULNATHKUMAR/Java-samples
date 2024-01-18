package programPractice;

public class Variables {
	// instance variable 
		int b=10;
		static int c=15;
	public static void main(String[] args) {
		Variables ref=new Variables();
		//local variable
		int a=5; 
		// local variable able to print into method boy 
		System.out.println(a);
		// instance variable not able to print inside the method, want to create object 
		System.out.println(ref.b);
		// static variable able to print with out object creation
		System.out.println(c);
		
	}

}
