package mine2;

import java.util.Scanner;

public class Ex01indexstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int num = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 별의 수 : ", i);
			array[i] = sc.nextInt();
		}
		
		
		for(int i = 0 ; i <array.length ; i ++) {
			
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

		

		
		
		
		
	}

}
