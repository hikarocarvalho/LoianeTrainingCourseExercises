package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class SeventhExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the side of the square");
		float sideSquare = scan.nextFloat();
		
		float doubleArea = (float)(2*(Math.pow(sideSquare,2)));
		System.out.println("The double area from this square is: " + doubleArea );
	}
}
