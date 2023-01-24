package mine;

public class Ex16_nxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		
		int cnt = 1;
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[j][i] = cnt;
				cnt++;
			}

			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] +" ");
			}
			System.out.println(" ");
		}

	}

}
