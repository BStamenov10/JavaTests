package definingOfClasses;

enum Specialization {
	COMPUTER_SCIENCE, ENGINEERING, MATHEMATICS, BIOLOGY, BUSINESS
}

enum University {
	MIT, HARVARD, STANFORD, CALTECH, YALE
}

public class Student {

	private String firstName;
	private String secondName;
	private String surname;
	private int course;
	private Specialization specialization;
	private University university;
	private String email;
	private String phoneNumber;

	private static int countStudents = 0;

	public Student(String firstName, String secondName, String surname, int course, Specialization specialization,
			University university, String email, String phoneNumber) {

		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.course = course;
		this.specialization = specialization;
		this.university = university;
		this.email = email;
		this.phoneNumber = phoneNumber;

		countStudents++;
	}
	
	public Student() {
		countStudents++;
	}

	public Student(String firstName, String secondName, String surname, int course, String email, String phoneNUmber) {
		this(firstName, secondName, surname, course, null, null, email, phoneNUmber);
		countStudents++;

	}

	public Student(String firstName, University university, String email) {
		this(firstName, null, null, 0, null, university, email, null);
		countStudents++;
	}
	
	public static int numberOfStudents() {
		return countStudents;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void getInfo() {
		System.out.printf(
				"Student's name: %s %s %s, from %d course, specialization with %s "
						+ "from %s university.%nEmail address: %s%nPhone number: %s%n%n",
				firstName, secondName, surname, course, specialization, university, email, phoneNumber);
	}

}
