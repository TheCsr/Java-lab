package ResultPackage;

import StudentPackage.*;

public class Run {
	
	public static void main(String[] args) {
		
		RegisterStudent s1 = new RegisterStudent();
		Result r = new Result();
		r.getResult(s1);
	}

}
