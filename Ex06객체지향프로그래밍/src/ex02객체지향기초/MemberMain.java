package ex02객체지향기초;

public class MemberMain {
	
	// 실행하는 공간, 객체를 생성할 수 있는 공간
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 클래스를 기반으로 객체를 생성
		Member m1 = new Member();
		//  - 객체 생성
		//  - 자료형 변수명 = new 자료형();
		System.out.println(m1); //앤 멤버의 주소값을 가지고 있는애임
		System.out.println(m1.name); // string이라서 null이라고 뜸
//		m1.  //여기서 .은 ; ~이 가지고 있는 --> '.' 이라는 의미를 가짐 
		System.out.println(m1.age); // int라서 0이라고 뜸
		
		m1.join("구소현" , 26);  // name 안에 inputName이라는 매개변수를 넣어놨으니까
		System.out.println(m1.name);  //여기서 name을 불러오면 넣어둔 이름이 뜸
		System.out.println(m1.age);
		
		m1.phone = "01012341234";
		m1.birth=  980519;
		m1.gender = '여';
		
		System.out.println(m1.phone);
		System.out.println(m1.birth);
		System.out.println(m1.gender);
		
		
		
		///////////////////////////
		System.out.println(" ");
		
		Member m2 = new Member();
		
		m2.join("문경수" ,49 );
		m2.phone = "01012341234";
		m2.birth=  740723;
		m2.gender = 'M';
		
		System.out.println(m2.name);  
		System.out.println(m2.age);
		System.out.println(m2.phone);
		System.out.println(m2.birth);
		System.out.println(m2.gender);
		
		
		
	}

}
