package definingOfClasses;

public class Display {

	private double size;
	private String color;

	public Display() {

	}

	public Display(double size, String color) {
		this.size = size;
		this.color = color;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Size of the display (" + size + " inches) and  the color is: \"" + color + "\"";
	}

}
