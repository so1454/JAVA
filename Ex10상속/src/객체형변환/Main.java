package 객체형변환; //객체 형변환

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 항상 메인으로 오면 설계도에 있는걸 가져오도록 객체생성을 해야함
		// 1. 객체생성
		// Phone p
		Phone p = new Phone();
		
		// SmartPhone iPhone
		SmartPhone iPhone = new SmartPhone();
		
		// Casting
		// 형변환 --> 레퍼런스 타입의 형변환은 어떻게 일어날까?
		// 레퍼런스타입의 형변환
		// : 상속이 전제되어 있어야하며, 객체 내 필드와 메소드의 접근권한에 따라
		// 				강제형변환인지 자동형변환인지 결정된다.
		
		// 1) UpCasting
		// : 자식(서브,하위) 클래스가 부모(슈퍼,상위)클래스로
		// ex) 아이폰은 핸드폰이다 ---> 말이 됨!! 자동으로 형변환이 가능하다! 라는말임
		//		근데, 핸드폰은 아이폰이다 --> 말이 안됨!! 자동으로 형변환 XX
		Phone p1 = new SmartPhone();  //이게 업캐스팅
		
		p1.call();
		// 객체(하위클래스) 내에 모든 필드와 메소드에 접근할 수 있는게 아니라
		// 상위클래스의 필드와 메소드에만 접근이 가능하다.
		p1.message();
		// 오버라이딩 된 메소드에 한해서는 하위클래스가 가지고 있는 메소드를 사용한다.
		
		
		
		// 2) DownCasting
		// : 부모클래스가 자식클래스로 강제형변환
//		SmartPhone sp = (SmartPhone) new Phone(); --> 불가능
		// Phone 설계도만으로는 SmartPhone 객체를 만들 수 없다!
		// : 업캐스팅 된 객체를 다시 본래의 자료형을 강제로 되돌리는 것!!!
		SmartPhone sp1 = (SmartPhone)p1;
		sp1.wifi();
		sp1.message();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
