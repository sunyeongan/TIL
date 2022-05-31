package HashTable;

public class LinearProbing2Test {

	public static void main(String[] args) {
		
		LinearProbing2<Integer, Integer> lp2 = new LinearProbing2<Integer, Integer>();

		
		lp2.put(25, 25); lp2.put(37,37); lp2.put(18, 18); lp2.put(55, 55);
		lp2.put(22, 22); lp2.put(35,35); lp2.put(50, 50); lp2.put(63, 63);
		
		lp2.print();
		
		
		System.out.println(lp2.get(63) + "을 찾았습니다!");
		
		lp2.delete(50);
		lp2.print();
		
		System.out.println(lp2.get(63) + "을 찾았습니다!");
		
	}

}
