package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class ThirdExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the first number: ");
		double firstNumber = scan.nextDouble();
		
		System.out.println("Enter with the second number: ");
		double secondNumber = scan.nextDouble();
		
		System.out.println("The sum of the numbers is: "+ (firstNumber+secondNumber));
	}
}
