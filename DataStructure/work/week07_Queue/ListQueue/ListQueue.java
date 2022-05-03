package ListQueue;
import java.util.NoSuchElementException;

public class ListQueue <E>{
	
	public Node<E> front, rear;
	public int size;
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	
	public int size() {return size; }
	public boolean isEmpty() { return size() == 0;}
	
	public void add(E newItem) {
		Node newNode = new Node(newItem,null);
		if (isEmpty()) front = newNode;//큐가 비어있으면 front도 newNode를 가리키게한다.
		else rear.setNext(newNode);//그렇지 않으면 rear의 next를 NewNode를 가리키게한다.
		rear = newNode;//마지막으로 rear가 newNode를 가리키게한다.
		size++;// 큐 항목 수 1 증
	}
	
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();//front가 가리키는 노드의 항목을 frontItem에 저
		front = front.getNext();//front가 front 다음 노드를 가리키게 한다.
		if(isEmpty()) rear = null;//큐가 비어있으면 rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		
		Node<E> p = front;
		
		for(int i  = 0; i<size; i++) {
			if(front == null) {
				System.out.printf("null \t");
			}else {
				System.out.printf(p.getItem()+" \t");
				p = p.getNext();
			}
			
		}
		System.out.println();
	}
}
