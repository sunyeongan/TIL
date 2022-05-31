package HashTable;

public class RandProbingTest {

	public static void main(String[] args) {
		
		
		RandProbing<Integer, String> Rp = new RandProbing<Integer, String>();

		
		Rp.put(25, "grape"); Rp.put(37, "apple"); Rp.put(18, "banana"); Rp.put(55, "cherry");
		Rp.put(22, "mango"); Rp.put(35, "lime"); Rp.put(50, "orange"); Rp.put(63, "watermelon");
		
	
		System.out.println("탐색 결과 : ");
		System.out.println("50의 data = " + Rp.get(50));
		System.out.println("63의 data = " + Rp.get(63));
		
		Rp.print();

	}

}
