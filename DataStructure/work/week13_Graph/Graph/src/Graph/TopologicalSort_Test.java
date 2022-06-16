package Graph;

public class TopologicalSort_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 8;
		
		AdjListGraph_2 alg2 = new AdjListGraph_2(n);
		
		alg2.put(2, 1); alg2.put(2, 0);
		alg2.put(0, 1);
		alg2.put(1, 4); alg2.put(1, 3);
		alg2.put(3, 6); 
		alg2.put(4, 5);
		alg2.put(5, 7); alg2.put(5, 3); 
		alg2.put(6, 7); 
		alg2.put(7, 8); 
		alg2.put(8, 0); 
		
		
		
		System.out.println("위상 정렬  :");
		TopologicalSort t = new TopologicalSort(alg2.getList());
		t.tsort();
		t.print();
		
	}

}
