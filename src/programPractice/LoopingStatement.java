package programPractice;

public class LoopingStatement {

	public static void main(String[] args) {
		
		// for loop 
		// looping level is finite.
		int i =0;
		int k=0;
		for(int j=1;j<=10;++j) {
			i=i+j;
		}
		System.out.println("Sum o the first 10 numbers: "+i);
	
		// while loop
		// looping level is finite
		while(k<=6) {
			System.out.println("Even numbers from 0 to 6: "+k);
			k=k+2;
		}
		// for each
		// looping level is size of array
		String [] books= {"Tamil", "English", "Maths", "Science"};
		for(String book:books) {
			System.out.println(book);
		}
		int z=0;
		// do -while 
		do {
			System.out.println(z);
			z=z+2;
		}while(z<=10);
			
}
}
