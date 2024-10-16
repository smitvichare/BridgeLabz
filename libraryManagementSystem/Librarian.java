package libraryManagementSystem;

public class Librarian extends User
{
	
	public Librarian(String userId, String name) {
		super(userId, name);
		// TODO Auto-generated constructor stub
	}
	public void addBook(Book book,Library l)
	{
		l.addBook(book);
	}
	public void removeBook(Book book,Library l)
	{
		l.removeBook(book);
	}
	public void viewAvailableBooks(Library l)
	{
		l.viewAvailableBooks();
	}
}
