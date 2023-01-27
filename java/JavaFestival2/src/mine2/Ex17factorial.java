package mine2;

import java.util.Scanner;

public class Ex17factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
	
		
		int gob = 1;
		
		for(int i = 1 ; i <= in ; i ++) {
			gob *= i;
		}
		
		System.out.println("출력 : " + gob);
		
		
		
		
		
		
		
		
	}

}
