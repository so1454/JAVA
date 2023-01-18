package mine;

import java.util.Scanner;

public class Ex05star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();

		for (int j = 0; j < hang; j++) {

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
