package SListPkg;

public class Test {

	public static void main(String[] args) {
		
		//Q4 setAndOrdersNodes(), join()테스트 
		SListOrders sl1 = new SListOrders();
		SListOrders sl2 = new SListOrders();
		
		Integer[] arr2 = {7,11,4,1,8};
		Integer[] arr3 = {5,2,8,7,13};
		
		
		System.out.print("SList 1 (before setAndOdersNodes]\t");
		sl1.print();  System.out.println();
		
		
		System.out.print("SList 1 (after setAndOdersNodes]\t");
		sl1.setAndOrderNodes(arr2);
		sl1.print(); System.out.println();
		
		System.out.print("SList 2 (before setAndOdersNodes]\t");
		sl2.print();  System.out.println();
		
		System.out.print("SList 2 (after setAndOdersNodes]\t");
		sl2.setAndOrderNodes(arr3);
		sl2.print(); System.out.println();
		
		System.out.print("SList 1 (before join()]\t");
		sl1.print(); System.out.println();
		
		System.out.print("SList 1 (after join()]\t");
		sl1.join(sl2);
		sl1.print();System.out.println();
		
		/* Q5 reverse()테스트 
		SListReverse sl4 = new SListReverse();
		int[] arr4 = {5,4,3,2,1};
		
		for(int i = 0; i < arr4.length; i++) {
			sl4.insertFront(arr4[i]);
			}
		System.out.print("SList 4 (before reverse]\t");
		sl4.print(); System.out.println();
		sl4.reverse();
		System.out.print("SList 4 (after reverse)]\t");
		sl4.print();  System.out.println();
		*/
		}

}
