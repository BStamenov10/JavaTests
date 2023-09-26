package definingOfClasses;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();

	public Library(String name, ArrayList<Book> books) {
		this.name = name;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book  book) {
		books.remove(book);
	}

	public void searchBook(String author) {
		for (Book book : books) {
			boolean isFound = book.getAuthor() == author;
			if (isFound) {
				System.out.println(book);
			}
		}

	}
	public void removeAllBooksByAuthor(String author) {
		Iterator<Book> iterator = books.iterator();
		
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (book.getAuthor() == author) {
				iterator.remove();
			}
		}
	}
	
	public void displayBooks() {
        System.out.println("List of books in the " + getName() + ":");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + 
            		", Publisher: " + book.getPublisher() + ", Year of publishing: " + book.getYearOfPublishing() 
            		+ ", ISBN number: " + book.getIsbnNumber());
        }
    }

}
