//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.*;
public class FacultyExecutor {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		
//		userId and dispalyPrivate() method is private, so we cant 
//		access into another package or class,
//		only we can access inside the same class
//		l.userId=123456;
//        l.displayPrivate();
		
		/* booksName and dispalydefault method is default,
		 * we cant access into another package only we can access it within 
		 * the same package */
		
//		l.booksname;
//		l.displayDefault();
		
	}

}
