package programPractice;

public class OperatorSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=12;
		// Unary Operator
		// post fix - print then operation
		// Prefix - Operation the print
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(++j);
		System.out.println(--j);
		// Arithmetic operator 
		System.out.println(i+j); // like - , * , /, %
		// relational operator 
		System.out.println(i>j); // like <,>=,<=
		// ternary Operator
		System.out.println((i<j)?"ok":"Notok");
		// assignment operator 
		System.out.println(i=+5); // like =-, =*, =/, =%
		// logical Operator 
		System.out.println((i<j)&&(i>j)); // like || - any one ok 
		

	}

}
