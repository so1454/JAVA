package ex01일차원배열;

import java.util.Scanner;

public class ex06배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문제, 입력한 점수의 총합과 평균 출력
//		1. 키보드로부터 입력하기 위한 Scanner만들기
		Scanner sc = new Scanner(System.in);

//		2. 길이가 5인 정수형 배역 array만들기
		int[] array = new int[5];
		
//		3. 각 인덱스 안에 키보드로부터 입력받은 값을 넣기
//		System.out.print(0 + 1 + "번째 입력 >> ");
//		array[0] = sc.newInt();
//		System.out.print(1 + 1 + "번째 입력 >> ");
//		array[1] = sc.newInt();
//		System.out.print(2 + 1 + "번째 입력 >> ");
//		array[2] = sc.newInt();
//		System.out.print(3 + 1 + "번째 입력 >> ");
//		array[3] = sc.newInt();
//		System.out.print(4 + 1 + "번째 입력 >> ");
//		array[4] = sc.newInt();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
			
		}

//		4. 각 인덱스 안에 값 출력
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
		int max = array[0];
		
		for(int i = 0 ; i<array. length ; i++) {
			if(max < array[i ]) {
				max = array[i];
			}
		}
		
//		5. 최고 점수 출력
//		6. 최저점수 출력
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0 ; i<array. length ; i++) {
			if(max < array[i ]) {
				max = array[i];
			}
		}

		System.out.println("최고점수 : "+ max) ;
		System.out.println("최저점수 : " + min);


////		7. 총합 변수 만들어서
//		int sum = 0;
//		sum += array[0];
		
		
		
		  
//			      // TODO Auto-generated method stub
//			      // 문제. 입력한 점수의 총합과 평균 출력
//			      // 1.키보드로 부터 입력하기위한 Scanner 변수 만들기
//			      Scanner sc = new Scanner(System.in);
//			      // 2.길이가 5인 정수형 배열 array 만들기
//			      int[] array = new int[5];
//			      // 3.각 인덱스 안에 키보드로 부터 입력받은 값을 넣기
//			      for (int i = 0; i < array.length; i++) {
//			         System.out.print(i + 1 + "번째 입력 >> ");
//			         array[i] = sc.nextInt();
//			      }
//			      // 4.각 인덱스 안의 값 출력
//			      System.out.print("입력된 점수 : ");
//			      for (int i = 0; i < array.length; i++) {
//			         System.out.print(array[i] + " ");
//			      }
//
//			      System.out.println();
			      
			      // 5.최고 점수 구해서 출력 (변수 max 만들어 활용)
			      // 6.최저 점수 구해서 출력 (변수 min 만들어 활용)

//			      int max = array[0];
//			      int min = array[0];
//
//			      for (int i = 1; i < array.length; i++) {
//			         if (max < array[i]) {
//			            max = array[i];
//			         }
//			         if (min > array[i]) {
//			            min = array[i];
//			         }
//			      }
//
//			      System.out.println("최고점수 : " + max);
//			      System.out.println("최저점수 : " + min);
//
//			      // 7.총합 변수 만들어서 각 인덱스의 값 누적해서 출력
//			      int sum = 0;
//			      
//			      for (int i = 0; i < array.length; i++) {
//			         sum += array[i];
//			      }
//			      
//			      System.out.println("총합 : " + sum);
//			      
//			      // 8.총합 변수를 배열의 길이로 나눠서 출력 (평균)
//			      System.out.println("평균 : " + sum / array.length);

		
		
		
		
		
		
		
		
		
		
		
		
		
		   

}
}
