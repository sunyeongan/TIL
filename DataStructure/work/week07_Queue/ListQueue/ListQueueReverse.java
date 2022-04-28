package ListQueue;

public class ListQueueReverse<E> extends ListQueue<E> {

	public int index = 0;
	public int original_size = size;
	public ListQueueReverse () { super(); }
	
	public void reverse() {

		ArrayStack<E> stack = new ArrayStack<E>();
		
		for(int i = 0; i <=original_size+3; i++) {
			stack.push(remove());
		}
		//A,B,C,D,E
			
		
		for(int i = 0; i <= original_size+3; i++) {
			add(stack.pop());//E , D, C , B, A
		}
		
		
		
		
	}

}
