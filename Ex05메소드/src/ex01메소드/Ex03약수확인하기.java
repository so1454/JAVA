package ex01메소드;

public class Ex03약수확인하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(isDivisor(10,2));  //내가한거
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);

	}
	//
	private static boolean isDivisor(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if(num1 % num2 ==0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	//내가한거
	
	//고정		\ //리턴타입 //변수이름\ //매개변수 자리    \
//	public static boolean isDivisor(int num1, int num2) {
//		
//		boolean divisor = num1 % num2 ==0 ? true : false; //divisor에 값을 담아서
//		
//		return divisor; //여기서 반환을 해줄거다.
//	}
	
	
}
