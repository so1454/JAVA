package mine2;

public class Ex13poewrN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 2;
		int n = 3;
		int result = powerN(base,n);
		System.out.println("결과확인 : " + result);
		
		
		
	}

	private static int powerN(int base, int n) {
		// TODO Auto-generated method stub
		
		// 2*2*2 = 2^3
		// 2*2*2*2 = 2^4
		int result = base;
		for( int i = 1 ; i < n ; i++) {
			result *= base;
		}
		
		
		
		return result;
	}
	
	
	

}
