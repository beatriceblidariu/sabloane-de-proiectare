package lab8;

import lab8.Book;
import lab8.Image;
import lab8.ImageProxy;
import lab8.Paragraph;
import lab8.Section;
import lab8.Table;

public interface Visitor {

	public void visit(Image image);

	  public void visit(ImageProxy imageProxy);

	  public void visit(Paragraph paragraph);

	  public void visit(Table table);

	  public void visit(Book book);

	  public void visit(Section section);
}
