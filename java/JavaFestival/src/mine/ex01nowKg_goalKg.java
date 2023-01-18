package mine;

import java.util.Scanner;

public class ex01nowKg_goalKg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 현재 몸무게 입력받기
		System.out.print("현재몸무게 : ");
		int nowKg = sc.nextInt();

		// 목표 몸무게
		System.out.print("목표 몸무게 : ");
		int goalKg = sc.nextInt();

		// 주차별 감량 몸무게
		int week = 0;
		do {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");

			int weekKg = sc.nextInt();
			nowKg = nowKg - weekKg;
			if (nowKg <= goalKg) {
				break;
			}
		} while (true);

		// 축하메세지
		System.out.print(nowKg + "kg 달성!! 축하합니다!");

	}

}
