
public class TestCarte {
	public static void main(String []args)
	{
		Carte myBook = new Carte(" Disco Titanic");
		Autor autor = new Autor("Radu Pavel Gheo");
		myBook.setAutor(autor);
		int indexCapitol = myBook.setCapitol("Capitolul 1");
		Capitol capitolUnu = myBook.getCapitol(indexCapitol);
		int indexSubcapitol = capitolUnu.setSubcapitol(" Subcapitolul 1.1");
		Subcapitol subcapitolUnuUnu = capitolUnu.getSubcapitol(indexSubcapitol);
		subcapitolUnuUnu.setImagine("Imagine 1");
		subcapitolUnuUnu.setParagraf("Paragraf 1");
		subcapitolUnuUnu.setParagraf("Paragraf 2");
		subcapitolUnuUnu.setParagraf("Paragraf 3");
		subcapitolUnuUnu.setTabel("Tabel 1");
		
		System.out.print(myBook);
	
	}
}
