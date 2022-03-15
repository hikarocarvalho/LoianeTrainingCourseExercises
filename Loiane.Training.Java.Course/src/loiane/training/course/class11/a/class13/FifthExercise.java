package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class FifthExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the metter value");
		double metterValue =  scan.nextDouble();
		
		double centimeter = metterValue * 100;
		
		System.out.println("The converted value in centimeter is: "+centimeter);
	}
}
