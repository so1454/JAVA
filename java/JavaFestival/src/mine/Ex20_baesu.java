package mine;

import java.util.Scanner;

public class Ex20_baesu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		int num = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%d 번째 정수 입력 >> ",i+1);
			num = sc.nextInt();
			array[i] = num;
			
		}
		System.out.print("3의 배수 : ");
		for(int i = 0 ; i < 10 ; i++) {
			if(array[i] % 3 == 0 ) {
				System.out.print(array[i] + " ");
			}
		}
		
		
		
		
		
		
	}

}
