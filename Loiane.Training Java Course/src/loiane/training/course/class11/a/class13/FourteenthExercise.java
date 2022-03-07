package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class FourteenthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the size of the archive: ");
		float archiveSize = scan.nextFloat();
		
		System.out.println("Enter with the velocity of the internet connection: ");
		int velocity = scan.nextInt();
		
		float time = (archiveSize/(velocity/8));
		
		System.out.println("The download duration of this archive is: "+time+" seconds.");
	}
}
