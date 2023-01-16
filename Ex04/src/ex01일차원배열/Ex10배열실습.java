package ex01일차원배열;

import java.util.Random;
import java.util.Scanner;

public class Ex10배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		// 아침, 점심, 저녁 메뉴 랜덤 뽑기
		String[] breakfast = { "밥", "계란", "샌드위치", "두유", "카레" };  //각 문자들이 0,1,2,3,4 이렇게 숫자가 지정되어있다고 생각하면됨
		String[] lunch = { "떡갈비", "애호박찌개", "짜글이", "뭉티기", "비빔밥" };
		String[] dinner = { "햄버거", "스테이크", "치킨", "부대찌개", "닭감자탕" };

		while (true) {

			System.out.println("식사를 선택해주세요 : ");
			System.out.print(" 1.아침 2.점심 3.저녁 4.종료 >> ");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====오늘의 추천 아침 메뉴====");
//				int num = rn.nextInt(5);   //0~4까지 알아서 뽑음--왜 이걸 생각을 못하니 나는..? 각 지정되어있는 숫자를 하나씩 뽑는다
				int num = rn.nextInt(breakfast.length);   //위랑 같은건데 다르게 짧게 바꿔줄 수 있다.
				
				String menu = breakfast[num]; //위의 랜덤으로 지정한 숫자를 breakfast에서 출력해준다는 거임 
//				String menu = breakfast[ rn.nextInt(breakfast.length)]; //위의 num변수도 없애고 그대로 넣어줄 수도 있음 //짧게 변형한거
				System.out.println("오늘 아침 메뉴는 "+ menu+ "어떤가요?");
				break;
			} else if (choice == 2) {
				System.out.println("====오늘의 추천 점심 메뉴====");
				int num = rn.nextInt(5);//0~4까지 알아서 뽑음
				String menu = lunch[num];
				System.out.println("오늘 아침 메뉴는 "+ menu+ "어떤가요?");
				break;
			} else if (choice == 3) {
				System.out.println("====오늘의 추천 저녁 메뉴====");
				int num = rn.nextInt(5);//0~4까지 알아서 뽑음
				String menu = dinner[num];
				System.out.println("오늘 아침 메뉴는 "+ menu+ "어떤가요?");
				break;
			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

		
		
		
		
		
		
		
		
		
	}

}
