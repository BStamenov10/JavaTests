package stringAndTextProcessing;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a url addresss: ");
		String url = scanner.nextLine();
		
		String protocol = extractProtocol(url);
        String server = extractServer(url);
        String resource = extractResource(url);
        
        System.out.println("[protocol]= \"" + protocol + "\"");
        System.out.println("[server]= \"" + server + "\"");
        System.out.println("[resource]= \"" + resource + "\"" );
		//http://www.devbg.org/forum/index.php
	}
	
	public static String extractProtocol(String url) {
		int protocolEndIndex = url.indexOf("://");
		if (protocolEndIndex != -1) {
			return url.substring(0, protocolEndIndex);
		} 
		return "undentified value!";
	}
	
	public static String extractServer(String url) {
		int protocolEndIndex = url.indexOf("://");
		if (protocolEndIndex != -1) {
			int serverStartIndex = protocolEndIndex + 3;
			int serverEndIndex = url.indexOf("/",serverStartIndex);
			
			if (serverEndIndex != -1) {
				return url.substring(serverStartIndex, serverEndIndex);
			} else {
				return url.substring(serverStartIndex);
			}
		}
		return "undentified value!";
	}
	
	public static String extractResource(String url) {
		int protocolEndIndex = url.indexOf("://");
		int resourceStartIndex = url.indexOf("/",protocolEndIndex + 3);
		if (resourceStartIndex != -1) {
			return url.substring(resourceStartIndex);
		}
		
		return "undentified value!";
	}

}
