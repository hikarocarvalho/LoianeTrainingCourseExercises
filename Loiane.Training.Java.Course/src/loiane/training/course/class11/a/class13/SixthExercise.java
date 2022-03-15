package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class SixthExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the ray of the circle ");
		float circleRay = scan.nextFloat();
		float circleArea = (float) (3.14f * Math.pow(circleRay,2));
		System.out.println("The area from this circle is: "+circleArea);
	}
}
