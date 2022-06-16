package Graph;

import java.util.LinkedList;

public class AdjListGraphTest {

	public static void main(String[] args) {		
		
		int N = 4;
		AdjListGraph alg = new AdjListGraph(N);
		
		alg.put(0,1); alg.put(0,2);
		alg.put(1,0); alg.put(1,2); alg.put(1,3); 
		alg.put(2,0); alg.put(2,1); alg.put(2,3);
		alg.put(3,1); alg.put(3,2);
		
		alg.printGraph();

	}

}
