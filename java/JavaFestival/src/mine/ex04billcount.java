package mine;

import java.util.Scanner;

public class ex04billcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제가 도랏슴
		
		Scanner sc = new Scanner(System.in);
		
		//거스름돈 입력받기 
		System.out.print("총 금액 입력 : ");
		int totalMoney = sc.nextInt();
		System.out.println("잔돈 : "+ totalMoney);
		//지폐의 개수 출력하기
		int bill = 0;
		
		do {
		
			System.out.println("10000원 : " + (totalMoney /10000) +"개" );
			
			bill = totalMoney - 10000 * totalMoney /10000;
			
			int bill2 = bill / 5000;
			System.out.println("5000원 : " + bill2+"개" );
			
			break;
		}while(true);
		
		
		
		//단, 최대단위는 10000원, 최소단위는 100원
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
