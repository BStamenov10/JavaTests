package school;

public class Student {

	private String name;
	private int numberInClass;
	
	public Student(String name, int numberInClass) {
		this.name = name;
		this.numberInClass = numberInClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberInClass() {
		return numberInClass;
	}

	public void setNumberInClass(int numberInClass) {
		this.numberInClass = numberInClass;
	}

	@Override
	public String toString() {
		return "Student: " + name + " - №: " + numberInClass;
	}

}
