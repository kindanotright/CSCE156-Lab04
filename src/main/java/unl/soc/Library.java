package unl.soc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class models a library's collection of books.
 *
 */
public class Library {

    private final List<Book> bookCollection;

    /**
     * Default constructor
     */
    public Library() {
        this.bookCollection = new ArrayList<Book>();
    }

    public List<Book> getCollection() {
    	return Collections.unmodifiableList(this.bookCollection);
    }

    /**
     * Method that adds a book to the library
     * @param newBook
     */
    public void addBook(Book newBook) {
        this.bookCollection.add(newBook);
    }
    
    public List<Book> titleSearch(String term) {
    	List<Book> results = new ArrayList<Book>();
    	for(Book b : this.bookCollection) {
    		if(b.getTitle().toLowerCase().contains(term.toLowerCase())) {
    			results.add(b);
    		}
    	}
    	return results;
    }
    
    public List<Book> authorSearch(String term) {
    	List<Book> results = new ArrayList<Book>();
    	for(Book b : this.bookCollection) {
    		if(b.getAuthor().getFirstName().toLowerCase().contains(term.toLowerCase()) || 
    		   b.getAuthor().getLastName().toLowerCase().contains(term.toLowerCase())) {
    			results.add(b);
    		}
    	}
    	return results;
    }

    public List<Book> keywordSearch(String term) {
    	List<Book> results = new ArrayList<Book>();
    	for(Book b : this.bookCollection) {
    		if(b.getAuthor().getFirstName().toLowerCase().contains(term.toLowerCase()) || 
    		   b.getAuthor().getLastName().toLowerCase().contains(term.toLowerCase()) ||
    		   b.getTitle().toLowerCase().contains(term.toLowerCase()) || 
    		   b.getISBN().toLowerCase().contains(term.toLowerCase())
    		   ) {
    			results.add(b);
    		}
    	}
    	return results;
    }

}