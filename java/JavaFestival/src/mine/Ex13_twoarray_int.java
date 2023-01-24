package mine;

public class Ex13_twoarray_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		
//
//		array[0][0] = 1;
//		array[0][1] = 6;
//		array[0][2] = 11;
//		array[0][3] = 16;
//		array[0][4] = 21;
//		
//		array[1][0] = 2;
//		array[1][1] = 7;
//		array[1][2] = 12;
//		array[1][3] = 17;
//		array[1][4] = 22;
		
		int cnt = 1;
		for(int j = 0 ; j < 5 ; j ++) {
			for(int i = 0 ; i < array.length ; i ++) {
				array [i][j] = cnt;
				cnt++;
				
			}
			
		}
		
		for (int j = 0 ; j <5 ; j++) {
			for(int i = 0 ; i <array.length ; i ++) {
				System.out.print(array[j][i]+ " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
//		int num = 1;
		
//		for(int i = 0 ; i < array.length ; i ++) {
//			array[0][i] = num ;
//			System.out.print(array[0][i] + " ");
//			num+=5;
//		}
//		System.out.println(" ");
//		for(int i = 0 ; i < array.length ; i ++) {
//			array[1][i] = num ;
//			System.out.print(array[1][i] + " ");
//			num+=5;
//		}
		
		
		
		
		
		
		
		
		
	}

}
