package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST <Key extends Comparable<Key>, Value>{
	
	int ind = 0;
	int arr[]= new int[2^ind];
	
	public Node root;
	public Node getRoot() {return root;}
	public BST(Key newId, Value newName) {
		root = new Node(newId, newName);
	}
	public BST() {
		
	}
	
	public Value get(Key k) { return get(root, k);}
	
	public Value get(Node n, Key k) {
		if (n == null) return null; //k를 발견 못했다. 
		//x.compareTo(y) 
		//= 음수 (x<y)
		//=0 (x=y)
		//=양수 (x>y) 
		int t = n.getKey().compareTo(k);
		if(t > 0) return get(n.getLeft(),k); // if(k < 노드 n의id ) 왼쪽 서브트리 탐색 
		else if( t < 0) return get(n.getRight(),k); // if(k > 노드 n의 id)오른쪽 서브트리 탐색 
		else return (Value) n.getValue(); //k를 가진 노드 발견 
	}
	
	public void put(Key k, Value v) {root = put(root, k, v);}
	
	public Node put(Node n, Key k, Value v) {
		
		if(n == null) return new Node(k, v); //삽입, 추가 될 노드를 생성하고 리턴 
		int t = n.getKey().compareTo(k);
		
		//리턴된 노드는 부모노드 에서 추가됨 
		if(t > 0) n.setLeft(put(n.getLeft(), k, v));
		else if( t < 0) n.setRight(put(n.getRight(), k, v));
		else n.setValue(v); //노드 n의 name을 v로 갱신 
		
		return n;
	}
	
	//최솟값은 루트노드로부터 왼쪽 자식 노드를 따라 내려가며 null을 만났을 때
	//null의 부모노드가 가진 id가 최솟값
	public Key min() {
		if(root == null) return null;
		return (Key) min(root).getKey();
	}
	
	private Node min(Node n) {
		
		if(n.getLeft()==null) return n; //왼쪽 자식이 null이면 최솟값을 가진 노드이므로 레퍼런스 n을 리턴 
		return min(n.getLeft()); // 전달받은 노드의 왼쪽자식이 null이 아닌 한 계속 왼쪽 자식을 인자로 넘겨서 재귀호출 
	}
	
	public void deleteMin() {
		
		if(root==null) System.out.println("empty 트리 ");
		else root = deleteMin(root); 
	}
	
	private Node deleteMin(Node n) {
		
		if (n.getLeft()==null) return n.getRight(); //왼쪽자식이 null이면 현재 노드의 오른쪽 자식의 레퍼런스 리턴 
		n.setLeft(deleteMin(n.getLeft())); // 최솟값을 찾기 위해 왼쪽자식으로 계속 내려감 (재귀) 
		return n;
	}
	
	public void delete(Key k) { root = delete(root,k);}
	
	//case 0 : 삭제될 노드 x는 자식이 없음 
	//case 1 : 삭제될 노드 x는 한쪽 자식만 있음 
	//case 2 : 삭제될 노드 x는 양쪽 자식만 있음 
	
	public Node delete(Node n, Key k) {
		
		if(n == null ) return null;
		int t = n.getKey().compareTo(k);
		if (t > 0 ) n.setLeft(delete(n.getLeft(),k));
		else if (t < 0) n.setRight(delete(n.getRight(),k));
		else { //삭제할  노드 발견 ! 
			if (n.getRight() == null) return n.getLeft(); //case 0, 1
			if (n.getLeft() == null) return n.getRight(); // case 1
			Node target = n; //case 2
			n = min(target.getRight()); //삭제할 노드 자리로 옮겨올 노드 찾아서 n이 가리키게 함 
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		
		return n;
	}
	public void inorder(Node n) {//중위순회 
		
		if(n != null) {
			inorder(n.getLeft()); //n의 왼쪽 자식 노드로 재귀호출하여 왼쪽 서브트리의 모든 노드 방문 
			System.out.print(n.getValue()+" "); //노드 n 방문 
			inorder(n.getRight());//n의 오른쪽 자식노드로 재귀호출하고 오른쪽  서브트리의 모든 노드 방문  
		}
		
		
	}
	
	
	public void print() {
		
		inorder(root);
		System.out.println();
		
	}
	
	private Node max(Node n)
	{
		if(n.getRight()==null) return n;
		return max(n.getRight());
	}
	
	public Key max() {
		if(root == null) return null;
		return (Key) max(root).getKey();
	}
	
	public void deleteMax() { //최대의 키값을 가지는 노드 삭제하기 
		
		if(root==null) System.out.println("empty 트리 ");
		else root = deleteMax(root); 
		
	}
	
	
	private Node deleteMax(Node n) {
		
		if (n.getRight()==null) return n.getLeft(); //오른쪽 자식 이 null이면 현재 노드의 왼쪽  자식의 레퍼런스 리턴 
		n.setRight(deleteMax(n.getRight())); // 최댓값 을 찾기 위해 오른쪽 자식으로 계속 내려감 (재귀) 
		return n;
	}
	
	public Key kthSmallest(int k) // start 
	{
		return kthSmallest(root,k); 
	}
	
	public Key kthSmallest(Node n,int k) 
	{
		int num = kthSmallest(n.getLeft()); //작은 값을 찾기 위해 왼쪽으로 이동 
		
		if(num == k) // 같으면 키값 return 
			return (Key) n.getKey();
		if(num > k) //k번째 값이 더 작다면 왼쪽으로 이동 
			return kthSmallest(n.getLeft(),k);
		if(num < k) //k번째 값이 더 크다면 오른쪽으로 이동 
			return kthSmallest(n.getRight(),k-num-1);
		return null;
	}
	
	public int kthSmallest(Node n) 
	{
		if (n ==null) {return 0;}
		return kthSmallest(n.getLeft())+kthSmallest(n.getRight())+1;
	}
	
	public void setRoot(Node newRoot) {
		
		root = newRoot;
		
	}
	public boolean checkBST() {
		
		return checkBST(root, min(root), max(root)); 
	}
	
	public boolean checkBST(Node n, Node min, Node max){
		
		
		if(n == null)      {return true;}
		
		int low = n.getKey().compareTo(min.getKey());
		int hi  = n.getKey().compareTo(max.getKey());
		if(low<0 || hi >0) {return false;}//노드의 최댓값과 최솟값을 지정한 후 이 사이에 있다면 참, 아니면 거짓 
		
		if(!checkBST(n.getLeft(),min,n)  // 왼쪽 노드로 이동 할 때에는 n이 max 로 이동 해야함 
				|| !checkBST(n.getRight(),n ,max)) {return false;} // 오른쪽 노드로 이동할 때에는 n이 min으로 이동 해야함  
		
		return true;

		
	}

}
