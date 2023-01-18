package mine;

import java.util.Scanner;

public class ex02Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시급 계산기
		// 일한시간 입력받기
		// 총 임금 출력하기
		// 오버타임 8시간 초과시 그 시간만 1.5배 시급 책정
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int workTime = sc.nextInt();
		int salary = 0;
		
		if(workTime > 8) {
			int overTime = workTime - 8;
			salary = 8 * 5000;
			salary += overTime * 5000 * (double)1.5 ; ///???
		}else {
			salary = workTime *5000;
			
		}
		System.out.printf("총 임금은 %d입니다.",salary);
		
		
		
		
		
		
	}

}
