package libraryManagementSystem;

public class Library {
	
	private User[] users;
	private Book[] books;
	private int userCount;
	private int bookCount;
	
	public Library(Librarian l)
	{
		users=new User[10];
		books=new Book[10];
		userCount=0;
		bookCount=0 ;
	}
	public void addUser(User user)
	{
		users[userCount]=user;
		userCount++;
		System.out.println("user added sucessfully!");
	}
	public Book findBookByTitle(String title)
	{
		
		for(int i=0;i<bookCount;i++)
		{
			if(books[i].getTitle().equalsIgnoreCase(title))
			{
				return books[i];
			}
		}
		System.out.println("No books found with this title.");
		return null;
	}
	public void findBookByAuthor(String author)
	{
		boolean flag=false;
		for(int i=0;i<bookCount;i++)
		{
			if(books[i].getAuthor().equalsIgnoreCase(author))
			{
				System.out.println(books[i]);
				flag=true;
			}
			
		}
		if(flag=false)
		{
			System.out.println("No books found by "+author);
		}
	}
	public void listAllBooks() 
	{
        if (bookCount == 0) 
        {
            System.out.println("No books in the library.");
        } 
        else 
        {
            System.out.println("All books in the library:");
            for (int i = 0; i < bookCount; i++) 
            {
                System.out.println(books[i]);
            }
        }
    }
	public void addBook(Book book)
	{
		books[bookCount]=book;
		bookCount++;
		System.out.println("Book "+book.getTitle()+"was added Successfully.");
	}
	public void removeBook(Book book)
	{
		boolean flag=false;
		for(int i=0;i<bookCount;i++)
		{
			if(books[i]==book)
			{
				flag=true;
				books[i]=books[bookCount-1];
				books[bookCount-1]=null;
				bookCount--;
				System.out.println("Book "+book.getTitle()+"was removed Successfully.");
				break;
			}
		}
	}
	public void viewAvailableBooks()
	{
		System.out.println("All the Available book in the library are:");
		boolean flag=false;
		for(int i=0;i<bookCount;i++)
		{
			if(books[i].isAvailable())
			{
				System.out.println(books[i]);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No Available books at this time.");
		}
	}
	
}
