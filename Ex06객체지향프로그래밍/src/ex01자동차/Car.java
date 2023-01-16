package ex01자동차;

public class Car { //설계만 할꺼라서 main필요 X

//	 객체를 만들기 위해서는 class(설계도)가 먼저 있어야한다.
//	 class안에는 필드와 메소드로 나뉜다
//	 자동차
//	 field (속성)
//	 - 핸들의 모양 String
//	 - 브레이크 유무 boolean
//	 - 엑셀 유무 boolean
//	 - 문의 개수 int
//	 - 바퀴의 개수 int 
//
//	 Method(기능)
//	 - 멈춰야한다.
//	 - 굴러서 앞으로 가야한다.
//	 - 덜 찌그러져야한다 (차 안의 사람을 지켜야한다.)
//	 - 기어를 전환한다.
//	 - 자동으로 주차한다.
	
//	-------------------------------------------------------
	//필드 - 데이터를 저장하는 공간(변수)
	
	int doorCnt; 	// 문의 개수 
//					-->여기서 4라고 명시하는 순간 모든 차의 문의 개수가 4개로 고정되니까
//							이대로 두는것임 다른 것들도 마찬가지
	int wheelCnt; 	// 바퀴 개수
	boolean isBrake; // 브레이크 유무 
//		--> boolean의 경우 변수명에 is가 항상 붙음 걍 약속임
	boolean isExel;	// 엑셀의 유무
	String handle;	// 핸들의 모양
	
//	-------------------------------------------------------
	//메소드 - 객체가 할 행위
	
	//시동걸기
	public void startUp() {
		System.out.println("부아아ㅏㅇㅇ");
	}
	//달리다
	public void run() {
		System.out.println("우우웅ㅇ~~ 달려달려~!!");
	}
	//브레이크를 건다
	public void brake() {
		System.out.println("끼이이이익");
	}
	// 기어 변환
	public void gearChange() {
		System.out.println("기어를 변환합니다!");
	}
	//자동주차
	public void automaticParking() {
		System.out.println("자동주차중~");
	}
	
	
}
