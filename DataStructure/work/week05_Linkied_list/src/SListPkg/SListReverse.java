package SListPkg;

public class SListReverse extends SList<Integer>{
	
	public SListReverse() { super();}
	
	public void reverse() {
		
		int original_size = this.size();
		Node<Integer> curr = this.head;
		
		for(int i = 0; i < original_size; i++) { //전체 길이를 2배를 늘리고 
			//get the item pointed by the curr 
			int curr_item = curr.getItem();
			this.insertFront(curr_item);
			curr = curr.getNext();
		}
		
		for(int i = 0; i < original_size; i++) { // 필요없는 부분은 지운다. 
			this.deletLast();
		}
	}
	
	public void deletLast() {
		Node ptr = this.head;
		while(ptr.getNext().getNext() != null)
			ptr = ptr.getNext();
		ptr.setNext(null);
		
	}

}
