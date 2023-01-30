package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("두 번쨰 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int one = num1 * (num2 % 10);
		int two = num1 * ((num2 % 100) / 10);
		int three = num1 * (num2 / 100);
		
		
		System.out.printf("%d%n %d%n %d%n",one, two, three);
		System.out.printf("%d",num1*num2);
		
		
		

	}

}
