package stringAndTextProcessing;

import java.util.Scanner;

public class UrlAddress {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете URL адрес: ");
        String url = scanner.nextLine();
        
        String protocol = extractProtocol(url);
        String server = extractServer(url);
        String resource = extractResource(url);
        
        System.out.println("[protocol]= \"" + protocol + "\"");
        System.out.println("[server]= \"" + server + "\"");
        System.out.println("[resource]= \"" + resource + "\"" );
    }
    //http://www.devbg.org/forum/index.php
	
    public static String extractProtocol(String url) {
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            return url.substring(0, protocolEndIndex);
        }
        return "There isn't a protocol in here!";
    }
    
    public static String extractServer(String url) {
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            int serverStartIndex = protocolEndIndex + 3; // Прескачаме "://"
            int serverEndIndex = url.indexOf("/", serverStartIndex);
            if (serverEndIndex != -1) {
                return url.substring(serverStartIndex, serverEndIndex);
            } else {
                return url.substring(serverStartIndex);
            }
        }
        return "There isn't a server in here!";
    }
    
    public static String extractResource(String url) {
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            int resourceStartIndex = url.indexOf("/", protocolEndIndex + 3); // Прескачаме "://"
            if (resourceStartIndex != -1) {
                return url.substring(resourceStartIndex);
            }
        }
        return "There isn't a resource in here!";
    }

}
