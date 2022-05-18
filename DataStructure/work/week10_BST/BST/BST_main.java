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
		/*
		BST<Integer, Integer> bst3 = new BST<Integer, Integer>(10,10);
		
		bst3.put(60, 60); bst3.put(25, 25); bst3.put(30, 30); // Key값과 Value값을 동일하게 설정 
		bst3.put(20, 20); bst3.put(50, 50); bst3.put(45, 45);
		bst3.put(70, 70); bst3.put(40, 40); bst3.put(35, 35);
		bst3.print();
		for(int i = 0; i<5; i++) {
			System.out.println(bst3.kthSmallest(i));
		}
		*/
		
		//Q4
		
		BST<Integer,Integer> bst4 = new BST<Integer,Integer>();
		BST<Integer,Integer> bst5 = new BST<Integer,Integer>();
		
		Node n1 = new Node(50,50);
		
		Node n2 = new Node(25,25);
		Node n3 = new Node(75,75);
		Node n4 = new Node(10,10);
		Node n5 = new Node(30,30);
		Node n6 = new Node(60,60);
		Node n7 = new Node(80,80);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		
		bst4.setRoot(n1);
		
		
		bst4.print();
		System.out.println(bst4.checkBST());
		
		
		Node n1_ = new Node(50,50);
		
		Node n2_ = new Node(25,25);
		Node n3_ = new Node(75,75);
		Node n4_ = new Node(10,10);
		Node n5_ = new Node(30,30);
		Node n6_ = new Node(80,80);
		Node n7_ = new Node(60,60);
		
		n1_.setLeft(n2_);
		n1_.setRight(n3_);
		n2_.setLeft(n4_);
		n2_.setRight(n5_);
		n3_.setLeft(n6_);
		n3_.setRight(n7_);
		
		bst5.setRoot(n1_);
		
		bst5.print();
		System.out.println(bst5.checkBST());
		
	}

}
