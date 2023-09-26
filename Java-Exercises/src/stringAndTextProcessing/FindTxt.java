package stringAndTextProcessing;

public class FindTxt {

	public static void main(String[] args) {

		String txt = "The main subject in the \\\"Intro Java\\\"\" +\r\n" + "\" book is Java for Java newbies.\"";
		int index = txt.indexOf("Java");
		int count = 0;

		if (index != -1) {
			while (index != -1) {
				count++;
				System.out.println("\"Java\" found on index: " + index);
				index = txt.indexOf("Java", index + 1);
			}
		} else {
			System.out.println("\"Java\" not found");
			return;
		}
		
		System.out.println("\n\"Java\" found: " + count + " times");
	}

}
