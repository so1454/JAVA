package ex01메소드;

public class Ex06돌아온완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int startValue = 2;
		int endValue = 1000;
		
		getPerfectNumber(startValue, endValue);
		
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		// TODO Auto-generated method stub
		
		int isum = 0;
		System.out.print(startValue+"부터 " +endValue+"까지 완전수 : ");
		for (startValue = 1; startValue <= endValue; startValue++) {
			
			int sum = 0;
			for (int j = 1; j < startValue; j++) {

				if (startValue % j == 0) {
					sum = j + sum;
				}
				
			}
			if (startValue == sum) {
				System.out.print(startValue +" ");
				isum = isum + startValue ;    
			}
			
		}
		System.out.println(" ");
		System.out.println("합은 : " + isum);
		
		
		
		
	}

}
