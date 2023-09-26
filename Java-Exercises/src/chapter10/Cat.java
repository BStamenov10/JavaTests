package chapter10;

public class Cat {

	String name;
	String color;

	public Cat() {

	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void sayMiau() {
		System.out.printf("Cat %s said: Miauuuuuu!%n", name);
	}

}
