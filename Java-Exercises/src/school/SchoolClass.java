package school;

import java.util.ArrayList;

public class SchoolClass {
	private char ID;
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();;
	private ArrayList<Student> students = new ArrayList<Student>();

	public SchoolClass(char ID, ArrayList<Teacher> teachers, ArrayList<Student> students) {
		this.ID = ID;
		this.teachers = teachers;
		this.students = students;
	}

	public char getID() {
		return ID;
	}

	public String getTeachers() {
		StringBuilder sb = new StringBuilder();

		for (Teacher teacher : teachers) {
			sb.append(teacher.toString()).append("\n");
		}

		return sb.toString();
	}

	public String getStudents() {
		StringBuilder sb = new StringBuilder();

		for (Student student : students) {
			sb.append(student.toString()).append("\n");
		}

		return sb.toString();
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public String toString() {
		return "SchoolClass [teachers=" + teachers + ", students=" + students + "]";
	}

}
