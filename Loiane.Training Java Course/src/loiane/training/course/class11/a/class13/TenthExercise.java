package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class TenthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the celsius value");
		float celsiusValue = scan.nextFloat();
		
		float farenheitValue = ((celsiusValue*9)/5)+32;
		System.out.println("The converted value from celsius to farenheit is: "+farenheitValue);
		
	}
}
