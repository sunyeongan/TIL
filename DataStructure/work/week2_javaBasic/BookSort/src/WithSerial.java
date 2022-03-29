import java.util.Comparator;

public class WithSerial implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		return b1.getSerial() - b2.getSerial();
	}
}
