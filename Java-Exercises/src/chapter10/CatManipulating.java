package chapter10;

public class CatManipulating {

	public static void main(String[] args) {
		Cat someCat = new Cat();
		someCat.sayMiau();
		System.out.printf("The color of cat %s is %s.%n",
		someCat.name, someCat.color);
		Cat myBrownCat = new Cat("Johnny", "brown");
		myBrownCat.sayMiau();
		System.out.printf("The color of cat %s is %s.%n",
		myBrownCat.name, myBrownCat.color);

	}

}
