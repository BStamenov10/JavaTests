package definingOfClasses;

import java.util.ArrayList;

public class LibraryTest {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();

		Library library = new Library("Bobby's library", books);
		
		Book firstBook = new Book("Harry Potter 1", "J.K.Rolling", "Sun", 1995, 925453452);
		Book secondBook = new Book("Harry Potter 2", "J.K.Rolling", "Sun", 1998, 154125245);
		Book thirdBook = new Book("Harry Potter 3", "J.K.Rolling", "Wiki", 2005, 857843659);
		Book fourthBoook = new Book("SLEEPING BEAUTIES", "Stephen King", "Blya", 2017, 895297452);
		
		library.addBook(firstBook);
		library.addBook(secondBook);
		library.addBook(thirdBook);
		library.addBook(fourthBoook);
		
		library.removeAllBooksByAuthor("Stephen King");
		
		library.displayBooks();

	}

}
