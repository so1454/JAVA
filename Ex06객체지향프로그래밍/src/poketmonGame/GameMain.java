package poketmonGame;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 1. 객체 생성(=포켓몬 2마리 생성)
		// 이상해꽃 / 풀 / hp ,1000 / atk, 150 / skill, 덩굴채찍
		// 피카츄 / 전기 / hp, 1000 / atk, 100 / skill, 백만볼트

		Poketmon flower = new Poketmon("이상해꽃", "풀", 1000, 150, "덩굴채찍");
		Poketmon electric = new Poketmon("피카츄", "풀", 1000, 100, "백만볼트");

		// 2. 사용자에게 메뉴 보여주기

		while (true) {
			System.out.println("====공격을 실행할 포켓몬 선택하기====");
			System.out.print("[1] 이상해꽃  [2] 피카츄 >> ");

			int choice = sc.nextInt();

			// 3. 사용자가 입력한 값 구분하기

			if (choice == 1) {
				System.out.println("====공격패턴 선택 ====");
				System.out.print("[1] 일반공격  [2] 스킬공격 >> ");
				int choice2 = sc.nextInt();
				
				if(choice2 == 1 ) {
					//이상해 꽃이 피카츄 일반 공격
//					int result =  electric.getHp() - flower.getAtk();  //이걸이제 간단하게 밑처럼 나타냄
					flower.setHp(electric.getHp() - flower.getAtk());   //바로 이렇게 넣어도 됨
					System.out.println("이상해 풀 공격!");
				}else {
					//스킬공격 본래 공격력의 1.5배 
					// 피카츄 hp = 피카츄 hp - 이상해풀 atk * 1.5
					electric.setHp(electric.getHp() -flower.getAtk() * (int)1.5);
					System.out.println("이상해 풀 스킬 공격!");
					System.out.println(flower.getSkill());
				}
				
				
				
			} else if (choice == 2) {
				System.out.println("====공격패턴 선택 ====");
				System.out.print("[1] 일반공격  [2] 스킬공격 >> ");
				int choice2 = sc.nextInt();
				// 사용자가 피카츄를 선택!
				
				if(choice2 == 1 ) {
					// 피카츄가 이상해꽃 일반 공격
					// 이상해 풀 hp = 이상해풀 hp - 피카츄 atk
					electric.setHp(flower.getHp() - electric.getAtk());   //바로 이렇게 넣어도 됨
					System.out.println("피카츄 공격!");
				}else {
					// 피카츄가 이상해 꽃 스킬 공격
					flower.setHp(flower.getHp() - electric.getAtk() * (int)1.5);
					System.out.println("피카츄 스킬 공격!");
					System.out.println(electric.getSkill());
				}
				
				
				

			} else {
				System.out.println("다시 선택해주세요.");
			}
			
			System.out.println("이상해 풀 체력 : " + flower.getHp());
			System.out.println("피카츄 체력 : " + electric.getHp());
			
			//종료 조건
			//두마리 중에 한마리라도 체력이 0보다 작거나 같은 경우 프로그램 종료
			if(flower.getHp()<=0 || electric.getHp()<=0) {
				break;
			}
			
			
			
		}

	}

}
