package mine2;

import java.util.Random;

public class Ex01lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		int[] array = new int[45];

		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {  //중복 확인하는 과정
					i--;			// 다시 난수 생성 하러 전 단계로 돌아간다는말
				}
			}
		}
		
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("행운의 숫자 : %d%n", array[i]);
		}

//		1. count만큼 난수를 생성
//
//		2.1 난수 생성
//
//		2.2 지금까지 생성한 난수와 비교하여 같은게 있는지 확인 
//
//		2.3 중복된 난수가 있다면 2.1로 돌아감 (i--) 다시 난수 생성한다는거지
//
//		3 생성한 난수들 출력

	}

}
