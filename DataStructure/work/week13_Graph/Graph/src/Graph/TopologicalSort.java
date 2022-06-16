package Graph;
import java.util.*;

public class TopologicalSort {

	int N;
	boolean[] visited;		 // DFS 수행 중 방문여부 체크
	List<Integer>[] adjList; //인접리스트 형태의 입력 그래프 
	List<Integer> sequence; // 위상 정렬 순서를 담을 리스트 
	
	public TopologicalSort(List<Integer>[] graph) {
		
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>(); //모든 인접 정점의 방문이 끝난 정점을 저장하기 위한 리스트 
		
	}
	
	

	public List<Integer> tsort(){
		for(int i = 0; i < N; i++) if (!visited[i]) dfs(i);
		Collections.reverse(sequence);
		return sequence;
		
	}
	
	public void dfs(int i) {
		
		visited[i] = true;
		
		for(int v : adjList[i]) {
			if(!visited[v]) dfs(v);
		}
		sequence.add(i);
		
		
	}
	
	public void print() {
		
		System.out.print("[ ");
		for(int j = 0; j < N; j++) {
			
			System.out.print(sequence.get(j) + ", ");
		}
		System.out.print("]");
		
	}
}
