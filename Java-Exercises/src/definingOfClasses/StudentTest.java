package definingOfClasses;

public class StudentTest {

	private static Student[] student = new Student[2];
	
	public static void initializeStudents() {
		student[0] = new Student("Bozhidar", "Petrov", "Stamenov", 2, Specialization.COMPUTER_SCIENCE,
				University.STANFORD, "bjstamenov@gmail.com", "0887314134");

		student[1] = new Student("Ivan", "Georgiev", "Dragiev", 4, "teadlan@gmail.com", "0887301746");
		student[1].setSpecialization(Specialization.BIOLOGY);
		student[1].setUniversity(University.HARVARD);
	}
	
	public static void getStudentsInfo() {
		 for(Student student : student) {
			student.getInfo();
		}
	}

	public static void main(String[] args) {

		initializeStudents();
		
		StudentTest.getStudentsInfo();
		
		System.out.println("Number of created Student objects is: "+Student.numberOfStudents());

	}

}
