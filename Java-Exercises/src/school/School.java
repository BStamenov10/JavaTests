package school;

import java.util.ArrayList;

public class School {
	private String name;
	private ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();

	public School(String name, ArrayList<SchoolClass> schoolClasses) {
		this.name = name;
		this.schoolClasses = schoolClasses;
	}
	
	public String getName() {
		return name;
	}
	
	public void addClass(SchoolClass schoolClass) {
		schoolClasses.add(schoolClass);
	}

	public void displaySchoolInfo() {
		System.out.println("Welcome to school: " + getName() + "\n");
		for (SchoolClass schoolClass : schoolClasses) {
			System.out.println("This is: " + schoolClass.getID() + " class" + 
		". The students in this class are:\n" + schoolClass.getStudents() + 
		"\n\nTheir teachers and desciplines that they teaches are:\n" + schoolClass.getTeachers());
		}
	}

}
