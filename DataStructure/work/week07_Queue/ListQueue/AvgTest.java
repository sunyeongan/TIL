package ListQueue;

public class AvgTest {

	public static void main(String[] args) {
		ListQueueAvg<Integer> q = new ListQueueAvg<Integer>();
		
		q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
		
		q.print();
		
		System.out.println("평균 : " + q.avg());
		
		q.print();
		

	}

}
