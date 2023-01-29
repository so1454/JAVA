package mine2;

import java.util.Scanner;

public class Ex07ASC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		int [] array = new int[2];
		int [] array = {5,3,1,2,4};
		
//		for(int i = 0 ; i<array.length ; i ++) {
//			System.out.println((i+1) +"번째 수 입력 : ");
//			array[i] = sc.nextInt();
//		}
		
		for (int j = 0 ; j < array.length ; j ++) {
			for (int i = 0 ; i < array.length ; i ++) {
				if( array[i] > array[j]) { // 만약 i가 j보다 크다면, i를 뒤로 보내줘야함
					
					int arr = array[j]; // j를 arr에 담아주고
					
					array[j] = array[i]; // j랑 i 배열 순서를 바꾸고(j안에 i)
					
					array[i] = arr; // 앞에서 담아준 j를 i에 다시 넣어줌
				}
			}
		}
		
		for (int i = 0 ; i <array.length ; i ++) {
			System.out.println(array[i]);
		}
		
		
		
//		
//		System.out.println("");
//		Arrays.sort(array); // 오름차순 정렬가능(int string 구분 없음)
//		System.out.println("정렬 후 : " + Arrays.toString(array));
		
		
		
		
	}

}
