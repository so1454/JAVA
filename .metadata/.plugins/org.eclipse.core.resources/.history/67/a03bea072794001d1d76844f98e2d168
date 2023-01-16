package ex02do_while문;

import java.util.Random;
import java.util.Scanner;

public class Ex04랜덤숫자뽑기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 난수(랜덤숫자)를 생성하는 변수만들기
		Random r = new Random();

		Scanner sc = new Scanner(System.in);

		// 난수생성
//		int testNum = r.nextInt(10)+1; //<- 여기 괄호안에는 범위지정인데 그냥 10만넣으면 0~10이나옴
//										// 			하지만, +1을 해주면 1~10까지 나옴
//		System.out.println(testNum);

		// 문제.
		// 랜덤으로 정수2개를 뽑아 문제를 출력
		// 사용자로부터 두수의 합을 입력받으세요.
		// 입력 받은 값이 두 수의 합과 일치하면 성공!!
		// 그렇지 않은 경우 실패..출력
		// 일치하지 않았을 때만 다시 실행할 것인지 물어보고
		// "Y"를 입력하면 계속 실행
		// "N"을 입력하면 프로그램 실행

		System.out.println("====plus game====");

		do {
			int num1 = r.nextInt(10) + 1; // 랜덤으로 출제될 첫번쨰 수
			int num2 = r.nextInt(10) + 1; // 랜덤으로 출제될 두번째 수

			int result = num1 + num2; // 랜덤의 두수의 합을 저장할 변수
			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt(); // 사용자가 입력한 정답이 저장될 변수

			if (result == answer) {
				System.out.println("success");

			} else {
				System.out.println("fail");
				System.out.println("계속하시겠습니까?>>");
				String contin = sc.next();

				if (contin.equals("N")) {
					System.out.println("종료합니다");
					break;
				} else if (contin.equals("Y") || contin.equals("N")) {
					System.out.println("잘못입력하셨습니다.");
				} else {
					break;
				}
			}
		} while (true);

	}

}
