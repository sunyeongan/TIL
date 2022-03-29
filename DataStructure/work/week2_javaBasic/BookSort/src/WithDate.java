import java.util.Comparator;

public class WithDate implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		return b1.getYYYY() - b2.getYYYY();
	}

}
//else if (b1.y>b2.y)
//년도가 같은 경우 월도 비교하기 월도 같으면 일로 비
// b1.y*360 + me.m*30 + me.d;
// b2.y*360....
//년월일을 합쳐서 숫자로 합침 !!! 