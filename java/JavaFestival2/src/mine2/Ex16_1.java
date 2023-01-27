package mine2;

import java.util.Scanner;

public class Ex16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.println("입력 >> ");
		
		String lower = sc.nextLine().toLowerCase();
		
		for(char i = 'a' ; i <= 'z' ; i++) {
			int num = 0 ;
			System.out.print(i + " : ");
			
			
			for(int j = 0 ; j <lower.length(); j++ ) {
				
				if (lower.charAt(j) == i) {  // 배열을 안쓰고 직방으로 풀었음
					num++;
				}
				
			}
			System.out.println(num);
			
			
			
			
		}
		
		
		
		
		
	}

}
