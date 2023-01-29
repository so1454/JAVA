package mine;

import java.util.Scanner;

public class Ex16_nxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 N을 입력해주세요 : ");
		int N = sc.nextInt();
		int[][] array = new int[N][N];
		
		int cnt = 1;
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = cnt;
				cnt++;
			}

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] +" ");
			}
			System.out.println("");
		}

	}

}
