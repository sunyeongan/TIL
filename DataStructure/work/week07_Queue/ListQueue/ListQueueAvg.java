package ListQueue;

public class ListQueueAvg<E> extends ListQueue<Integer>{
	
	public int temp = 0; 
	public double total = 0.0;
	public int index = 0;
	
	public ListQueueAvg() { super(); }
	
	public double avg() {
		
		
		//큐에 있는 정수 N개를 평균을 구한다.
		//평균을 구하고 난 뒤의 N개의 정수는 여전히 큐에 저장되어있어야함.
		
		
		while(index<size) { //index가 size 보다 작을 때 동안 loop 실행 
			
			temp = remove(); // remove한 값 임시로 저장 
			total+=temp;//remove한 값을 total 변수에 누적합으로 
			add(temp);//remove한 값 다시 큐에 저장 
			
			index +=1;
			
			
			
		}
		return total/size;
		
	}

}
