package libraryManagementSystem;

public class User {
	private String userId;
	private String name;
	private Book[] borrowedBooks;
	private int borrowedCount;
	
	public User(String userId, String name)
	{
		this.userId=userId;
		this.name=name;
		borrowedBooks=new Book[10];
		borrowedCount=0;
	}
	public void borrowBook(Book book)
	{
		if(book.isAvailable())
		{
			book.borrowBook();
			borrowedBooks[borrowedCount]=book;
			borrowedCount++;	
		}
		else
		{
			System.out.println("Sorry, the book"+book.getTitle()+"is unavailable.");
		}
	}
	public void returnBook(Book book)
	{
		
		boolean flag=false;
		for(int i=0;i<borrowedCount;i++)
		{
			if(borrowedBooks[i]==book)
			{
				flag=true;
				book.returnBook();
				borrowedBooks[i]=borrowedBooks[borrowedCount-1];
				borrowedBooks[borrowedCount-1]=null;
				borrowedCount--;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Book "+book.getTitle()+" was not borrowed by this user.");
		}
	}
	public void listBorrowedBooks()
	{
		if(borrowedCount!=0)
		{
			System.out.println("Books borrowed by this user are:");
			for(int i=0;i<borrowedCount;i++)
			{
				System.out.println(borrowedBooks[i]);
			}
		}
		else
		{
			System.out.println("No books borrowed by this used.");
		}
	}
}
