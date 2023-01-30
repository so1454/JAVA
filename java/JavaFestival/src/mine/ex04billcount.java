package mine;

import java.util.Scanner;

public class ex04billcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제가 도랏슴

		Scanner sc = new Scanner(System.in);

		// 거스름돈 입력받기
		System.out.print("총 금액 입력 : ");
		int totalMoney = sc.nextInt();
		System.out.println("잔돈 : " + totalMoney);
		// 지폐의 개수 출력하기
		int bill = 0 ;
		bill = totalMoney; ;
		
		
		int one = bill / 10000;
		bill %= 10000;
		int two = bill/ 5000 ;
		bill %= 5000;
		int three = bill /1000;
		bill %= 1000;
		int four = bill  / 500;
		bill %= 500;
		int five = bill / 100;
		bill %= 100;

		System.out.println("10000원 : " +  one+ "개");
		System.out.println("5000원 : " +  two+ "개");
		System.out.println("1000원 : " +  three+ "개");
		System.out.println("500원 : " +  four+ "개");
		System.out.println("100원 : " +  five+ "개");

		// 단, 최대단위는 10000원, 최소단위는 100원

	}

}
