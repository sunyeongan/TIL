package ListQueue;

public class ReverseTest {

	public static void main(String[] args) {
		
		
		ListQueueReverse<Character> q = new ListQueueReverse<Character>();
		
		q.add('A'); q.add('B'); q.add('C'); q.add('D'); q.add('E');
		//q.print();
		
		//q.reverse();
		//q.print();
		
		ListQueueReverse<Integer> q2 = new ListQueueReverse<Integer>();
		
		q2.add(1); q2.add(2); q2.add(3); q2.add(4); q2.add(5);
		
		q2.print();
		
		q2.reverse();
		q2.print();

	}

}
