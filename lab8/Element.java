package lab8;

import lab8.Element;
import lab8.Visitor;

public interface Element {

	public void add(Element element);

	public void remove(Element element);

	public Element getElement(int index);

	public void print();

	public void accept(Visitor visitor);

}
