package ex01;

public class Ex01구구단보충 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				num = i * j;
				
				System.out.printf("%d * %d = %d\t",i,j,num); //이렇게 써도되고
			}
			System.out.println(" ");
		}
		
//		System.out.print(i + "*" + j + "=" + num + "\t"); //요렇게 써도되고
		
//		2 * 1 = 2 / 
//		2 * 2 = 4
//		2 * 3 = 6
//		2 * 4 = 8
//		2 * 5 = 10
//		2 * 6 = 12
//		2 * 7 = 14
//		2 * 8 = 16
//		2 * 9 = 18

	}

}
