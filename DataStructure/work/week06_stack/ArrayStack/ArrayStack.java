package ArrayStack;
import java.util.EmptyStackException;

public class ArrayStack <E> {
	
	private E s[]; //스택을 위한 배열 
	private int top; //스택의 top 항목의 배열 원소 인덱스 
	
	public ArrayStack() {// 스택 생성자 
		
		s = (E[]) new Object[1];//초기에 크기가 1인 배열 생성 
		top = -1;
		
	}
	
	public int size() {return top+1;}// 스택의 있는 항목의 수를 리턴 
	public boolean isEmpty() {return (top == -1);} //스택이 empty이면 true 리턴
	
	public E peek() { //스택의 top 항목의 내용만을 리턴 
		if(isEmpty()) throw new EmptyStackException(); // stack이 empty면 예외발생 
		return s[top];
		
	}
	
	public void push(E newItem) { 
		if (size() == s.length)
			resize(2*s.length);//스택의 크기를 2배로 확장한다. 
		s[++top] = newItem;
	}
	
	public E pop(){
		if(isEmpty()) throw new EmptyStackException();
		E item = s[top]; 
		s[top--] = null; // s[top] == null 실행 후 top-1 
		if (size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
	}
	
	public void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i = 0; i < size(); i++)
			t[i] = s[i];
		s = (E[]) t;
	}
	
	public void print() {
		for(int i = 0; i < s.length; i++) {
			if(i < size()) System.out.print(s[i] + "\t");
			else System.out.printf("null\t");
		}
		System.out.println();
	}
	
	

}
