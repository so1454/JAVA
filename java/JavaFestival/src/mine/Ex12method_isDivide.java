package mine;

public class Ex12method_isDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 3 ; 
		boolean result = isDivide(num1,num2);
		System.out.println("결과확인 : " + result);
		
		
	}

	private static boolean isDivide(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if (num1 % num2 ==0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
	
	
	
	

}
