package ex01일차원배열;

import java.util.Scanner;

public class Ex09배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//팀원 검색 프로그램
		
		String [] team = {"윤상재","남하은","장이수","문경수","구소현"};
		
		// 문제.
		// 키보드로 부터 팀원이름을 입력받아서 일치하는 사람이 존재한다면
		// 남하은은 2번위치에 존재합니다.
		// 일치하지 않는 사람이 존재하지 않는다면
		// "해당 팀원은 존재하지 않습니다."를 한번만 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팀원 이름을 입력해주세요 : ");
		String name = sc.next();
		
		boolean isCheck = true; //isCheck는 사람을 찾았는지 아닌지 판단하는 변수
		
		for (int i = 0 ; i < team.length ; i++) {
			if (name.equals(team [i]) ) {
				System.out.printf("%s는 %d 번 위치에 존재합니다.", name, i+1);
				isCheck = false; //false가 나오면 여기 if문이 출력되도록 함
				break;
			}
			
		}
		if (isCheck) {   //여기서 그냥 isCheck해주면 위에 선언해둔대로 true가 나옴
			System.out.println("해당 없음"); //true가 나오면서 해당없음이 출력되는거임
		}
		
		
		
		
		
	}

}
