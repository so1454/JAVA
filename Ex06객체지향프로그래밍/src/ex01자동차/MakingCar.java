package ex01자동차;

public class MakingCar {

	public static void main(String[] args) { //코드 실행할꺼라서 메인 필요
		// TODO Auto-generated method stub

		//우리가 설계한 Car Class에서 Car 객체(Object) 만들기
		Car myCar = new Car();	// 레퍼런스 만들듯이
//			-->여기서 mycar는 Car에서 가지고 있는 모든 것을 가지고 있음
		
		//객체의 필드에 접근하기
		myCar.doorCnt = 2;	//객체에 점을 찍으면 값을 넣어줄 수 있다.
		myCar.wheelCnt = 4;
		myCar.isBrake = true;
		myCar.isExel = true;
		myCar.handle = "동그랗다";
		
		// 객체의 필드값 출력
		System.out.println(myCar.doorCnt); // 객체안의 변수명을 쓰면 그 값이 출력됨
		System.out.println(myCar.isBrake);
		System.out.println(myCar.isExel);
		System.out.println(myCar.wheelCnt);
		System.out.println(myCar.handle);
		
		System.out.println("");
		
		//객체의 메소드 실행 
		myCar.startUp();	//점 뒤에 객체의 이름만 적어도 실행됨
		myCar.run();
		myCar.brake();
		myCar.gearChange();
		myCar.automaticParking();
		
	}

}
