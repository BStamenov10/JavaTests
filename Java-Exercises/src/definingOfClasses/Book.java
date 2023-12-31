package definingOfClasses;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private int yearOfPublishing;
	private int IsbnNumber;

	public Book() {

	}

	public Book(String title, String author, String publisher, int yearOfPublishing, int IsbnNumber) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.IsbnNumber = IsbnNumber;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getIsbnNumber() {
		return IsbnNumber;
	}

	public void setIsbnNumber(int isbnNumber) {
		IsbnNumber = isbnNumber;
	}
}
