package unl.soc;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class models an individual book.
 *
 */
public class Book {

    private String title;
    private String isbn;
    private Author author;
    private LocalDate publishDate;
    private String publishDateString;

    public Book(String title, Author author, String isbn, LocalDate publishDate) {
    	this.title = title;
    	this.author = author;
    	this.isbn = isbn;
    	this.publishDate = publishDate;
    }
    
    public Book(String title, Author author, String isbn, String publishDateString) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishDateString = publishDateString;
	}

	/**
     * Getter method for author
     * @return
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * Setter method for authors
     * @param author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Getter method for call number.
     * @return
     */
    public String getISBN() {
        return this.isbn;
    }

    /**
     * Setter method for call number.
     * @param callNumber
     */
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter method for title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter method for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for the publish date
     * @return publishDate
     */
    public String getPublishDate() {
    	return this.publishDate.toString();
    }
    
    /**
     * Setter method for the publish date
     * @param publishDate2
     */
    public void setPublishDate(LocalDate publishDate) {
    	this.publishDate = publishDate;
    }
    
    public int getAge() {
    	return Period.between(this.publishDate, LocalDate.now()).getYears();
    }
}
