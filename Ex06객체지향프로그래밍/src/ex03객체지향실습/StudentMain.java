package ex03객체지향실습;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행공간
		// 1. 객체로 만들어준다
		// --> 클래스 이름 객체이름 = new 클래스이름();

		Student stu1 = new Student();  
		//Student() : 생성자(constructor)      
		//--> 기본생성자(default constructor)
		// 		: 매개변수가 아무것도 없는 생성자 의미
		// --> 기본생성자는 생략이 가능하다.
		// --> 생성자도 메소드다
		stu1.setName("구소현");
		stu1.setNumber("20171191");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);

		//stu1 이름과 자바점수를 입력하세요!
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
		
		
		Student stu2 = new Student("임경남","20220458",20,90,25,50);
		
		//이 밑에걸 위에 간단하게 쓸 수 있음
//		Student stu2 = new Student();
//		stu2.setName("임경남");
//		stu2.setNumber("20220458");
//		stu2.setAge(20);
//		stu2.setScoreJava(90);
//		stu2.setScoreWeb(25);
//		stu2.setScoreAndroid(50);

	}

}
