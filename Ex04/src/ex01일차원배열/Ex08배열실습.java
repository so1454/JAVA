package ex01일차원배열;

import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====수박게임 Start!====");
		Scanner sc = new Scanner(System.in);
		// 수박게임
		// 숫자를 입력받아 숫자 만큼 수박수박이 나오는 게임을 만드시오.
		char[] text = { '수', '박' };

		System.out.print("숫자를 입력해주세요 >> ");
		int water = sc.nextInt();

		// 힌트
		// 3 -> 수박수 -> text[0]text[1]text[0] -> text[짝]text[홀]text[짝]

		// 3 입력시
//		System.out.println(text[0]); // 0 % 2 = 0
//		System.out.println(text[1]); // 1 % 2 = 1
//		System.out.println(text[0]); // 2 % 2 = 0
		// 4 입력시
//		System.out.println(text[0]); 
//		System.out.println(text[1]);
//		System.out.println(text[0]);
//		System.out.println(text[1]); // 4 % 2 = 0

		for (int i = 0; i < water; i++) {

			System.out.print(text[i % 2]);
		}

	}

}
