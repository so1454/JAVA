package ex01메소드;

public class Ex01메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메소드
		//- 객체의 행위를 표현하기 위한것
		//- Java에서 특정 코드를 기능으로 묶고 호출해서 사용하는 기법 
		//실습
		//두개의 숫자를 입력받아 두 수의 차를 알려주는 메소드 만들기
		
		//메소드 사용은 main안에서 하기
		int result1 = difInNum(10,1); //아래 적은 메소드를 호출함
		System.out.println(result1);
		
		System.out.println(difInNum(5,4));
		//--> 기능은 같아도 매개변수(5,4 이런거) 가 다르면 값은 다르게 나온다
	}
	
	
	// main을 벗어나서 class 안에서 만들 수 있다.
	// 두개의 숫자를 입력받아 두수(int num1, int num2)의 차(return --> 정수 출력할꺼니까 int)를 알려주는 메소드
	//1. 접근제한자 public , 정적 static(이건 그냥 외우기)을 쓴다
	public static int difInNum(int num1, int num2) {
								//--> 안의 변수는 아무거나 상관없음
		
		int result = num1 > num2 ? num1 - num2 : num2 - num1 ;	//삼항 연산자
				// --> 조건 ? 조건이 참일때 출력 : 거짓일때 출력 ; 
		return result; //result를 반환(두수의 차)
		
		//이렇게 만들어두면 위에서 짧고 간단하게 쓰기가 편해짐
		
		
	}

}
