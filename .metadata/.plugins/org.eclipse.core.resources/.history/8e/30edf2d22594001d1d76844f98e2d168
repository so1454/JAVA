package ex02do_while문;

import java.util.Scanner;

public class Ex03몸무게관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//현재 몸무게와 목표 몸무게를 입력받으세요
		//주차별 감량 몸무게를 입력 받으세요
		//현재 몸무게가 목표 몸무게에 달성하면 축하한다는 문구를 출력하고 종료시켜주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 0; 
		
		do {
			week++;
			System.out.print(week+"주차 감량 몸무게 : " );
			int kg = sc.nextInt();
			
			now = now - kg ;
					
			
		}while(goal < now);
	
		System.out.println(now+"kg 달성! 축하합니다~!");
		
	}

}
