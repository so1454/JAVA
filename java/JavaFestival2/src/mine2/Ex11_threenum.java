package mine2;

import java.util.Scanner;

public class Ex11_threenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1의자리 : n%10
//		10의자리 : n%100 / 10
//		100의자리 : n%1000 / 100
//		1000의자리 : n%10000 / 1000
//		10000의자리 : n%10000

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		int result = num * num2; // 총 곱

		int one = num*(num2 % 10);
		int two = num*((num2 % 100) / 10);
		int three = num*((num2 % 1000) / 100);
		
		
		System.out.printf("%d%n%d%n%d%n%d",one,two,three,result);

	}

}
