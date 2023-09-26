package definingOfClasses;

public class Collar {

	public int size;

	public Collar() {

	}

	public Collar(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return Integer.toString(size);
	}

}
