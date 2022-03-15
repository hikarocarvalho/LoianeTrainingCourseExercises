package loiane.training.course.class11.a.class13;

import java.util.Scanner;

public class FourthExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float firstEvaluationValue,secondEvaluationValue,thirdEvaluationValue,fourthEvaluationValue = 0;
				
		System.out.println("Enter with the first evaluation value: ");
		firstEvaluationValue = scan.nextFloat();
		
		System.out.println("Enter with the second evaluation value: ");
		secondEvaluationValue = scan.nextFloat();
		
		System.out.println("Enter with the third evaluation value: ");
		thirdEvaluationValue = scan.nextFloat();
		
		System.out.println("Enter with the first evaluation value: ");
		fourthEvaluationValue = scan.nextFloat();
		
		float middleEvaluationsValue = (firstEvaluationValue+secondEvaluationValue+thirdEvaluationValue+fourthEvaluationValue)/4;
		
		System.out.println("The middle between these evaluation values is: "+middleEvaluationsValue);
	}
}
