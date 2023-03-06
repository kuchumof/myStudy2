package javaLesson.controlstatement;

public class Controls {
	public static void main(String[] args) {
		int testScore = 95 ;
		System.out.println("You've got");
		if (testScore >= 90) {
			System.out.println("an Excellent");
		} else if (testScore >= 75) {
			System.out.println("a Good");
		} else if (testScore >= 60) {
			System.out.println("a Satisfactory");
		} else {
			System.out.println("an Bad");
		}
		System.out.println("mark");
	}

}
