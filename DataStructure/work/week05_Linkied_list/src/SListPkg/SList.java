package SListPkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;


public class SList<E> {
	
	protected Node<E> head; //연결 리스트의 첫노드를 가리킴 
	protected int size; //size = 노드 수 = 항목 수
	
	public SList() {
		head = null;
		size = 0;
	}
	
	public void insertFront(E newItem) {
		
		head = new Node<E>(newItem, head);
		size++;
		
	}
	

	
	public int search(E target) {
		
		Node<E> p = head;
		int flag = -1;
		
		for(int k = 0; k < size; k++) {
			
			
			if(p==null) break;
			//System.out.println(p.getItem());
			if(target==p.getItem()) {
				flag=k;
				break;
			}
				
			p = p.getNext();
			
		}
		
		
		return flag;
	}
	public void insertAfter(E newItem, Node<E> p) {
		p.setNext(new Node<E>(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront() {
		//리스트가 비어있지 않을 때 리스트의 첫 노드 삭제 
		
		if(size == 0) throw new NoSuchElementException();
			head = head.getNext();
			size--;
	}
	
	
	public void deleteAfter(Node<E> p) {//p가 가리키는 노드의 다음 노드를 삭제
		
		if (p==null) throw new NoSuchElementException();
		Node<E> t = p.getNext();
				
			if( t != null) {// p 다음에 유효한 노드가 있는 경우. 
				p.setNext(t.getNext());//뒤따르 노드를 삭제 
				t.setNext(null);
				size--;
			}
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void print() {
		Node<E> p = head;
		if (head == null) { 
			System.out.println("없음 ");
		}
		for (int i = 0; i<size; i++) {
			System.out.printf(p.getItem() + "\t");
			p =p.getNext();
			
		}
		System.out.println();
		
	}
	
	
	
	public void setAndOrderNodes(E[] arr) {
		
		Node<E> p = head;
		
		if(arr != null) {
			head = null;
			size = 0;
		}
		for(int i = 0; i<arr.length; i++) {
			Arrays.sort(arr,Collections.reverseOrder());
			insertFront(arr[i]);
				
		}
			
		
	}
	
	public static<E extends Number> int add(E x, E y){
		
		  return  x.intValue() + y.intValue();
	}
	
	/*public void join(SList list) {
		
		Node<E> p1 = this.head;
		Node<E> p2 = list.head;
		
		
		if(p1 != null && p2 != null) {
			
			for(int i = 0; i<this.size; i++) {
				
				p1.setItem(add(p1.getItem(),p2.getItem()));
				p1 = p1.getNext();
			}
			
		}
		
	}
	*/
	

	

}
