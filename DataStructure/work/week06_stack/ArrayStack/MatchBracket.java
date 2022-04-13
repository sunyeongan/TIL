package ArrayStack;

public class MatchBracket extends ArrayStack<Character>{
	
	public MatchBracket() {
		super();
	}
	
	public boolean checkParentheses(String s) {
		
		char temp = ' ';
		
		for (char c : s.toCharArray()) {
			
			if(c == '(' || c == '[' || c=='{' )
				push(c);
			else if(c == ')' || c == ']' || c == '}' ) {
				if (isEmpty()) return false;// 스택이 비어있으면 false  
				temp = pop();
				//System.out.println("c " + c+" temp " + temp);
				
				if(temp =='(' && c!=')')
					return false;
				else if(temp =='[' && c!=']')
					return false;
				else if(temp =='{' && c!='}')
					return false;
			}
					
		}
		return true;
		
	}
	
	
	

}
