import java.util.NoSuchElementException;

public class ArrrListPoly<E> extends ArrList {
	
	private E a[]; //리스트의 항목등을 저장할 배열 
	private int size;
	
	
	public ArrrListPoly() {
		
		a = (E[]) new Object[1];
		size = 0;
	}
	
	
	public void setPoly(int k, int arr[]) {
		size = k+1; 
		Object[] t = new Object[size];
		
		for(int i = 0; i<size; i++) {
			t[i] = arr[i];
			
			a = (E[]) t;
			
			
		}
		
	}
	public E peek(int k) {//k번째 항목을 리
		if ( size == 0 || k >= size)
			throw new NoSuchElementException();
		return a[k];
	}
	
	public int getHighestDegree() {
		
		return size-1;
	}
	
	
	public ArrrListPoly sumPoly(ArrrListPoly p) {
		
		
		ArrrListPoly p3 = new ArrrListPoly();
		int s1 = this.size;
		int s2 = p.size;
		int final_size = 0;
		
		
		if (s1 > s2)  final_size = s1;
		else final_size = s2;
		
		
		int []  arr_sum = new int[final_size];
		
		
		for (int i = 0; i <final_size; i++) {
			
			//System.out.println(this.peek(i));
			if(i < s2) {
				arr_sum[i] = (int) this.peek(i) + (int) p.peek(i);
			}else if(i > s2){
				arr_sum[i] = (int) this.peek(i);
			}
			    
				
			
		}
		p3.setPoly(final_size-1, arr_sum);
		
		return p3;
		
		
	}
	

}
