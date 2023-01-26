package mine2;

public class Ex08_90do_spin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		int cnt = 1;

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		} /// 담고
		
		System.out.println("원본");
		print(array);  // 출력은 따로 메소드로함
		
/////////////////
		System.out.println(" ");
	
/////////////////
		cnt = 1;

		for (int i = 0; i < array.length; i++) {

			for (int j = array[i].length-1; j >= 0; j--) {
				array[j][i] = cnt;
				cnt++;
			}
		}  // 얘도 담고
		
		System.out.println("90도 회전"); 
		print(array);  // 메소드로 따로 출력시켜줌
		

	}
	
	private static int[][] print (int array[][]){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}

			System.out.println("");
		}
		
		return array;
		
		
	}
	
	
	
	
	
	

}
