import java.util.Comparator;


public class Book implements Comparable<Book> {
	
	public static final Comparator<Book> WITH_NAME = new WithName(); //내부 클래스임!!!!
	public static final Comparator<Book> WITH_SERIAL = new WithSerial();//상황에 따라서 
	public static final Comparator<Book> WITH_DATE = new WithDate();//외부클래스는 재사용을 염두한것임 
	
	private String title;
	private int serial;
	private int yyyy;
	private int mm;
	private int dd;
	
	public Book(String TitleIn, int SerialIn, int YYYY, int MM, int DD) {
		title = TitleIn;
		serial = SerialIn;
		yyyy = YYYY;
		mm = MM;
		dd = DD;
	}
	
	public String getTitle() {return title;}
	public int getSerial() {return serial;}
	public int getYYYY() { return yyyy;}
	public int getMM() {return mm;}
	public int getDD() {return dd;}

	@Override
	public int compareTo(Book b1) {
		// TODO Auto-generated method stub
		return this.title.compareTo(b1.title);
	}

}


