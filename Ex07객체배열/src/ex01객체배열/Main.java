package ex01객체배열;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 객체 배열 생성
		// 자료형[] 배열 이름 = new 자료형[배열의 크기];
		// 포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성
		Poketmon[] bag = new Poketmon[3];
		// 객체 배열 0번 인덱스에 있는 데이터 출력
		System.out.println(bag[0]);
		
		// 객체 배열 0번 인덱스에 포켓몬을 넣어보자!
		// 이름 : 피카츄 / 스킬 : 백만볼트 / hp : 1000
		// atk : 100 / 타입 : 전기 / 
		
//		Poketmon pika = new Poketmon("피카츄", "백만볼트", 1000, 100, "전기");
		
		bag[0] = new Poketmon("피카츄", "백만볼트", 1000, 100, "전기");
		
		
		
	}

}
