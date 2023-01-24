package mine;

import java.util.Scanner;

public class Ex09Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		
		
		if (num1 % 10 < 5) {
			System.out.print("반올림 수 : "+ (num1-(num1 % 10)));
		}else {
			System.out.print( "반올림 수 : "+ (num1 -(num1%10) +10 ) );
		}
		
		
		
		
		 
	}

}
