package school;

import java.util.ArrayList;

public class Teacher {

	private String name;
	private ArrayList<Discipline> disciplines = new ArrayList<Discipline>();;

	public Teacher(String name, ArrayList<Discipline> disciplines) {
		this.name = name;
		this.disciplines = disciplines;
	}

	public String getName() {
		return name;
	}

	public void addDiscipline(Discipline discipline) {
		disciplines.add(discipline);
	}
	
	public String getDescipline() {
		StringBuilder sb = new StringBuilder();

		for (Discipline discipline : disciplines) {
			sb.append(discipline.toString()).append("\n");
		}

		return sb.toString();
	}

	@Override
	public String toString() {
		return "Teacher: " + name + ", this teacher teaches these disciplines:\n" + getDescipline();
	}
	
	

}
