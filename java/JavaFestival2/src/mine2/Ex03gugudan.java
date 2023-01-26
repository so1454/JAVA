package mine2;

import java.util.Scanner;

public class Ex03gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("단수입력 : ");
		int gugu = sc.nextInt();
		System.out.println("어느수까지입력 : ");
		int num = sc.nextInt();
		
		System.out.printf("%d단%n", gugu);
		for (int i = 1; i < num; i++) {
			System.out.printf("%d * %d = %d%n", gugu, i, (gugu * i));
		}

	}

}
