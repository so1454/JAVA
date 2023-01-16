package ex01메소드;

import java.util.Random;

public class Ex02다양한메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다양한 메소드 만들기
		//1. 매개변수도 있고(O) 리턴타입도 있는(O) 경우 - 주스만들기
		String result1 = makeJuice("딸기"); //1.
		System.out.println(result1);
		
		System.out.println(makeJuice("키위")); //2.
		
		//2. 매개변수는 있고(O) 리턴타입은 없는(X) 경우 - 옷 정리하기
		clothes("후드티"); //메소드에 출력문 해뒀으니까
		clothes("코트");
		
		//3. 매개변수는 없고(X) 리턴타입도 있는(O) 경우 - 랜덤 과자 얻기
		System.out.println("오늘의 간식은? " + randomSnack());
		
		//4. 매개변수도 없고(X) 리턴타입도 없는(X) 경우 - 다양한 인사
		hello();
		
	}
	//1.
	public static String makeJuice(String fruit) { 
		
		String result = "맛있는 " + fruit + "주스입니다!" ;
		return result;
		
		//return "맛있는 " + fruit + "주스입니다!"
		//이렇게 써도 된다
		
	} //메소드는 이렇게 따로 써줄 수도 있다!
	
	//2.
	public static void clothes(String goods) {  //void는 return할거 없을떄 사용
		System.out.println(goods+ " 잘 정리하겠습니다!! ㅠㅠ ");
	}
	//3.
	public static String randomSnack() {
		
		String[] snacks = {"초코송이" , "콘칩","썬칩","포카칩","포키"};
		
		Random r = new Random();
		
		return snacks[r.nextInt(snacks.length)] ;//snacks라는 배열안에 랜덤 숫자를 불러옴
								//랜덤 수는 배열이 0~4까지 수로 움직이니까 5개의 랜덤 수 
	}
	//4.
	public static void hello() {
		
		System.out.println("에이치 아이~,Hi, 굿모닝,봉쥬르");
		
		return; //여기서는 메소드가 끝나는 시점을 말해준거임
	}
	//return이라는 키워드는 우측에 있는 데이터를 돌려주기도 하지만
	//메소드가 끝나는 시점을 의미하기도 한다. break처럼 쓰임
	
	
	
	
	

}
