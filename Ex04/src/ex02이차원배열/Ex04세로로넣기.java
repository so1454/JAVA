package ex02이차원배열;

public class Ex04세로로넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제.
		// 21 26 31 36 41
		// 22 27 32 37 42
 		// 23 28 33 38 43
		// 24 29 34 39 44
		// 25 30 35 40 45
		
		int[][] array = new int[5][5];

		
		
		
//		array[0][0] = 21 ; 
//		array[0][1] = 26 ; 
//		array[0][2] = 31 ; 
//		array[0][3] = 36 ; 
//		array[0][4] = 41 ; 
//		
//		
//		array[1][0] = 22 ; 
//		array[1][1] = 27 ; 
//		array[1][2] = 32 ; 
//		array[1][3] = 37 ; 
//		array[1][4] = 42 ; 

//		array[0][0] = 21
//		array[1][0] = 22
//		array[2][0] = 23

//		System.out.println(array[0][0]);
		int cnt = 21;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < array.length; j++) {
				array[j][i] = cnt;
				cnt++;
			}
		}

		// for-each로 출력하기

//		for( int num : array ) {
//			System.out.print(num + " ");
//		}
		
		for (int[] num1 : array) { //먼저 배열로 꺼내고
			for (int num : num1) { //그 배열안의 값을 꺼내와야하는거니까
				System.out.print(num + " ");
			}
			System.out.println(" ");
		}

//		for (int i = 0; i < 5 ; i++) {
//			for (int j = 0; j < 5 ; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println(" ");
//		}
//		

	}

}
