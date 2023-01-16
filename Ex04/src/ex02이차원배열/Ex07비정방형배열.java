package ex02이차원배열;

import java.util.Arrays;

public class Ex07비정방형배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0열의 길이는 3, 1열의 길이는 2, 2열의 길이는 5
		// 비정방형배열 . 각 열 마다 길이가 다르다.

		// 비정방형 배열 생성
		int[][] array = new int[3][]; // 3개의 열만 만들어줌

		// 이런식으로 길이를 따로 담아줌
		array[0] = new int[3]; // 0열의 길이는 3
		array[1] = new int[2]; // 1열의 길이는 2
		array[2] = new int[5]; // 2열의 길이는 5

		// 비정방형에 배열 값넣기
		int cnt = 1;
		
		//for문 완성본 -- 이전에 이차원 배열에서 하던거랑 식이 똑같음
		for(int i = 0 ; i < array.length ; i ++ ) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
				System.out.print(array [i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		//차근차근 해보기
		//array [0].length는 0행의 길이를 찾으라는 말
//		for (int j = 0; j < array[0].length; j++) {
//			array[0][j] = cnt;
//			cnt++;
//		}
//
//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
//		array[0][2] = cnt;
//		cnt++;
//
//		for (int j = 0; j < array[1].length; j++) {
//			array[1][j] = cnt;
//			cnt++;
//		}
//
//		array[1][0] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//
//		for (int j = 0; j < array[2].length; j++) {
//			array[2][j] = cnt;
//			cnt++;
//		}
//
//		array[2][0] = cnt;
//		cnt++;
//		array[2][1] = cnt;
//		cnt++;
//		array[2][2] = cnt;
//		cnt++;
//		array[2][3] = cnt;
//		cnt++;
//		array[2][4] = cnt;
//		cnt++;

		
		//for문을 사용하지 않고 배열안의 값을 확인하는 방법 //p.140
		String []team = {"구소현", "윤상재","남하은","문경수","장이수"};
		
		
		String result = Arrays.toString(team); //arrays하고 컨트롤 space 하고 자동완성해주기 import필요
								//toString --> 메소드 (기능함수) 배열안의 값을 가져오는 함수
		System.out.println(result);
		
		//메소드
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
