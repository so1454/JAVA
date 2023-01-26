package mine2;

import java.util.Scanner;

public class Ex09junsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("N입력 : ");
		int N = sc.nextInt();
		System.out.println("X입력 : ");
		int X = sc.nextInt();

		int[] array = new int[N];

		int num = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 정수 입력 : ", i + 1);
			array[i] = sc.nextInt();

		}
		System.out.print("결과 >> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}

		}

	}

}
