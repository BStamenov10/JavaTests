package objectsAndClasses;

public class Milleseconds {

	public static void main(String[] args) {
		   long currentTimeMillis = System.currentTimeMillis(); // Текущото време в милисекунди от 1 януари 1970 г.

	        long seconds = currentTimeMillis / 1000; // Преобразуваме милисекундите в секунди
	        long minutes = seconds / 60; // Преобразуваме секундите в минути
	        long hours = minutes / 60; // Преобразуваме минутите в часове
	        long days = hours / 24; // Преобразуваме часовете в дни

	        System.out.println("Изминали са:");
	        System.out.println("Дни: " + days);
	        System.out.println("Часове: " + (hours % 24)); // Остатъкът при деление на 24 часа
	        System.out.println("Минути: " + (minutes % 60)); // Остатъкът при деление на 60 минути

	}

}
