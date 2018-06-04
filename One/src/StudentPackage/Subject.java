package StudentPackage;

import java.util.Scanner;

public class Subject {
	
	public int marks, credits;
	
	Subject() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks for subject\n");
		marks = s.nextInt();
		System.out.println("Enter credits for subject\n");
		credits = s.nextInt();
	}

}
