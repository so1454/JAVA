package festival;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {

		Random rn = new Random();
		int [] array = new int[45];
		
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; i < j  ; j++) {
				
				if (array[i] == array[j]) {
					i--;
				}
				
				
			}
		}
		
		
		
		
		
		
		for (int i = 0; i < 6 ; i++) {
			array[i] = rn.nextInt(45)+1;
			System.out.println("행운의 숫자 : " + array[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}


}
