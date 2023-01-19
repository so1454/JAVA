package mine;

import java.util.Scanner;

public class ex07hang_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();

//		7 6 5 4 3 2 1 
//		
//		System.out.println("*******");
//		System.out.println("******");
//		System.out.println("*****");
		
	
		while(true) {
			for (int i = hang; i > 0; i--) {

				System.out.print("*");

			}
			if (hang < 0) {
				break;
			}
			System.out.println("");
		}
			
		

//		for (int j = hang; j > 0 ; j++) {
//
//			for (int i = hang; i < j; i--) {
//				
//			}
//			System.out.println(" ");
//		}

	}

}
