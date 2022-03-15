package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class EleventhExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the first integer value: ");
		int firstValue = scan.nextInt();
		
		System.out.println("Enter with the second integer value");
		int secondValue = scan.nextInt();
		
		System.out.println("Enter with the floating number");
		float thirdValue = scan.nextFloat();
		
		// letter a
		float resultA = (2*firstValue)*(secondValue/2);
		
		// letter b
		float resultB = (3*firstValue)+thirdValue;		
		
		// letter c
		float resultC = (float) (Math.pow(thirdValue, 3));
		
		System.out.println("Product from a double first number with half of the second: "+resultA);
		System.out.println("Sum of the Triple of the first number with the third number: "+resultB);
		System.out.println("The cube of the third number: "+resultC);
		
	}
}
