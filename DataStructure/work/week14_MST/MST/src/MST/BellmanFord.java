package MST;

public class BellmanFord {
	
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[]; // 최단 경로 추출
	private int N;
	
	public BellmanFord(int numOfVertices) { 
		N = numOfVertices;
		D = new int[N]; 
		previous = new int[N];  
	}
	
	public void shortestPath(int s, int adjMatrix[][]) {
		int chk = 0; 
		for (int i = 0; i < N; i++) {
			D[i] = INF; // 초기화
		}
		D[s] = 0; 
		previous[s] = 0; 
		for (int k = 0; k < N - 1; k++) { 
			if (k != 0 && chk == 0) { 
				break; // 
			}
			chk = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (adjMatrix[i][j] != INF) {
						if (D[j] > D[i] + adjMatrix[i][j]) {
							D[j] = D[i] + adjMatrix[i][j]; // 간선완화
							previous[j] = i;
							chk++;
						}
					}
				}
			}
		}
	}
	
	public void printPath(int s) { 
		System.out.println("정점 0으로부터의 최단거리");
		for (int i = 1; i < D.length; i++) {
			if (D[i] == Integer.MAX_VALUE) {
				System.out.println("0과" + i + "사이에 경로 없음.");
			} else {
				System.out.println("[0, " + i + "] = " + D[i]);
			}
		}
		System.out.print("정점 0으로부터의 최단경로\n");
		for (int i = 1; i < N; i++) {
			int back = i;
			System.out.print(back);
			while (back != 0) {
				System.out.print(" <- " + previous[back]);
				back = previous[back];
			}
			System.out.println();
		}
	}

}
