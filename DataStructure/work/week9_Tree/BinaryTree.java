
package Tree;
import java.util.*;

public class BinaryTree<Key extends Comparable<Key>>{

	public Node root;
	public int root2;
	public BinaryTree() {root = null;}
	public Node getRoot() {return root;}
	public void setRoot(Node newRoot) {root = newRoot;}
	public boolean isEmpty() {return root == null;}
	
	public void preorder(Node n) {
		if(n != null) {
			System.out.print(n.getKey() + " ");//노드 n 방문 
			preorder(n.getLeft()); //n의 왼쪽 서브트리를 순회 
			preorder(n.getRight());//n의 오른쪽 서브트리를 순회 
		}
		
	}
	
	public void inorder(Node n) {//중위순회 
		
			if(n != null) {
				inorder(n.getLeft()); //n의 왼쪽 자식 노드로 재귀호출하여 왼쪽 서브트리의 모든 노드 방문 
				System.out.print(n.getKey()+" "); //노드 n 방문 
				inorder(n.getRight());//n의 오른쪽 자식노드로 재귀호출하고 오른쪽  서브트리의 모든 노드 방문  
			}
			
	}
	
	public void postorder(Node n) {
		if(n != null) {
			postorder(n.getLeft());//n의 왼쪽 서브트리를 순회 
			postorder(n.getRight());//n의 오른쪽 서브트리를 순회 
			System.out.print(n.getKey()+ " "); //노드 n 방문
			
		}
		
	}
	
	public void levelorder(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		Node t; 
		q.add(root);//루트 노드 큐에 삽입 
		while(!q.isEmpty()) {
			t = q.remove(); // 큐에서 가장 앞에 있는 노드 제거  
			System.out.print(t.getKey()+ " ");//제거된 노드 출력 (방문) 
			if(t.getLeft() != null)//제거된 왼쪽 자식이 null이 아니면 
				q.add(t.getLeft());//큐에 왼쪽 자식 삽입 
			if(t.getRight() != null)//제거된 오른쪽 자식이 Null 이 아니면 
				q.add(t.getRight());//큐에 오른쪽 자식 삽입 
		}
		
	}
	
	public int size(Node n) { //트리의 노드 수 = 1 + 루트노드의 왼쪽 서브트리에 있는 노드수 + 루트노드의 오른쪽 서브트리에 있는 노드수 
		
		if(n == null)
			return 0;
		else
			return (1 + size(n.getLeft() ) + size( n.getRight() ));
	}
	
	public int height(Node n) { //트리의 높이 = 1 + max(루트의 왼쪽 서브트리의  높이, 루트의 오른쪽 서브트리의 높이 ) 
		
		if(n == null)
			return 0;
		else
			return ( 1 +  Math.max(height(n.getLeft()), height(n.getRight()) ) );
		
	}
	
	public static boolean isEqual(Node n, Node m) {
		
		if(n==null || m == null) // 둘중에 하나라도 null 이면 
			return n == m; //둘다 null이면 true, 아니면 false 
		
		if(n.getKey().compareTo(m.getKey()) != 0) //둘다 null이 아니면 item 비교 
			return false;
		
		return ( isEqual(n.getLeft(), m.getLeft()) &&
				 isEqual(n.getRight(), m.getRight()));
	}
	
	public int[] btree2intarr() {
		
		int ind = 1;
		int [] arr = new int[10];
		
		
		levelorder(root);
		arr[ind++] = (int) root.getKey();
		System.out.print(arr[ind++] + "\t");
		
		
		return arr;
		
	}
	
	public void intarr2btree(int[] arr) {
		
		setRoot(null);
		
		int ind = 1; //index 
		int NULL = -1;
		int cnt = 0;
		
		int[] tarr = new int[arr.length*2]; 
		Queue<Node> q = new LinkedList<Node>();
		Node root_node = new Node(arr[ind++],null,null);
		
		this.setRoot(root_node);
		q.add(this.getRoot()); //root node를 큐에 넣는다.
		
		
			
		for(int i = 0; i<arr.length; i++) {
			tarr[i] = arr[i]; // arr를 tarr 로 복사 
			if(tarr[i]!=NULL) cnt++;
		}
		
		//배열의 길이가 *2 되어야함 
		//System.out.println("ind : " +ind);
		
		for(int i = 0; i < tarr.length/2-1; i++) {
			
			if(tarr[i]  == 0 ) continue;
			
			else {
				Node<Integer> t = q.remove();//t는 root노드를 가리킴
				System.out.print(t.getKey()+ " ");
				
				int t_left = tarr[ind++];
				//System.out.println("ind : " +ind);
				int t_right = tarr[ind++];
				//System.out.println("ind : " +ind);
				
				if(t_left== NULL || t_right == NULL) { continue; }
				Node <Integer> t_leftNode  = new Node<Integer>(t_left,null,null);
				Node <Integer> t_rightNode  = new Node<Integer>(t_right,null,null);
				t.setLeft(t_leftNode);
				t.setRight(t_rightNode);
				q.add(t_leftNode);
				q.add(t_rightNode);
			}
			
 		}
		
		
	}
	
	public LinkedList<Node> subTreeCompare(BinaryTree t){
		
		LinkedList<Node> w=new LinkedList<Node>();
		Queue<Node> q=new LinkedList<Node>();
		Queue<Node> a=new LinkedList<Node>();
		Node node=root;
		Node node2=t.getRoot();
		Node t1,t2;
		
		q.add(node);
		while(!q.isEmpty()) {
			t1 = q.remove();
			if(t1.getLeft() !=null)
				q.add(t1.getLeft());
			if(t1.getRight() !=null)
				q.add(t1.getRight());
			a.add(node2);
			while(!a.isEmpty()) {
				t2 = a.remove();
				if(isEqual(t1,t2))
					w.add(t1);
				if(t2.getLeft() !=null)
					a.add(t2.getLeft());
				if(t2.getRight() !=null)
					a.add(t2.getRight());
			}
		}
		
		return w;
	}
	
	

}
