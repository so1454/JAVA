package ex02객체지향기초;

public class Member {

	//메인(main)없이 만드는것  ; 설계도
	
//	1. 필드 : 데이터, 속성
	// 이름
	String name ; 
	// 연락처
	String phone;
	// 생년월일
	int birth;
	// 성별
	char gender ;
	// 나이
	int age ;
//	2. 메소드 : 행위, 로직(logic), 기능
	// 회원가입한다.
	public void join(String inputName, int inputAge) {
		
		name = inputName;		
		age = inputAge;
		System.out.println("회원가입 완료~~");
		
		
	}
	// 로그인한다.
	public void logIn() {
		System.out.println(name + "님이 로그인 했습니다.");
	}
	// 
		
	
	
}
