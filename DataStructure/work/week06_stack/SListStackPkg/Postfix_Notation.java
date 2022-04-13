package SListStackPkg;

public class Postfix_Notation extends ListStack<Character>{
	
	public Postfix_Notation() { super(); } 

	public String getPostEq(String s) {
		
		String result = " ";// return할 문자열 
		int original_size = 0; //원래 리스트 사이즈 
		char temp = ' ';
		
		for(char c : s.toCharArray()){
			if(c < 'A' || c > 'Z' ) {// 피연산자가 아닌 것들은 모두 push
				if( c==')' ) { //오른쪽 괄호이면 
					temp = pop();
					while(temp != '(') {
						result+=temp;
						temp = pop();
					}
					
				}
				else {// ')' 만나기 전의 연산자들은 모두 스택에 push 
					push(c);
				}
			}
			else {//피연산자 
				result+=c;
			}
				
		}
		original_size = size();
		
		for(int i = 0; i<original_size; i++) {
			result += pop();
		}
		
		
		return result;
		
	}
	
	
	
	
	
}
