import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num;
		boolean sosu = true;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 큰 양의 정수를 입력하세요 : ");
		num = sc.nextInt();
		for (int i = 2; i<num-1; i++) {
			if(num%i == 0) {
				sosu = false;
			}
		}
		
		if(sosu == false) {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}else {
			System.out.println(num+"은(는) 소수 입니다.");
		}

	}

}
