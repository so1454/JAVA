package 객체형변환;

public class SmartPhone extends Phone {
	// 자식 클래스, 서브클래스

	// 새로운 메소드
	public void wifi() {
		System.out.println("인터넷 연결~");
	}

	// 메소드 오버라이딩
	@Override // annotation(=주석문)
	public void message() {
		System.out.println("카카오톡 메세지 보내기!");
	}

}
