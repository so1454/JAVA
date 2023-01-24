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
		
		for (int j = 0 ; j < hang ; j ++) {
			for (int i = hang ; i > j ; i --) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		for (int i = hang ; i > 0 ; i --) {
//		System.out.print("*");
//		}
//		for (int i = hang ; i > 1 ; i --) {
//			System.out.print("*");
//		}
//		for (int i = hang ; i > 6 ; i --) {
//			System.out.print("*");
//		}
			
		


	}

}
