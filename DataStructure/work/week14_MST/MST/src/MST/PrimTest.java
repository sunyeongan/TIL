package MST;

public class PrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6; //정점의 개수 
		
		AdjList al = new AdjList(N);
		
		al.put(0,1,9); al.put(0,2,10); // 0에서 1로 갈 때 가중치값은 9 형식으로 삽입 
		al.put(1, 4, 5); al.put(1, 6, 3); al.put(1, 3, 10);
		al.put(2, 0, 10); al.put(2, 4, 7); al.put(2, 5, 2); al.put(2, 3, 9);
		al.put(3, 1, 10); al.put(3, 6, 8); al.put(3, 5, 4); al.put(3, 2, 9);
		al.put(4, 6, 1); al.put(4, 2, 7); al.put(4, 1, 5); 
		al.put(5, 2, 2); al.put(5, 3, 4); al.put(5, 6, 6);
		al.put(6, 4, 1); al.put(6, 1, 3); al.put(6, 5, 6); al.put(6, 3, 8);
 		
		PrimMST pm = new PrimMST(al.getList());
		
		pm.mst(0);
		
		
	}

}
