package ex01일차원배열;

public class Ex14확장for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for - each(확장 for문)
		// -배열안에 값을 순차적으로 꺼낼때 편리한 for문

		int[] array = { 5, 4, 57, 56, 1, 5, 3, 6, 7 };
		//기존방식
		for(int i = 0 ; i < array.length ; i ++ ) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println(" ");
		//for - each(확장 for문)방식
		// for ( 뒤에 나온 배열의 값을 꺼냈을때 변수 : 사용하고 싶은 배열 ) {}
		for( int num : array ) {
			System.out.print(num + " ");
		}
		
		
	}

}
