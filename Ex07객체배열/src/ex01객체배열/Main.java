package ex01객체배열;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 객체 배열 생성
		// 자료형[] 배열 이름 = new 자료형[배열의 크기];
		// 포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성
		Poketmon[] bag = new Poketmon[3];
		// 객체 배열 0번 인덱스에 있는 데이터 출력
		System.out.println(bag[0]); // 이렇게 하면 주소출력됨 
		
		// 객체 배열 0번 인덱스에 포켓몬을 넣어보자!
		// 이름 : 피카츄 / 스킬 : 백만볼트 / hp : 1000
		// atk : 100 / 타입 : 전기 / 

//		1) 객체 생성하기
		
//		Poketmon pika = new Poketmon ("피카츄", "백만볼트", 1000, 100, "전기");
//		bag[0] = pika;
//		이 위를 간단하게
		bag[0] = new Poketmon("피카츄", "전기", 1000, 100, "백만볼트");
		System.out.println(bag[0]);
		System.out.println(bag[0].getName());  // bag의 [0] 자체가 객체가 되어서 . 치고 불러올 수 있음
		
		// 1번 인덱스 >> 파이리/ 불 / 1000 / 120 / 불꽃발사
		bag[1] = new Poketmon("파이리", "불", 1000, 120, "불꽃발사");
		// 2번 인덱스 >> 꼬부기 / 물 / 1000 / 130 / 물대포
		bag[2] = new Poketmon("꼬부기", "물", 1000, 130, "물대포");
		
		System.out.println("==== 포켓몬 정보출력 ====");
//		System.out.println(bag[0].getName() + " \t" + bag[0].getType()+ " \t"+ bag[0].getHp());
//		System.out.println(bag[1].getName() + " \t" + bag[1].getType()+ " \t"+ bag[1].getHp());
//		System.out.println(bag[2].getName() + " \t" + bag[2].getType()+ " \t"+ bag[2].getHp());
//		
		// 짧게
		for(int i = 0 ; i < bag.length ; i++) {
			System.out.println(bag[i].getName() + "\t" + bag[i].getType()+ "\t"+ bag[i].getHp());
		}
		 
		System.out.println("");
		// for-each문
		// 크기를 정하지 않아도 자동으로 bag이 가지고 있는 크기를 넣어서 실행시킨다.
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용한다.
		//동작원리
		// 배열안에 저장되어있는 데이터를 for문에서 순차적으로 꺼내서 
		// : 기준으로 좌측에 있는 변수에 담아 중괄호안의 실행문을 실행시킨다.
		for(Poketmon p : bag ) {  	// 여기서 p에 bag[i]가 담긴거니까 bag[i]부분을 p로 바꾼다.
			System.out.println(p.getName() + "\t" + p.getType()+ "\t"+ p.getHp());
		}
		
		
		
	}

}
