package ex01일차원배열;

import java.util.Scanner;

public class Ex11배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 사용자가 입력한 답을 저장할 배열
		int[] input = new int[5]; // 초면인데요...
		// 실제 정답을 저장하고 있는 배열
		int[] answer = { 1, 4, 3, 2, 1 };

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요 ");

		for (int i = 0; i < input.length; i++) {

			System.out.print((i + 1) + "번 답 >> ");
			input[i] = sc.nextInt();
		}

		System.out.println("정답확인");
		int sum = 0;

//		for (int i = 1; i < input.length; i++) {
//			if (input[0] == answer[0]) {
//				System.out.print(" O ");
//				sum = sum + 20;
//			} else {
//				System.out.print(" X ");
//			}
//			if (input[1] == answer[1]) {
//				System.out.print(" O ");
//				sum = sum + 20;
//			} else {
//				System.out.print(" X ");
//			}
//			if (input[2] == answer[2]) {
//				System.out.print(" O ");
//				sum = sum + 20;
//			} else {
//				System.out.print(" X ");
//			}
//			if (input[3] == answer[3]) {
//				System.out.print(" O ");
//				sum = sum + 20;
//			} else {
//				System.out.print(" X ");
//			}
//			if (input[4] == answer[4]) {
//				System.out.print(" O ");
//				sum = sum + 20;
//			} else {
//				System.out.print(" X ");
//			}
//		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] == answer[i]) {
				System.out.print(" O ");
				sum = sum +20;  //점수 누적하기
			}else {
				System.out.print(" X ");
			}
		}
		
		
		System.out.println("총점 : "+ sum );

		// 총점도 구하고
		// x도 어떻게 나오는지 구해야되자너

	}

}
