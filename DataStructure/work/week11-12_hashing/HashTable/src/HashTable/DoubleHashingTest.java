package HashTable;

public class DoubleHashingTest {

	public static void main(String[] args) {
		
		
		DoubleHashing<Integer, String> Dp = new DoubleHashing<Integer, String>();

		
		Dp.put(25, "grape"); Dp.put(37, "apple"); Dp.put(18, "banana"); Dp.put(55, "cherry");
		Dp.put(22, "mango"); Dp.put(35, "lime"); Dp.put(50, "orange"); Dp.put(63, "watermelon");
		
	
		System.out.println("탐색 결과 : ");
		System.out.println("50의 data = " + Dp.get(50));
		System.out.println("63의 data = " + Dp.get(63));
		
		Dp.print();

	}

}
