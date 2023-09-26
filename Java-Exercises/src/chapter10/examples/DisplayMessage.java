package chapter10.examples;

import java.util.Random;

public class DisplayMessage {
	
	public static final String[] COMPLIMENTARY_PHRASES = {"Продуктът е отличен.", "Това е страхотен продукт.",
			"Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};
	public static final String[] PRAISEWORTHY_EVENTS = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
			"Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."}	;
	public static final String[] AUTHOR_FIRST_NAME = {"Диана", "Петя", "Стела", "Елена", "Катя","Ивана","Джулия","Мария"};
	public static final String[] AUTHOR_LAST_NAME = {"Иванова", "Петрова", "Кирова", "Стефанова","Александрова","Стаменова","Чакърова","Павлова"};
	public static final String[] CITIES = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
	
	public static Random rand = new Random();

	public static void main(String[] args) {
		
		int iPhrase = rand.nextInt(COMPLIMENTARY_PHRASES.length);
		int iEvent = rand.nextInt(PRAISEWORTHY_EVENTS.length);
		int iFirstName = rand.nextInt(AUTHOR_FIRST_NAME.length);
		int iLastName = rand.nextInt(AUTHOR_LAST_NAME.length);
		int iCity = rand.nextInt(CITIES.length);
		
		final String DISPLAY_MESSAGE = COMPLIMENTARY_PHRASES[iPhrase] + " " + PRAISEWORTHY_EVENTS[iEvent] +" - "
				+ AUTHOR_FIRST_NAME[iFirstName] +" "+ AUTHOR_LAST_NAME[iLastName] +", " + CITIES[iCity];
		
		System.out.println(DISPLAY_MESSAGE);
		
	}

}
