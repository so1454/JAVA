package mine2;

import java.util.Random;
import java.util.Scanner;

public class Ex15_gameover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int sum = 0;
		while(true) {
			int num1 = rn.nextInt(10);
			int num2 = rn.nextInt(10);
			System.out.printf("%d + %d =", num1, num2);
			int Ians = sc.nextInt();
			int Yans = num1 + num2;

			if (Ians == Yans) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("FAIL...");
				sum++;
			}
			if(sum == 4) {
				System.out.println("GAME OVER!");
				break;
			}
		}
			
		

	}

}
