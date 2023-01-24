package mine;

import java.util.Scanner;

public class Ex08A_Bprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A입력 >> ");
			int A1 = sc.nextInt();
			System.out.print("B입력 >> ");
			int B1 = sc.nextInt();

			if (A1 == 0 && B1 == 0) {
				break;
			}
			System.out.print("결과 >> " + (A1 - B1));
			System.out.println(" ");
		}

	}

}
