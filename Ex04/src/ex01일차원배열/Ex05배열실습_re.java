package ex01일차원배열;

public class Ex05배열실습_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {9,1,8,102,31,55,66};
		
		//복습1. 완
		//가장 큰 값을 출력하는 문제
				//예시 ) 가장 큰 값은 몇입니다.
		
		
		//가장 큰 값을 출력하는 문제
		//예시 ) 가장 큰 값은 몇입니다.
		System.out.print("가장 큰 값은 ");
		int max = 0;
		for(int i = 0; i < array.length ; i++) {
			if (max < array[i]) { //가장 큰 값보다 array[i] 안의 숫자가 크면
				max = array[i];		// 가장 큰값안에 array 값을 넣어줌
			}
		}
		System.out.print( max +" 입니다.");
		
	}

}
