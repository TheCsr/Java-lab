package StudentPackage;

import java.util.*;

public class RegisterStudent implements Student{
	
	public String name, branch;

	public ArrayList<Semester> sems;
	
	@Override
	public String getBranch() {
		// TODO Auto-generated method stub
		return branch;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public RegisterStudent() {
		sems = new ArrayList<>();
		System.out.println("Semester 1");
		sems.add(new Semester());
		System.out.println("Semester 2");
		sems.add(new Semester());
	}
	

}
