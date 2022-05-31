package HashTable;

public class ChainingTest {

	public static void main(String[] args) {
		
		
		Chaining<Integer, String> ch = new Chaining<Integer, String>();

		
		ch.put(25, "grape"); ch.put(37, "apple"); ch.put(18, "banana"); ch.put(55, "cherry");
		ch.put(22, "mango"); ch.put(35, "lime"); ch.put(50, "orange"); ch.put(63, "watermelon");
		
	
		System.out.println("탐색 결과 : ");
		System.out.println("50의 data = " + ch.get(50));
		System.out.println("63의 data = " + ch.get(63));
		System.out.println("37의 data = " + ch.get(37));
		System.out.println("22의 data = " + ch.get(22));
		
		ch.print();
	}

}
