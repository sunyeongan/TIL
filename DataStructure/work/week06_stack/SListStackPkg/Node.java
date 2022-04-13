package SListStackPkg;

public class Node<E> {
	
	private E item;//데이터 저장 
	private Node<E> next;//다음 노드를 가리키는 링크
	
	public int size;
	
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	
	public E getItem() {
		return item;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setItem(E newItem) {
		item = newItem;
	}
	public void setNext(Node<E> newNext) {
		next = newNext;
	}

}
