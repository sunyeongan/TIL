import java.util.Scanner;
public class Integer3Plus {

	public static void main(String[] args) {
		int[] Arr = new int[101];
		int n;
		int temp;
		int n1 = 0,n2 = 0,n3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		n = sc.nextInt();
		sc.close();
		
		for (int i = 1; i<Arr.length; i++) {
			Arr[i] = i;
			
		}
		for (int i = 1; i<n; i++) {
			temp = n;
			n1 = i;
			n2 = i+1;
			n3 = temp-(n1+n2);
			if (n1+n2+n3 == temp) {
				break;
			}
		}
		System.out.print("출력 : n1 : " + n1 + " n2 : " +n2 +" n3 : " + n3);

	}

}
