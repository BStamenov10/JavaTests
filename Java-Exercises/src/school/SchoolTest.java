package school;

import java.util.ArrayList;

public class SchoolTest {

	public static void main(String[] args) {

		ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		ArrayList<Discipline> disciplines = new ArrayList<Discipline>();
		
		School paisiiHilendarski = new School("Паисий Хилендарски", schoolClasses);
		SchoolClass Bclass = new SchoolClass('B', teachers, students);
		
		paisiiHilendarski.addClass(Bclass);
		
		Student student1 = new Student("Alexander Petrov", 1);
		Student student2 = new Student("Alexandra Georgieva", 2);
		Student student3 = new Student("Petko Petkov", 17);
		Student student4 = new Student("Mariya Sevlieva", 20);
		Bclass.addStudent(student1);
		Bclass.addStudent(student2);
		Bclass.addStudent(student3);
		Bclass.addStudent(student4);

		Discipline math = new Discipline("Math", 4, 2);
		Discipline english = new Discipline("English", 6, 5);
		Discipline sport = new Discipline("Sport", 3, 1);
		
		disciplines.add(math);
		disciplines.add(sport);
		disciplines.add(english);
		
		Teacher teacher1 = new Teacher("Ivanka Penkova",disciplines);
		Teacher teacher2 = new Teacher("Georgi Hristov",disciplines);
		Teacher teacher3 = new Teacher("Dimitar Jordanov",disciplines);

		Bclass.addTeacher(teacher1);
		Bclass.addTeacher(teacher2);
		Bclass.addTeacher(teacher3);

		
		paisiiHilendarski.displaySchoolInfo();
		
	}

}
