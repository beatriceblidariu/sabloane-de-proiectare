package lab5;

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

		
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Jennifer Niven");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
		
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