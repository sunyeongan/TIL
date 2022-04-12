package CListPkg;

public class CListRotateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CListRotate cl1 = new CListRotate();
		CListRotate cl2 = new CListRotate();
		
		int[] arr = {5,4,3,2,1};
		set(cl1,arr);
		set(cl2,arr);
		
		
		System.out.print("[Before rotate left]\n");
		cl1.print(); System.out.println();
		cl1.rotateLeft(1);
		System.out.print("[After rotate left]\n");
		cl1.print(); System.out.println();
		
		
		System.out.print("[Before rotate right]\n");
		cl2.print(); System.out.println();
		cl2.rotateRight(1);
		System.out.print("[After rotate right]\n");
		cl2.print(); System.out.println();
		
		

	}
	
	
	public static void set(CList<Integer> cl, int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			cl.insert(arr[i]);
		}
	}

}
