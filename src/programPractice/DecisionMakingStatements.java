package programPractice;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		int age=21;
		// Simple if statement 
		if(age!=0) {
			System.out.println("Simple if statement");
		}
		// if - else statement 
		if(age>18) {
			System.out.println("Age is greater than 18");
		}else {
			System.out.println("Condition failed");
		}
		// if - else if ladder
		if(age==10) {
			System.out.println("if reached");
		}else if(age>0) {
			System.out.println("else if called");
		}else {
			System.out.println("else block called");
		}
		// Nested if statement 
		if(age>18) {
			System.out.println("If statement 1 called");
			if(age>10) {
				System.out.println("Nested if called");
			}else {
				System.out.println("Nested if failed");
			}
		}
			
		
	}

}
