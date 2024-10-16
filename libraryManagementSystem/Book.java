package libraryManagementSystem;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String bookId, String title, String author)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		isAvailable=true;
	}
	public void borrowBook()
	{
		if(isAvailable==true)
		{
			isAvailable=false;
			System.out.println("Book "+title+"has been borrowed.");
		}
		else
		{
			System.out.println("Book "+title+"is not available to be borrowed.");
		}
	}
	public void returnBook()
	{
		if(isAvailable==false)
		{
			isAvailable=true;
			System.out.println("Book "+title+"has been returned.");
		}
		else
		{
			System.out.println("Book "+title+"was never borrowed to be returned.");
		}
	}
	
	//getters
	public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author + 
               (isAvailable ? " (Available)" : " (Borrowed)");
    }

}
