package HashTable;

public class ChainingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chaining<Integer, Integer> ch = new Chaining<Integer, Integer>();
		for(int i=0;i<20;i++) {ch.put(i,i);}//아이템을 계속 넣는다 
		ch.print();
		
		for(int i=0;i<20;i++) ch.delete(i);
		ch.print();


	}

}
