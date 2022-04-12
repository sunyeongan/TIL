package DListPkg;
import java.util.NoSuchElementException;

public class DList <E> {
	
	protected DNode<E> head;
	protected DNode<E> tail;

	protected int size;
	
	public DList() {
		head = new DNode(null,null,null);
		tail = new DNode(null,head,null);
		head.setNext(tail);
		size = 0;
	}
	
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem,t,p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
		
	}
	
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem,p,t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	public void delete(DNode x) {
		if(x == null) throw new NoSuchElementException();
		if(size <= 0) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	
	
	public void print() {
		
		DNode<E> p = head.getNext();
		DNode<E> t = tail.getPrevious();
		if (size == 0) System.out.println("리스트 비어있음 ");
		
		//dummy 노드 링크를 끊어야함 
		for (int i = 0; i<size; i++) {
				
			System.out.printf(p.getItem() + "\t");
			
			p = p.getNext();
			
			
		}
		System.out.println();
		
	
	}
	public int[] getList() {
		DNode<Integer> p = (DNode<Integer>) tail.getPrevious();
		
		
		int [] arr = new int[this.getSize()];
			
		for(int i = 0; i<this.size; i++) {
				
			arr[i] = (int) p.getItem();
			p = p.getPrevious();
			//System.out.print(arr[i]);
				
		}
		//System.out.println();
		
		return arr;
			
		
	}
	public int getSize() {
		return size;
	}
	
	
	

}
