package HashTable;

public class ChainingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chaining<Integer[], Integer> ch = new Chaining<Integer[], Integer>();
		
		int arr [] = {1,2,3,9};
		//System.out.println("결과 : " + ch.findTwoNum(arr, 8));
		
		int arr2 [] = {1,2,4,4};
		System.out.println("결과 : " + ch.findTwoNum(arr2, 8));
	}

}
