package ex01일차원배열;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex06_RE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문제, 입력한 점수의 총합과 평균 출력
//			n번쨰 출력 >> 입력받은 수
//		입력받은 점수 : 전부 나타내기 >>
//		최고점수 :
//		최저점수
//		총합 :
//		평균 :
		//5개출력 예정
		int []array = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print((i+1) +"번째 출력 >>");
			int score = sc.nextInt();
			
			array[0] = score;
		}
		
		
		System.out.println("입력받은 점수 : " + array[0] );
		//배열에 값을 담음
		
		
		
		
		
		
		
		
	}

}
