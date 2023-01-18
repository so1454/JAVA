package arrayList기초;

import java.util.ArrayList;

public class Ex01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 
		// : 크기가 가변적인 배열과 같은 형태를 가진!! 클래스!!
		
		//collection ( 책 목차에 >> 컬렉션 및 자료구조 )
		// : 특정 자료구조를 클래스화 시킨 것
		// ex. ArrayList, HashMap 등
		
		// 1. ArrayList 생성
		// 레퍼런스 타입의 데이터만 저장할 수 있다. 
		// --> 레퍼런스 타입 : 클래스 , 배열 , 열거형, 인터페이스
		//  구체적으로 Poketmon, Student, Member, String ... 임
		 //늘어났다 줄어들었다하는 가변적인 특성이 있다.
		
		//** 클래스는 대부분 대문자로 시작을 한다. A!
//		ArrayList<데이터 타입> = new  ArrayList<데이터타입>();  --> 데이터 타입에 int는 들어가지 않음
		ArrayList<String> list = new  ArrayList<String>();
//		--> String자료형을 보관하기 위한 친구
		
		// <> : 제네릭 기법  **이해가 어려우면 구글링해보기 or 첫 시간 강의 보기
		// 		--> 객체를 생성하는 순간에 자료형이 결정되는 기법
//		 데이터의 타입(data type)을 일반화한다(generalize)라는 뜻이다.
		
		// 2. 데이터 추가하기
		list.add("떡볶이");  // 0
		list.add("불닭볶음면");  // 1
		list.add("허니콤보");   // 2
		
		// 3. 데이터 특정 위치에 추가하기
		list.add(0, "소곱창");  // --> index 0번에 소곱창이 오게됨
//				index, string	   
//										(그림으로 그려서 에버노트에 정리하기)
		// 4. 데이터 가져오기
		list.get(1); 
//				index
		System.out.println(list.get(1)); //밀려서 떡볶이가 출력됨
		
		// 5. 데이터 삭제
		list.remove(2); // 그럼 불닭이 지워져야함
		System.out.println(list.get(2));  // 불닭이 지워져서 허니콤보가 옴
		
		// 6. 데이터 크기 알아보기
		list.size();
		System.out.println(list.size()); // 위에서 하나 지워서 3나옴
		
		// 7. 데이터 전체 삭제
		
		list.clear();
		
		System.out.println(list.get(0));
		
		
	}

}
