package Graph;

import java.util.*;

public class AdjListGraphExt extends AdjListGraph{

	public AdjListGraphExt(int N) {
		
		super(N);
		this.n = N;
	}
	
	public  int n;
	private List<Edge>[] adjListReverse; //역방향 그래프 
	private List<Edge>[] adjList; //그래프 

	
	
	public void getReverse() {
		
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j >=0; j--) {
				
				adjListReverse[i] = adjList[j]; 
				
			}
			
		}
		
		
	}
	
	public void print() {
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(adjList[i].get(i) + " ");
			
		}
	}
	
	public void printGraphReverse() {
		
		for(int i = 0; i<n; i++) {
			
			System.out.print(adjListReverse[i] + " ");
		}
	}
	

}
