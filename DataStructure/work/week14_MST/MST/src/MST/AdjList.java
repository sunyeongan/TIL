package MST;
import java.util.*;

public class AdjList {
	
	private LinkedList<Edge>[] adjList;
	
	private int a, b, c;
	
	public AdjList(int N) {
		super();
		adjList = new LinkedList[N+1];
		
		for(int i = 0; i < N+1; i++) {
			adjList[i] = new LinkedList();
		}
		
	}
	
	public void put (int index , int edge,int wt) {
		Edge e = new Edge(edge, wt);
		
		if(adjList[index] != null) {
			adjList[index].add(e);
			
		}
		
	}
	
	
	private void buildGraph() {
		
		put(a,b,c);
		
	}
	
	public List<Edge>[] getList(){
		
		return adjList;
	}

	

}
