package ex01상속기초;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Parents p 객체 생성
		Parents p = new Parents();
		
		// Child c 객체 생성
		Child c = new Child();
		
		//p
		p.makeGalbi();  // 메소드안에 프린트문을 넣어놔서 프린트됨
		p.makeKimchi();
		
		//c
		c.makeGalbi();
		c.makeKimchi();
		
		c.makeKal();
//		p. 상속을 받은 쪽은 부모쪽에서 찾아볼 수 없음
		
		// 오버라이딩 해주면
		// p에 있던걸 c에서 재정의 해준거니까
		// 재정의된 c.makeKimchi 를 출력하면 c를 먼저 가서 확인하고 있으면 그걸먼저 가져온다.
		// 그리고 나서 p를 가는거임
		
//		캐스팅 -> 기존 데이터 타입을 다른 데이터 타입으로 변환하는 것
//		작은거- 큰거 됨
//		큰거 - 작은거는 안됨(형변환해줘야함)
		
	}

}
