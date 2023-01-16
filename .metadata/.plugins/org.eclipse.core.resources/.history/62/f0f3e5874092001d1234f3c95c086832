package 일차원배열;

import java.util.Scanner;

public class Ex06배열실습_숙제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		// 입력받기
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 입력 >> ", i + 1);
			array[i] = sc.nextInt();

		}
		// 입력된 점수
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		// 최고점수
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최고점수 : " + max);

		/// 최저점수
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min ) {
				min = array[i];
			}
		}
		System.out.println("최저점수 : " + min);

		// 총합
		int sum = array[0] + array[1]+ array[2]+ array[3]+ array[4];
		System.out.println("총합 : "+sum);
		
		// 평균
		
		int avg = (array[0] + array[1]+ array[2]+ array[3]+ array[4])/5;
				System.out.println("평균 : "+avg);
	
	
	}
	

}
