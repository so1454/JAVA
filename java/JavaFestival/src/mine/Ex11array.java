package mine;

import java.util.Random;

public class Ex11array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		8칸 크기의 배열 선언 랜덤수로 초기화한 후 가장 큰 수와 작은 수 출력!

		Random rn = new Random();
		int[] array = new int[8];

		System.out.print(" 배열에 있는 모든 값 : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100) + 1;
			;
			System.out.print(array[i] + " ");

		}
		System.out.println(" ");
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				
			}
		}
		System.out.println("가장 큰값 : " + max);

		int min = array[0];  //아니 왜..오애ㅐ오ㅑ????/???
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				
			}
		}
		System.out.println("가장 작은값 : " + min);

	}

}
