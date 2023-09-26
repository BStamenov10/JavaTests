package exeptions;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		fis = new FileInputStream("fileName.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		String tmp = null;
		while ((tmp = in.readLine()) != null) {
		System.out.println(tmp);
		}
		in.close();
		fis.close();
	}

}
