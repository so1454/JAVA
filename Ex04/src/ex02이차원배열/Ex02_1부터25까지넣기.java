package ex02이차원배열;

public class Ex02_1부터25까지넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//문제. 아래처럼 출력시켜라
		//1 2 3 4 5
		//6 7 8 9 10
		//...
		//21 22 23 24 25
		
		//이중for문으로도 바꿔보기
		//복습 완료 1.
		
		int[][] array = new int[5][5];
		
		array[0][0] = 1 ;
		array[0][1] = 2 ;
		array[0][2] = 3 ;
		array[0][3] = 4 ;
		array[0][4] = 5 ;
		
		array[1][0] = 6 ;
		array[1][1] = 7 ;
		array[1][2] = 8 ;
		array[1][3] = 9 ;
		array[1][4] = 10 ;
		
		int cnt = 1;
		
		for (int j = 0 ; j < 5 ; j ++) {
			for( int i = 0; i < 5 ; i ++ ) {
				array [j][i] = cnt;
				cnt ++;
			}
			
			for( int i = 0; i < 5 ; i ++ ) {
			System.out.print(array[j][i] + " ");
			}
		System.out.println(" ");
		}
	
//	
//		int m = 1;
//		for (int i = 0; i < 5 ; i ++) {
//			
//			for(int j = 0; j < 5 ; j++) {
//				
//				array[i][j] = m ;
//				m++				//진짜 여기만 바꾸면 될껄..ㅇㅎ..
//				System.out.print(array[i] [j] + " ");
//			}
//			System.out.println(" ");
//		}
		
//		
//		//답
//		
//		int m = 1;
//		for (int j = 0 ; j < array.length; j ++) {
//			for (int i = 0; i < array[i].length ; i ++) { // array[i]의 열의 길이를 알 수 있음 
//				array[j][i] = m;
//				m++;
//				System.out.print(array [j][i] + " ");
//			}
//			System.out.println(" ");
//		}
		
		
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 4;
//		array[0][4] = 5;
//
//		array[1][0] = 6;
//		array[1][1] = 7;
//		array[1][2] = 8;
//		array[1][3] = 9;
//		array[1][4] = 10;
//
//		array[2][0] = 11;
//		array[2][1] = 12;
//		array[2][2] = 13;
//		array[2][3] = 14;
//		array[2][4] = 15;
//
//		System.out.println(array[0][0] + " ");

	}

}
