package mine;

import java.util.Scanner;

public class ex07hang_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();

		
		
		
		for (int j = hang; j > 0 ; j++) {

			for (int i = hang; i < j; i--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
	}

}
