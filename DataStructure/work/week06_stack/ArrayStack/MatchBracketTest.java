package ArrayStack;

public class MatchBracketTest {

	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<String>();
		MatchBracket m = new MatchBracket();
		String str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		String str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		
		
		//System.out.println(str1+"  : "+m.checkParentheses(str1));
		System.out.println(str2+"  : "+m.checkParentheses(str2));
	}

}
