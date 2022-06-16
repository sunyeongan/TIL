package MST;

import java.util.LinkedList;
import java.util.List;

public class MyGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 7; //정점의 개수 
		
		AdjList al = new AdjList(N);
		int arr[][] = {
				{0,1,0,2},
				{1,0,4,3},
				{0,4,0,0},
				{2,3,0,0},
				{0,1,0,5},
				{0,6,1,0},
				{0,0,1,0},
				{0,0,2,0},
		};
		
		List<Edge>[] result_List;
		result_List = new LinkedList[N];
		
		al.put(0, 1, 1); al.put(0, 3, 2);
		al.put(1, 0, 1); al.put(1, 2, 4); al.put(1, 3, 3); al.put(1, 4, 1); ; al.put(1, 5, 6);
		al.put(2, 1, 4); al.put(2, 5, 1); al.put(2, 6, 1); al.put(2, 7, 2); 
		al.put(3, 0, 2); al.put(3, 1, 3); al.put(3, 4, 5); 
		al.put(4, 1, 1); al.put(4, 3, 5); al.put(4, 6, 2); 
		al.put(5, 1, 6); al.put(5, 2, 1); al.put(5, 7, 9);
		al.put(6, 2, 1); al.put(6, 4, 2); al.put(6, 7, 1);
		al.put(7, 2, 2); al.put(7, 5, 9); al.put(7, 6, 1);
		
		MyGraph mg = new MyGraph();
		//mg.print(al.getList());
		//arr = mg.getAdMatrixFromAdjList(al.getList());
		//mg.print(arr);
		
		mg.print(arr);
		result_List = mg.getAdjListFromAdjMatrix(arr);
		mg.print(result_List);
		
		
	}

}
