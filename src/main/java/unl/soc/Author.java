package unl.soc;

/**
 * Models an author of a book
 *
 */
public class Author {

	private String firstName;
	private String lastName;
	
	public Author (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return lastName + ", " + firstName;
		
	}

}
