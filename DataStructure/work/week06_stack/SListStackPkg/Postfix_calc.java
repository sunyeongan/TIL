package SListStackPkg;

public class Postfix_calc extends  ListStack<Double>{
	
	
	public Postfix_calc() { super(); }
	
	
	public double calc(String[] s) {
		
		double A,B;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("+")) {
				
				B = pop();//먼저 pop된 
				A = pop();//나중에 pop 된 
				push(A+B);
				
			}else if(s[i].equals("-")) {
				
				B = pop();
				A = pop();
				push(A-B);
				
			}
			else if(s[i].equals("*")) {
				B = pop();
				A = pop();
				push(A*B);
			}
			else push(Double.parseDouble(s[i]));//피연산자라면 스택에 push 
			
		}
		return peek();
		
	}
	

}
