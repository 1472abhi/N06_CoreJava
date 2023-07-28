package in.bkcmet.library;

public class Library {
	public String libraryName;
	private long userId;
	String booksName;
	
	//public method
	public void displayPublic() {
		System.out.println("Library Name : "+ libraryName);
	}
	
	private void displayPrivate() {
		System.out.println("User Id : "+ userId);
	}
	
	void displaydefault() {
		System.out.println("BooksName is : "+ booksName);
	}

}
