package HashTable;

public class QuadProbingTest {

	public static void main(String[] args) {
		
		QuadProbing<Integer, String> Qp = new QuadProbing<Integer, String>();

		
		Qp.put(25, "grape"); Qp.put(37, "apple"); Qp.put(18, "banana"); Qp.put(55, "cherry");
		Qp.put(22, "mango"); Qp.put(35, "lime"); Qp.put(50, "orange"); Qp.put(63, "watermelon");
		
	
		System.out.println("탐색 결과 : ");
		System.out.println("50의 data = " + Qp.get(50));
		System.out.println("63의 data = " + Qp.get(63));
		
		Qp.print();
		
		
		

	}

}
