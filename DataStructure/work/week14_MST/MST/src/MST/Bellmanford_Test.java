package MST;

public class Bellmanford_Test {

	public static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		int[][] weight = { { INF,   1, INF,   2, INF, INF, INF, INF},
				   { INF, INF,   4,  -2,   1,   6, INF, INF},
				   { INF, INF, INF, INF, INF, INF, INF,   2},
				   { INF, INF, INF, INF,  -1, INF, INF, INF},
				   { INF, INF, INF, INF, INF, INF ,  4, INF},
				   { INF, INF,   1, INF, INF, INF, INF, INF},
				   { INF, INF,  -1, INF, INF, INF, INF,   1},
				   { INF, INF, INF, INF, INF,   3, INF, INF} };

		int N = weight.length; // 그래프 정점의 수 
		
		int s = 0; // 츨발점
		BellmanFord bf = new BellmanFord(N); // 객체 생성 
		bf.shortestPath(s, weight); // 최단경로 찾기 
		bf.printPath(s); // 결과 출력
		

	}

}
