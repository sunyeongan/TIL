package Graph;

import java.util.*;

public class AdjListGraph {
	
	private LinkedList<Edge>[] adjList;
	
	private int a, b;
	
	public AdjListGraph(int N) {
		super();
		adjList = new LinkedList[N+1];
		
		for(int i = 0; i < N+1; i++) {
			adjList[i] = new LinkedList();
		}
		
	}
	
	public void put (int index, int edge) {
		Edge e = new Edge(edge);
		
		adjList[index].add(e);
	}
	
	
	private void buildGraph() {
		
		put(a,b);
		
	}
	
	public void printGraph() {
		
		
		System.out.println("Graph (AdjList)");
		
		for(int i = 0; i < adjList.length-1; i++) {
			
			System.out.print("[" + i + "]");
			
			for(Edge j : adjList[i]) {
				System.out.print(" => " + j.getAdjvertex());
			}
			
			System.out.println();
			
		}
		
	}
	
	public List<Edge>[] getList(){
		
		return adjList;
	}
	
	
	
	

}
