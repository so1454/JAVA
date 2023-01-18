package arrayList기초;

public class Person {

	// 설계도 open
	
	// 1. Field (속성, 데이터)
	private String name; 
	private int age;
	
	// 2. Method(기능, 행위, 로직)
	
	// 2-1. 생성자 메소드 만들기(모든 필드 초기값 채우는 생성자)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	// 2-2 모든 필드의 getter 메소드 만들기

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
