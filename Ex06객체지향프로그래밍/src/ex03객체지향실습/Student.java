package ex03객체지향실습;

public class Student { // 설계도

	// 속성정리
	private String name; // 여기서 붙힌 private은 값을 바꾸지 못하게 하기위해 하는 것
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	
	
//	 2. 메소드 /기능
//	 생성자 메소드
//	 생성자 메소드 특징
//	 	1. return 타입을 지정하지 않는다.(void도 작성하지 않는다)
//	 	2. 메소드 이름은 class이름과 동일해야한다.
//	 		--> 대소문자까지 똑같아야한다.
//		3. new 키워드를 사용할 때 호출되는 메소드(객체 생성시 사용됨)
//	 	4. 기본 생성자(매개변수가 없는 생성자)는 생략이 가능
//	 	5. 개발자가 새로운 생성자를 만들어내면, 기본생성자는 사라진다!
//	 		--> 기본생성자를 살리고 싶다면?
//	 		--> 생성자를 오버로딩(중복정의) 하면된다
// 	 	6. 생성자는 하나 이상 선언되어야한다.
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {

		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;

	}
	// 요게 기본 생성자
	public Student() {
		//오버로딩 해줌
	}

	// ** private사용시 필드에 있는 것을 사용하려면 getter와 stetter가 무조건 필요하게 된다.
	// 2-1) getter 메소드
	// --> private으로 숨겨져있는 데이터에 접근
	// 다른 클래스에서 데이터를 가져갈 수 있게끔 만들어주는 메소드
	public String getName() {
		return name;
	}

	// 2-2) setter 메소드
	// : private으로 숨겨져있는 필드의 값을 수정하고 싶을 때 사용하는 메소드
	public void setName(String name) {
		this.name = name; // 단순히 필드값 수정이라서 리턴이 필요없음
//		-->this 키워드
//		     : 현재코드를 작성하고 있는 클래스 자체를 의미하는 키워드
	}

//	alt shift s --> generate getter and setter

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
