package Graph;

public class BFS_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		
		AdjListGraph alg = new AdjListGraph(n);
		alg.put(0, 2); alg.put(0, 1);
		alg.put(1, 3); alg.put(1, 0);
		alg.put(2, 3); alg.put(2, 0);
		alg.put(3, 9); alg.put(3, 8); alg.put(3, 2); alg.put(3, 1);
		alg.put(4, 5);
		alg.put(5, 7); alg.put(5, 6); alg.put(5, 4);
		alg.put(6, 7); alg.put(6, 5); 
		alg.put(7, 6); alg.put(7, 5);
		alg.put(8, 3); 
		alg.put(9, 3); 
		
		
		System.out.println("DFS 방문 순서 :");
		BFS d = new BFS(alg.getList());

	}

}
