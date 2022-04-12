package CListPkg;

import java.util.NoSuchElementException;

public class CList <E>{
	
	protected Node<E> last; // 리스트의 마지막 노드(항목)을 가리킨다. 
	private int size; // 리스트 항목(노드) 수	
	
	public CList() {//리스트 생성자 
		last = null;
		size = 0;
	}
	
	public void insert(E newItem) {
		Node<E> newNode = new Node<E>(newItem, null);//last가 가리키는 노드의 다음에 새노드 삽입 
		if(last == null) {
			newNode.setNext(newNode);
			last = newNode;
		}
		else {
			newNode.setNext(last.getNext());//newNode의 다음 노드가 last를 가리키는 노드의 다음 노드가 되도록 
			last.setNext(newNode);//last가 가리키는 노드의 다음 노드가 NewNode가 되도록 
		}
		size++;
	}
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}
	
	public Node delete() {//last가 가리키는 노드의 다음 노드를 제거 
		if(isEmpty()) throw new NoSuchElementException();
		Node x = last.getNext();//x가 리스트의 첫 노드를 가리킨다.
		if (x == last) last = null;//리스트에 1개의 노드만 있는 경우 
		else {
			last.setNext(x.getNext());//라스트가 가리키는 노드의 다음 노드가 x의 다음 노드가 되도록 
			x.setNext(null);//x의 next를 null로 만든다 
		}
		size--;
		return x;
		
	}
	public int size() {
		return size;
	}
	
	public void print() {
		
		Node<E> p = last.getNext();
		
		for(int i = 0; i<size; i++) {
			
			if (last == null) break;//노드안에 항목이 없다면 break
			
			
			System.out.printf(p.getItem() + "\t");//p의 항목 출력 
			p = p.getNext();//p의 다음 항목으로 포인터 이동 
		}
	}
	

}

