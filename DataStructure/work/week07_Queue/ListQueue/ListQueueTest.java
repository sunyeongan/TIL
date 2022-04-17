package ListQueue;

import ArrayQueuePkg.ArrayQueue;

public class ListQueueTest {

	public static void main(String[] args) {
		
		ListQueue<String> q = new ListQueue<String>();
		
		q.add("apple");
		q.add("orange");
		q.add("cherry");
		q.add("pear");
		q.print();
		q.remove();
		q.print();
		q.add("grape");
		q.print();
		q.remove();
		q.print();
		q.add("lemon");
		q.print();
		q.add("mango");
		q.print();
		q.add("lime");
		q.print();
		q.add("kiwi");
		q.print();
		q.remove();
		q.print();
		
	}

}
