package SListPkg;

import java.util.Arrays;
import java.util.Collections;

public class SListOrders extends SList<Integer>{ ///Q4 
	
	public SListOrders() { super();}
	
	
	//setAndOrdersNodes() 구현은 SList에 만듦.
	public void join(SList slist2) {
		
		Node<Integer> p1 = this.head;
		Node<Integer> p2 = slist2.head;
		
		
		if(p1 != null && p2 != null) {
			
			for(int i = 0; i<this.size; i++) {
				
				p1.setItem(add(p1.getItem(),p2.getItem()));
				p1 = p1.getNext();
				p2 = p2.getNext();
			}
			
		}
		
	}

	

}
