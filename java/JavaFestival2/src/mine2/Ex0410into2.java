package mine2;

import java.util.Scanner;

public class Ex0410into2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10진수를 입력받아 2진수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num10 = sc.nextInt(); // 10,9.. 같은 숫자
		 
		int [] array2 = new int[10]; // 2진수는 1011 이런 숫자 -->2진수가 저장될 배열

		int arrayIndex = 0;
		int mok = 0;
		int na = 0;
		
		do {
			mok = num10 / 2;  
			na = num10 % 2;  
			
			array2 [arrayIndex] = na; // 0 이 담김
			
			num10 = mok; 
			
			arrayIndex += 1 ;
			
		}while( num10 != 0);
		
		arrayIndex = arrayIndex -1;
		for ( int i = arrayIndex ; i >= 0 ; i --) {
			System.out.print( array2[i]+"");
		}
		
		
//		https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=javaking75&logNo=140184874001
		
		
		
//		
//		num10 = num10 / 2; // 
//		na = num10 % 2; //1
//		array2 [1] = na; // 1이 담김
//		
//		System.out.println(array2[1]);
		
		
		
		
//		String binaryString = Integer.toBinaryString(i); //2진수
//		
//		System.out.println(binaryString);



		
		
		
		
		
		
		
	}

}
