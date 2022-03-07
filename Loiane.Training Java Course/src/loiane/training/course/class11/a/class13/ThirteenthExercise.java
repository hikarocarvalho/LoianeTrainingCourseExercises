package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class ThirteenthExercise {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much is your gain per hour?");
		float gainPerHour = scan.nextFloat();
		
		System.out.println("How much do you work by month?");
		int hourByMonth = scan.nextInt();
		
		float monthSalary = gainPerHour * hourByMonth;
		
		// tax
		float inss = monthSalary * 0.08f;
		float ir = monthSalary * 0.11f;
		float sindicate = monthSalary * 0.05f;
		
		// liquid salary
		float liquidSalary = monthSalary - (inss+ir+sindicate);
		
		System.out.println("Your Inss this month is: " + inss);
		System.out.println("Your Sindicate this month is: " + sindicate);
		System.out.println("Your liquid salary this month is: " + liquidSalary);
		System.out.println("Your Full Salary this month is: " + monthSalary);
		
	}
}
