package ArrayQueuePkg;
import java.util.NoSuchElementException;

public class ArrayQueue <E>{
	
	private E[] q; //큐를 위한 배열 
	private int front, rear, size;
	public ArrayQueue() {
		q = (E[]) new Object[2]; //초기에 크기가 2인 배열 생성
		//why? 한 개의 공간은 낭비가 될 것이고, 
		//최초에는 1개의 item을 저장할 공간을 만드므로 2개 공간 필요 
		
		front = rear = size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return (size == 0); }
	
	public void add(E newItem) {
		if((rear+1)%q.length == front) //비어 있는 원소가 1개 뿐인 경우(즉 큐가 full인 경우)
			resize(2*q.length);
		rear = (rear+1) % q.length;
		q[rear] = newItem; //새 항목 add
		size ++;
	}
	
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		front = (front + 1) % q.length;
		E item = q[front];
		q[front] = null; //null로 만들어 가비지 컬렉션이 되도록 
		size--;
		if (size > 0 && size == q.length/4)//큐의 항목수가 배열의 크기의 1/4가 되면 
			resize(q.length/2);//큐의 1/2크기로 축소 
		return item;
	}
	
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i = 1, j = front+1; i<size+1; i++, j++) {
			t[i] = q[j%q.length];//배열 q의 항목들을 배열 t[1]로 부터 복사 
		}
		front = 0;
		rear = size;
		q = (E[]) t;//배열 t를  배열 q로 
	}
	
	public void print() {
		for(int i = 0; i<q.length; i++) {
			if(i < q.length) System.out.print(q[i] + "\t");
			else System.out.printf("null\t");
		}
		System.out.println();
		
	}
}
