package libraryManagementSystem;

public class LibraryMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Librarian librarian = new Librarian("L001", "Alice");
		Library library=new Library(librarian);
		Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
		Book book2 = new Book("B002", "1984", "George Orwell");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");
        librarian.addBook(book1,library);
        librarian.addBook(book2,library);
        librarian.addBook(book3,library);
        User user = new User("U001", "John");
        library.addUser(user);
        user.borrowBook(book1);
        library.listAllBooks();
        librarian.viewAvailableBooks(library);
        user.returnBook(book1);
        librarian.viewAvailableBooks(library);

	}

}
