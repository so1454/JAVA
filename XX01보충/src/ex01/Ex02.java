package ex01;

import java.util.Arrays;

public class Ex02 {

	private static final Object A = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제, 각 문자의 갯수를 세주세요
		// split() : 특정 문자를 기준으로 분리해주는 기능
		//toString() : 배열이 잘 담겼나 확인해주는 기능
		
//		System.out.println(Arrays.toString(array)); // 이렇게 사용함
		
		//charAt() : String 으로 저장된 문자열 중 한 문자를 char타입으로 변환
		//   --> 주의) ',' 과 공백도 문자로 인식함

		String score = "A,A,B,C,D,A,C,D,D,D,F";


		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		//첫번째 방법! 
		
//		String[] array = score.split(",");
		
//		for (int i = 0; i < array.length; i++) {
//			if ("A".equals(array[i])) {
//				cntA++;
//			} else if ("B".equals(array[i])) {
//				cntB++;
//			} else if ("C".equals(array[i])) {
//				cntC++;
//			} else if ("D".equals(array[i])) {
//				cntD++;
//			} else if ("F".equals(array[i])) {
//				cntF++;
//			}
//			
//		}
		
		//잘 나오는지 확인해보기
//		System.out.println(score.charAt(1)); //,나옴
//		System.out.println(score.charAt(2)); //A나옴
//		System.out.println(score.length()); //문자 갯수 구하는 방법
		
//		두번째 방법!
		
		for(int i = 0 ; i < score.length(); i++) {
			if (score.charAt(i) == 'A') { //이거는 문자인데도 == 쓸 수 있다. 그리고 작은 따옴표로 문자를 
				cntA++;
			}
			else if (score.charAt(i) == 'B') {
				cntB++;
			}
			else if (score.charAt(i) == 'C') {
				cntC++;
			}
			else if (score.charAt(i) == 'D') {
				cntD++;
			}
			else if (score.charAt(i) == 'F') { //여기서 조건없이 else로 하면 ','까지 세져서 숫자가 더 나옴
				cntF++;
			}
		}

		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");

	}

}
