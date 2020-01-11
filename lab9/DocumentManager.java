
public class DocumentManager {

	public DocumentManager() {
		// TODO Auto-generated constructor stub
		
	}
	
	private static DocumentManager instance= null;
	private  Book book = null;
	
	public static DocumentManager getInstance() 
	{
		if (instance == null) 
		{
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public void setBook(Book set_book)
	{
		this.book = set_book;
	}
	
	public static Book getBook()
	{
		return instance.book;
	}

}
