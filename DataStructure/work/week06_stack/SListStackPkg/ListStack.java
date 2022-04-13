package SListStackPkg;
import java.util.EmptyStackException;

public class ListStack <E> {
	
	public Node<E> top; // 스택 top 항목을 가진 Node를 가리킴l 
	//ListStack에서는 top 노드를 가리키는 참조 변수 
	public int size; // 스택의 항목 수 
	public ListStack() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;} //스택의 항목의 수 리턴 
	public boolean isEmpty() { return size == 0;} //스택 비어있으면 true
	
	public E peek() {//스택의 top 항목을 리턴 
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
		
	}
	
	public void push(E newItem) { 
		Node newNode = new Node(newItem, top); //리스트의 앞부분에 삽입  
		top = newNode; //top이 새 노드를 가리킴 
		size++;// 스택 항목 수 1 증가 
	}
	
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E topItem = top.getItem(); //스택 top 항목을 topItem에 저장 
		top = top.getNext();// top이 top 바로 아래 항목을 가리킴 
		size--;
		return topItem;
	}
	
	public void print() {
		Node<E> p = top;
		if(top == null)
			System.out.println("X");
		
		for(int i = 0; i < size; i++) {
			if(i < size) System.out.printf(p.getItem() + "\t");
				p = p.getNext();
			
		}
		System.out.println();
	}
}
