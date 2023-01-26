package mine2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07ASC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] array = new int[5];
		
		
		for(int i = 0 ; i<array.length ; i ++) {
			System.out.println((i+1) +"번째 수 입력 : ");
			array[i] = sc.nextInt();
			
		}
		
		Arrays.sort(array); // 오름차순 정렬가능(int string 구분 없음)
		System.out.println("정렬 후 : " + Arrays.toString(array));
		
		
		
		
	}

}
