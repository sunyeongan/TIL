package HashTable;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearProbing<Integer, String> lp = new LinearProbing<Integer, String>();
		
		lp.put(25, "grape"); lp.put(37, "apple"); lp.put(55, "cherry");
		lp.put(22, "mango"); lp.put(35, "lime"); lp.put(50, "orange");
		lp.put(63, "watermelon");
		
		System.out.println("탐색 결과 : ");
		System.out.println("50의 data = " + lp.get(50));
		System.out.println("63의 data = " + lp.get(63));
		lp.print();

	}

}
