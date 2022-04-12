package DListPkg;

import java.util.Arrays;

public class DListAdd extends DList<Integer> {
	
	


	public DListAdd() {super();}
	
	
	public int add(DList<Integer> dl2) {
		
		int final_size = Math.max(this.getSize(),dl2.getSize());
		
		int[] arr1  =  this.getList();
		int[] arr2 = dl2.getList();
		int[] sumarr = new int[final_size];
		int carry= 0;
		
		int result = 0;
		
		if(arr1.length < arr2.length) {
			
			arr1 = Arrays.copyOf(arr1, final_size); //작은 배열이 크기를 키움. 
			
			arr1[final_size-1] = 0;
			
		}else {
			arr2 = Arrays.copyOf(arr2, final_size);
			arr2[final_size-1] = 0;
		}
		
		/*for(int i = 0; i<this.getSize(); i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
	
		for(int i = 0; i<dl2.getSize(); i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		*/
		
		
		for(int i = 0; i < final_size; i++) { //올림 연산 수행 
			
			
			sumarr[i] = arr1[i] + arr2[i]+ carry;
			
			if(sumarr[i] >=10) {
				carry = (int) Math.floor(sumarr[i]/10);
				sumarr[i] = sumarr[i] % 10;
				
			}else
				carry = 0;
			
			//System.out.println("올림수 : " + carry);
			//System.out.println(sumarr[i]);
			
		}
		
		for(int i = final_size-1; i >= 0; i--) {
			
			result += sumarr[i] * Math.pow(10, i); // 자릿수 마다 1000, 100, 10 ,1 곱해서 더함 
			//System.out.println(result);
		
		}
		
		return result;
			
		
	}
	

}
