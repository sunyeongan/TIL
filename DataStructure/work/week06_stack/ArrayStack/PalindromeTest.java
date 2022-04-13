package ArrayStack;

public class PalindromeTest {

	public static void main(String[] args) {
		
		ArrayStack<String> stack = new ArrayStack<String>();
		Palindrome p = new Palindrome ();
		
		
		
		
		String s1 = "redivider";
		String s2 = "redder";
		String s3 = "a";
		String s4 = "abbd";
		String s5 = "abcde";
		
		System.out.println(s5 + " : " + p.checkPalindrome(s5));

	}

}
