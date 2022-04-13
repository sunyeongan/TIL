package SListStackPkg;

import ArrayStack.ArrayStack;


public class Postfix_Nontation_Test {

	public static void main(String[] args) {
		
		ArrayStack<String> stack = new ArrayStack<String>();
		Postfix_Notation p = new Postfix_Notation();
		Postfix_calc p2 = new Postfix_calc();
		
		String s1 = "A*(B+C/D)";
		String s2 = "(A+B)*(C-D)";
		
		//System.out.println(s1 + " : " + p.getPostEq(s1));
		//System.out.println(s2 + " : " + p.getPostEq(s2));
		
		String[] s3 = {"8", "37" , "13" , "+", "40" , "-", "*"};
		String[] s4 = {"20", "-10", "3", "+", "*"};
		
		//System.out.println(p2.calc(s3));
		System.out.println(p2.calc(s4));
		
		
	}

}
