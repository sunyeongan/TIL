package Graph;

public class kosarajuTest {

	public static void main(String[] args) {
		AdjListGraph_2 list = new AdjListGraph_2(9);
		list.put(0,1);list.put(0,3);
		list.put(1,7);
		list.put(2,8);
		list.put(3,5);list.put(3,6);
		list.put(4,1);
		list.put(5,1);list.put(5,4);
		list.put(6,0);
		list.put(7,4);
		list.put(8,6);list.put(8,7);list.put(8,9);
		list.put(9,2);
		list.printGraph();
		
		System.out.println();
		
		kosaraju kosaraju=new kosaraju(list.getList());
		kosaraju.asd();
		kosaraju.print();

	}

}
