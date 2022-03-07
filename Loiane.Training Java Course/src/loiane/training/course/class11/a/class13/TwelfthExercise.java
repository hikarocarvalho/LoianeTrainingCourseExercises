package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class TwelfthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with your height: ");
		float personHeight = scan.nextFloat();
		
		float idealWeight = (72.7f * personHeight) - 58;
		
		System.out.println("The ideal Weight of this person is: "+idealWeight);
	}
}
