package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class EigthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much is your gain per hour?");
		float gainPerHour = scan.nextFloat();
		
		System.out.println("How much do you work by month?");
		int hourByMonth = scan.nextInt();
		
		float monthSalary = gainPerHour * hourByMonth;
		System.out.println("Your salary by month is: " + monthSalary);
		
	}
}
