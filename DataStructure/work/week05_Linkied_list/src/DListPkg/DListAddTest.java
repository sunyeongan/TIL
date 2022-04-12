package DListPkg;



public class DListAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DListAdd d1 = new DListAdd();
		DListAdd d2 = new DListAdd();
		
		d1.insertAfter(d1.head, 1);
		d1.insertAfter(d1.head.getNext(), 2);
		d1.insertBefore(d1.tail, 3);
		
		d1.print(); System.out.println();
		
		
		d2.insertAfter(d2.head, 6);
		d2.insertAfter(d2.head.getNext(), 8);
		d2.insertAfter(d2.head.getNext(), 7);
		
		d2.insertBefore(d2.tail, 9);
		
		d2.print(); System.out.println();
		
		int add1 = d1.add(d2);
		int add2 = d2.add(d1);
		
		System.out.println("add1 : " + add1);
		System.out.println("add2 : " + add2);

	}

}
