package ex01상속기초;

public class Child extends Parents {
	//새로운 클래스, 자식클래스, 서브클래스
	//식당 2호점
	
	public void makeKal(){
		System.out.println("칼국수를 만들자! 휘리릭~");
	}
	//메소드 오버라이딩(method overriding)
	// 부모클래스가 가지고 있던 메소드 틀 (리턴타입, 메소드명, 매개변수)을 가지고 와서
	// 그대로 가지고 와서 안쪽에 있는 로직({}안을 말한다.)만 재정의한다.
	// 상속이 전제되어있어야한다 ☆☆☆☆☆☆
	// --> 원래 Parents에 있던거 가지고와서 child에서 재정의 해준거임
	public void makeKimchi() {
		System.out.println("맛있는 삼겹살 김치전을 만들자! 바사삭~");
	}
	
	// 오버라이딩 해주면 메인으로 가서 실행을 시켰을때!
			// p에 있던걸 c에서 재정의 해준거니까
			// 재정의된 c.makeKimchi 를 출력하면 c를 먼저 가서 확인하고 있으면 그걸먼저 가져온다.
			// 그리고 나서 p를 가는거임
}
