package arrayList기초;

import java.util.ArrayList;

public class ex02PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 1. Person 자료형을 보관할 수 있는 pList라는 이름을 가진 ArrayList생성하기
//		ArrayList<데이터 타입> = new  ArrayList<데이터타입>();
		// -->여기서 데이터 타입에 내가 정의한 설계도(Person)가 들어갈 수 있음
		
//									--> ArrayList는 생성자이다.
		ArrayList<Person> pList = new ArrayList<Person>();
		// --> person자료형을 보관하는 친구
		
		// 2. 데이터 추가하기(팀원 데이터 추가하기)
//		Person p1  = new Person("구소현",26); --> Person자료형 생성자가 여기 없으니까 먼저 만들어줌
//		pList.add(p1); 
		
		pList.add(new Person("구소현",20));
		pList.add(new Person("윤상재",20));
		pList.add(new Person("남하은",20));
		pList.add(new Person("장이수",20));
		pList.add(new Person("문경수",20));  //생성자를 만들어둬서 이렇게 바로 출력됨

		// 3. 팀원 이름 출력하기!
//		System.out.println(pList.get(2).getName());// get으로 가지고온건 객체이다. 	
//										-->	그래서 get을 통해서만 가져올 수 있기때문에 요러케 쓴다.
		
		// 4. 팀원 이름, 나이 전부 출력하기
		for(int i = 0; i<5 ; i++) {
			System.out.println(pList.get(i).getName() + " " + pList.get(i).getAge());
		}
		
		
		for(Person p1 : pList) {
			System.out.println(p1.getName()+ "\t" + p1.getAge());
		}				//	p1이 구소현이라는 객체임 그걸 getName 해달라는 것
		
		
		
		
	}

}
