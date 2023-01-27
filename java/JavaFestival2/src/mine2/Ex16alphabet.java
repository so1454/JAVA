package mine2;

import java.util.Scanner;

public class Ex16alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// 입력받기
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.println("입력 >> ");
		String strScan = sc.nextLine(); 
		
//		System.out.printf("strScan = %s ", strScan); // 확인절차
		
		System.out.println();

		
//		for (int i = 0; i < strScan.length(); i++) {  // string은 이런식으로 길이 받기가 가능한듯
//			System.out.printf("%c %n", strScan.charAt(i)); // 입력받은 값을 하나하나 쪼개는 역할
//		}
		
		char [] spli  = new char [100];
		for (int i = 0; i < strScan.length(); i++) {  // string은 이런식으로 길이 받기가 가능한듯
			 spli[i] = strScan.charAt(i); // 입력받은 값을 하나하나 쪼개는 역할
		}
		
		// 알파벳 갯수 출력
//		System.out.printf("z - a + 1 = %d %n", 'z' - 'a' + 1);
		// s~ z -> 자체가 java 안에 저장되어있는 숫자가 있음
		// 그래서 그 숫자를 z - a 해주면 26의 숫자가 나옴 (알파벳 갯수)

		// 알파벳을 하나하나 받는 정수형 배열을 만듬
		// 자바에서 알파벳이 숫자로 표현이 되니까 그 숫자를 int형 배열에 넣어줌
		int[] arrAlpha = null;
		
		arrAlpha = new int['z' - 'a' + 1]; // 26개(알파벳 갯수)까지 넣어줄꺼다.
		
//		** 예시로 하나 돌려봄
//		for (int i = 0; i < strScan.length(); i++) { 
//			if (strScan.charAt(i) == 'a') { // 입력받은 값의 쪼갠 알파벳이 a와 같다면
//				arrAlpha[0]++;  // 배열의 첫 값을 ++해줄꺼다.
//			}
//		}
		
		
		
		for (char i = 'a'; i < 'z'; i++) { 
			for (int j = 0 ; j < strScan.length() ; j ++) {
				
				if (spli[i] == arrAlpha[j]) {
					arrAlpha[0]++;
					
				}
				
			}
		}
		
		

		for (int i = 0; i < arrAlpha.length; i++) {
			System.out.printf("%c : %d %n", 'a' + i, arrAlpha[i]); 
					// a 는 char로 셀수 있음 거기에 i 를 ++해주고
					// arrAlpha에 담아준 배열을 여기서 출력시킬꺼다 라는 뜻
//	         System.out.printf("%c : %d %n", 'a'+ i , arrAlpha[i]);
		}
//
//		sc.close();
//		System.out.println("***Finish***");
//
////			https://jiheenote.tistory.com/21	
//
//		System.out.println("a : ");

	}

}
