package ex02이차원배열;

public class Ex05지그재그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 21 22 23 24 25
		// 30 29 28 27 26
		// 31 32 33 34 35
		// 40 39 38 37 36
		// 41 42 43 44 45

		int[][] array = new int[5][5];

		// 힌트 홀짝
		// 행의 숫자가 짝수면 열이 순서대로가고
		// 행의 숫자가 홀수면 열이 1씩 감소하면서 간다

//		array[0][0] = 21 ; 
//		array[0][1] = 22 ; 
//		array[0][2] = 23 ; 
//		array[0][3] = 24 ; 
//		array[0][4] = 25 ; 

//		array[1][0] = 30 ; 
//		array[1][1] = 29 ; 
//		array[1][2] = 28 ; 
//		array[1][3] = 27 ; 
//		array[1][4] = 26 ; 

		int cnt = 21;

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = cnt;
					cnt++;
				}
			}

			if (i % 2 == 1) {
				for (int j = 4; j >= 0; j--) {
					array[i][j] = cnt;
					cnt++;
				}
			}

		}

		for (int[] num1 : array) { // 먼저 배열로 꺼내고
			for (int num : num1) { // 그 배열안의 값을 꺼내와야하는거니까
				System.out.print(num + " ");
			}
			System.out.println(" ");
		}
		

//			for (int j = 0; j < array.length; j++) {
//				array[2][j] = cnt;
//				cnt++;
//			}
//		
//			for (int j = 0; j < array.length; j++) {
//				array[3][j] = cnt;
//				cnt--;
//			}
//		

	}

}
