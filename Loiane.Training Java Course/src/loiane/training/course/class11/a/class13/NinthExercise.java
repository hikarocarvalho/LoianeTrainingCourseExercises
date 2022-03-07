package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class NinthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the Farenheit value");
		float farenheitValue = scan.nextFloat();
		
		float celsiusValue = (5*(farenheitValue -32)/9);
		System.out.println("The converted value from farenheit to celsius is: "+celsiusValue);
		
	}
}
