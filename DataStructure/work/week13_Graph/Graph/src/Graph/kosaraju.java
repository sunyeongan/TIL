package Graph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class kosaraju {
	
	List<Integer>[] GR; 
	List<Integer>[] kosaraju; 
	List<Integer> S; 
	private boolean[ ] visited; 
	int num=0;
	
	public kosaraju(List<Integer>[] adjList) { 
		kosaraju=new List[adjList.length];
		GR=new List[adjList.length];
		visited = new boolean[adjList.length]; 
		for(int i =0 ;i<adjList.length;i++) {
			GR[i] = new LinkedList<>();
		} 
		for(int i=0;i<adjList.length;i++) { 
			for(int j:adjList[i]) {
				GR[j].add(i);
			}
		}
		TopologicalSort topologicalsort=new TopologicalSort(adjList);
		S=topologicalsort.tsort(); 
	}
	public void asd() {
		for(int i:S) {
			if(!visited[i]) {
				kosaraju[num] = new LinkedList<>();
				dfs(i); 
				Collections.reverse(kosaraju[num]);
				num++;
			}
		}
	}
	
	public void dfs(int i) { // DFS 
		visited[i] = true;
		for(int v: GR[i]) {
			if (!visited[v]) {
				dfs(v);
			}
		}
		kosaraju[num].add(i); 
	}
	
	public void print() { 
		System.out.println("강 연결성분 :");
		for(int i=0;i<num;i++) {
			System.out.printf("[%d] ",i+1);
			System.out.printf(kosaraju[i]+"\n");
		}
	}

}
