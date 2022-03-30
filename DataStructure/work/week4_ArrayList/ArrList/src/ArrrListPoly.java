import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrrListPoly extends ArrList<Integer> {
	
	protected int a[]; //리스트의 항목등을 저장할 배열 
	protected int size;
	
	
	public ArrrListPoly() {
		
		
		size = -1;// 나올 수 없는 값으로 초기화 한다. 
	}
	
	
	public void setPoly(int k, int arr[]) {
		//this.size = k;
		
		this.size = k+1;
		a =  new int[size];
		
		for(int i = 0; i<size; i++) {
			a[i] = arr[i];
			int get_item = a[i];
			this.insertLast(get_item);
			//int this_item_to_insert = arr[i];
			//this.insert(this_item_to_insert);
			
		}
		
	}
	
	
	public int getHighestDegree() {
		
		return size-1;
	}
	
	
	public ArrrListPoly sumPoly(ArrrListPoly p) {
		// p1 p2 가장 큰 길이 만큼 반복문 돌고  
		// 작은 길이만큼 반복 더 하기 
		
		ArrrListPoly p3 = new ArrrListPoly();
		int s1 = this.size;
		int s2 = p.size;
		int final_size = Math.max(s1,s2);
		int small_size = Math.min(s1, s2);
		
		int []  arr_sum = new int[final_size];
		Arrays.fill(arr_sum,0);// 0으로 전부 초기화 
		
		for (int i = 0; i <final_size; i++) {
			arr_sum[i] = this.peek(i);
			    
		}
		
		for (int i = 0; i < small_size; i++) {
			
			arr_sum[i] += p.peek(i);
			
		}
		p3.setPoly(final_size-1, arr_sum);
		
		return p3;
		
		
	}
	
public ArrrListPoly sumPoly2(ArrrListPoly p) {
		
		
		ArrrListPoly p3 = new ArrrListPoly();
		int s1 = this.size;
		int s2 = p.size;
		int final_size = 0;
		int small_size = Math.min(s1, s2);
		
		
		if (s1 > s2)  final_size = s1;
		else final_size = s2;
		
		
		int []  arr_sum = new int[final_size];
		
		
		for (int i = 0; i <final_size; i++) {
			
			//System.out.println(this.peek(i));
			if(i < small_size) {
				arr_sum[i] = (int) this.peek(i) + (int) p.peek(i);
			}else if(i > small_size){
				arr_sum[i] = (int) this.peek(i);
			}
			    
				
			
		}
		p3.setPoly(final_size-1, arr_sum);
		
		return p3;
		
		
	}
	

}
