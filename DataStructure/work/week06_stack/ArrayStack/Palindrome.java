package ArrayStack;
import java.util.Arrays;

public class Palindrome extends ArrayStack<Character>{
	
	
	public Palindrome () {
		super();
	}
	
	public boolean checkPalindrome(String s) {
		
		char [] arr = s.toCharArray(); //문자열을 char 배열로 만들기 
		char temp = ' ';
		char[] arr1,arr2;
		int position = arr.length/2;// 자를 index 설정 
		
	
			
		for(int i = 0; i < arr.length; i++) {
			if(arr.length%2 != 0 && i == position) // 홀수 일 때 중간값 패스 
				continue;
			if(i < position)
				push(arr[i]);
			else if(i >= position) {
					
				if(pop() != arr[i]) {
					return false;
				}
					
			}
					
					
		}
			
		
		if(isEmpty()) return true;
		
		return false;
		
	}
	
}
