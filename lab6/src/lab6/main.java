package lab6;

public class main {
	
	public String Author;
	public String Book;
	public String Chapter;
	public String subChapter;
	public int Paragraph;
	public String Image;
	public String Table;
	
	public main(String A, String B, String C, String sC, int P, String I, String T)
	{
		this.Author = A;
		this.Book = B;
		this.Chapter = C;
		this.subChapter = sC;
		this.Image = I;
		this.Table = T;
	}
	
	public static void main(String [] args) throws Exception 
	{

		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new CenterStrategy());
		p2.setAlignStrategy(new RightStrategy());
		p3.setAlignStrategy(new LeftStrategy());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}

	public String getBook()
	{
		return Book;
	}

	public void setBook(String book)
	{
		Book = book;
	}

	public int getParagraph()
	{
		return Paragraph;
	}

	public void setParagraph(int paragraph)
	{
		Paragraph = paragraph;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getTable()
	{
		return Table;
	}

	public void setTable(String table)
	{
		Table = table;
	}
	
	
}