package arrayList기초;

import java.util.ArrayList;

public class ex복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java에서 배열!!
		// 인덱스!!
		// 크기가 정해진다(생성) --> 장점?
//							계산이 빨라진다.
		
//		int[] array;
//		array = new int[5]; 	// 여기서 크기를 정해주는것이다.
								// new는 메모리가 생성된다는 의미
		
		// 자료구조(Data Structure)
		// 배열 : 인덱스를 사용, 첨자를 사용
		
		// arrayList
		// List 인터페이스를 구현받아서 하는 것이다.
		
		// get(object타입으로 리턴함)
		// <> : Generic -> 강한 타입 체크
//		ArrayList<String>  // --> 무조건 타입은 STring이여야한다.라는 걸 강하게 정해둔게 제네릭
		
		//java 1.8이상부터 생성시 타입체크 생략가능          ▼
		ArrayList<String> musicList = new ArrayList<>();
		
//		String name= new String("나예호"); 원래 이렇게 써야하는데
		String name = "나예호";  // 1.1에서 new 생략됨(기니까)

		
		// add(요소), add(index, 요소)
		
		musicList.add("Hype boy");
		musicList.add("Antifragile");
		musicList.add("사건의 지평선");
		musicList.add("Love Dive");
		musicList.add("When I move");
		
		//remove() 하나씩 지우는 명령
//		musicList.remove(3);  // lovedive가 사라지게 되는 명령
		
		//clear() 전부 지우는 명령
//		musicList.clear();
	

		musicList.contains(musicList.get(0).contains("boi"));
		
		
		
		
		
		
		//get(index) 꺼낼때 사용하는 것이다.(게터세터 일때도 get으로 리턴 받았지
//		System.out.println(musicList.get(1));
		
		for (int i = 0 ; i < musicList.size() ; i ++) {
			System.out.println(musicList.get(i));
		}
		
//		System.out.println("clear로 다 지워짐")
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
