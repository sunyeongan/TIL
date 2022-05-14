package BST;

public class BST_main {

	public static void main(String[] args) {
		
		
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>(10,10);
		
		
		bst1.put(60, 60); bst1.put(25, 25); bst1.put(30, 30); // Key값과 Value값을 동일하게 설정 
		bst1.put(20, 20); bst1.put(50, 50); bst1.put(45, 45);
		bst1.put(70, 70); bst1.put(40, 40); bst1.put(35, 35);
		
		 
		//Q1
		/*bst1.print();
		
		System.out.println("Searching for 45 yields  : " + bst1.get(45));
		bst1.put(45,99);
		System.out.println("Searching for 45 yields  : " + bst1.get(45));
		System.out.println("Min Value : "+  bst1.min());
		bst1.deleteMin();
		System.out.println("Min Value : "+  bst1.min());
		
		bst1.delete(25); bst1.delete(35); bst1.delete(45);
		bst1.print();
		*/
		
		//Q2
		/*
		BST<Integer, Integer> bst2 = new BST<Integer, Integer>(10,10);
		
		bst2.put(60, 60); bst2.put(25, 25); bst2.put(30, 30); // Key값과 Value값을 동일하게 설정 
		bst2.put(20, 20); bst2.put(50, 50); bst2.put(45, 45);
		bst2.put(70, 70); bst2.put(40, 40); bst2.put(35, 35);
		
		bst2.print();
		bst2.deleteMax();
		bst2.print();
		*/
		//Q3
		
		BST<Integer, Integer> bst3 = new BST<Integer, Integer>(10,10);
		
		bst3.put(60, 60); bst3.put(25, 25); bst3.put(30, 30); // Key값과 Value값을 동일하게 설정 
		bst3.put(20, 20); bst3.put(50, 50); bst3.put(45, 45);
		bst3.put(70, 70); bst3.put(40, 40); bst3.put(35, 35);
		
		for(int i = 0; i<5; i++) {
			bst3.kthSmallest(i);
		}
	}

}
