package StudentPackage;

import java.util.*;

public class Semester {
	
	public ArrayList<Subject> subjects;
	
	Semester() {
		subjects = new ArrayList<>();
		subjects.add(new Subject());
		subjects.add(new Subject());
		
		int total = 0;
		for (Subject s : subjects) {
			total = total + s.credits;
		}
		
		try {
			if (total > 30){
				throw new CreditLimit();
			}
		}
		catch (CreditLimit e) {
			System.out.println(e.toString());
		}
	}

}
