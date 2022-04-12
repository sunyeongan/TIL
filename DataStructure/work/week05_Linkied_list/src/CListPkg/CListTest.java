package CListPkg;

public class CListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CList<String> s = new CList<String>();
		
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.print(": s의 길이 = "+ s.size()+"\n"); System.out.println();
		
		s.delete();
		s.print();
		System.out.print(": s의 길이 = "+ s.size()); System.out.println();
		

	}

}
