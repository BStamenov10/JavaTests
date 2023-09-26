package definingOfClasses;

/**
 * 
 */
public class Dog implements Barking {

	private String name;
	private int age;
	private double length;
	private Collar collarSize;
	private static int count = 0;

	public Dog() {
		count++;
	}

	public Dog(String name, int age, double length, int CollarSize) {
		this.name = name;
		this.age = age;
		this.length = length;
		this.collarSize = new Collar(CollarSize);
		count++;
	}

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Collar getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(Collar size) {
		this.collarSize = size;

	}

	@Override
	public void bark() {
		System.out.println(getName() + ": \"WooW-WooW\"");

	}

	public void getInfo() {
		System.out.print("Dog's name: " + this.name + "; age: " + this.age + "; often says: ");
		bark();
	}

	@Override
	public String toString() {
		return "Dog name = " + name + ", age = " + age + ", length = " + length + ", size = " + collarSize;
	}

	public static void main(String[] args) {

		Dog dog = new Dog("Bobby", 12, 12.5, 10);

		System.out.println(dog);

		Dog secondDog = new Dog();

		secondDog.setName("Ivancho");
		secondDog.setAge(5);
		secondDog.setLength(7.2);
		secondDog.setCollarSize(new Collar(15));

		System.out.println(secondDog);
		secondDog.bark();
		System.out.println();

		System.out.println(Dog.getCount());

		dog.getInfo();

	}

}
