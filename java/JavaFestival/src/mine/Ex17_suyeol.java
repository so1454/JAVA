package mine;

import java.util.Scanner;

public class Ex17_suyeol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int ent = sc.nextInt();
		
		int s = 1; 
		
		for(int i = 1 ; i < ent ; i++) {
			s = s +i;
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
		
		
	}

}
