package Tree;

public class Node<Key extends Comparable<Key>> {
	
	private Key item;
	private Node<Key> left;
	private Node<Key> right;
	//Key를 제너릭 타입으로 사용한 이유는 Key는 데이터 (item)을 노드에 저장하는 목적이다. 
	public Node(Key newItem, Node lt, Node rt) {
		
		item = newItem; left = lt; right = rt;
		
	}
	public Key getKey() {return item;}
	public Node<Key> getLeft() {return left;}
	public Node<Key> getRight() {return right;}
	public void setKey(Key newItem) {item = newItem;}
	public void setLeft(Node<Key> lt) {left = lt;}
	public void setRight(Node <Key> rt) {right = rt;}

}
