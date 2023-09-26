package stringAndTextProcessing;

public class SubstringInText {

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. "
				+ "\nSo we are drinking all the day. We will move out of it in 5 days.";
		System.out.println(text);
		String editText = text.toLowerCase();
		
		int index = editText.indexOf("in");
		int count = 0;
		
		while (index != -1) {
			count++;
			index = editText.indexOf("in", index +1);
			
		}
		System.out.println();
		System.out.println("The substring \'in\' occurs " + count + " times in the text");
		
		

	}

}
