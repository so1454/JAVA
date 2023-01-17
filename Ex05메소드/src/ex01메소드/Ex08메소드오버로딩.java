package ex01메소드;

public class Ex08메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메소드 오버로딩(=중복정의)
		// 매개변수의 개수를 다르게하고, 메소드 이름은 똑같이 부여
		System.out.println(add(3,4));
		System.out.println(add(2.5, 9.8));
		
		
		
		
		
		
	}
	// 메소드 오버로딩 성립조건
	// 1. 이름이 같아야한다.
	// 2. 매개변수의 개수 혹은 자료형이 달라야한다. 
	// 3. 매개변수와 메소드 이름이 동일하고, 리턴타입만 다른 경우는 오버로딩이 아니다.
	
	// 더하기 메소드
	private static int add(int num1, int num2) {
		return num1 + num2 ;
	}
	private static double add(double num1, double num2) {  //이건 지금 리턴타입 매개변수 둘다 다르잔아
		return num1 + num2;
	}

	// 3. 매개변수와 메소드 이름이 동일하고, 리턴타입만 다른 경우는 오버로딩이 아니다.
//	여기서 말하는 오버로딩이 아닌 경우
	
//	private static int add(int num1, int num2) {
//		return num1 + num2 ;
//	}
//	private static double add(int num1, int num2) {  //이건 지금 리턴타입만 다르니까 오버로딩XX
//		return num1 + num2;
//	}
	
	
}
