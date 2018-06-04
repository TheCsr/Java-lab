package ResultPackage;

import StudentPackage.*;

public class Result {
	
	public float marks = 0, creds = 0, prod = 0, count=0;
	float sgpa = 0;
	float tsgpa=0;
	
	public void getResult(RegisterStudent s) {
		for (Semester sem : s.sems) {
			count++;
			for (Subject sub: sem.subjects) {
				System.out.println("marks: " + sub.marks + " credits: " + sub.credits);
				prod = prod + sub.marks * sub.credits;
				creds = creds + sub.credits;
				sgpa = (prod/creds)/10;
				
			}
			tsgpa+=sgpa;
			System.out.println("Sgpa: "+ sgpa );
		}
		System.out.println("creds: " + creds);
		float gpa = tsgpa/count;
		
		try {
			if (gpa > 10) {
				throw new InvalidSGPAException();
			}
		}
		catch(InvalidSGPAException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("CGPA is " + gpa);
	}

}
