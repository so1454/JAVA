package ex01일차원배열;

import java.util.Scanner;

public class Ex13배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//래퍼런스 변수 생성 시 초기값이 들어간다
		// 정수, 실수 '배열' 경우 초기값이 -> 0 
		// char 배열 초기값이-> 빈칸
		// boolean 배열은 초기값이 -> false
		// 레퍼런스(String) 배열은 초기값이 -> null = 아무 주소도 가지고 있지 않다. 
		
		Scanner sc = new Scanner(System.in);
		//회원가입, 로그인 프로그램
		
		String[] id = new String[3]; // 회원돌의 아이디가 저장될 변수
		String[] pw = new String[3]; // 회원들의 비밀번호가 저장될 변수
		
		//최대로 가입가능한 회원수는 3명
		int cnt = 0;
		while (true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				
				System.out.println("==회원가입 ==");
				System.out.println("아이디 입력 : ");
				String inputId = sc.next();
				System.out.println("패스워드 입력 : ");
				
				String inputPw = sc.next();
				
				
				if(cnt < id.length) {
					id[cnt] = inputId ;
					pw[cnt] = inputPw;
					cnt++;}
				else {
					System.out.println("가입 가능한 회원수를 초과했습니다.");
				}
					
				
				
				//문제. 입력받은 아이디와 비밀번호를 위의 배열안에 넣어
				//		회원가입을 시키시오
				//		단. 최대 회원가입 가능한 수는 3명입니다. 
				//		힌트. 현재 회원이 몇명 가입 되어있는지 알 수 있는 변수가 필요하다.
				
				
			}else if (choice == 2) {
				
				System.out.println("==로그인 ==");
				System.out.println("아이디 입력 : ");
				String inputId = sc.next();
				System.out.println("패스워드 입력 : ");
				String inputPw = sc.next();
				
				boolean isCheck = true; //이부분 이해가 안감
				
				for(int i = 0 ; i < cnt ; i++) { // cnt는 앞에서 얼만큼 회원가입을했는지 아는 변수니까(그만큼만 돌려볼꺼다)
					
					if (id[i].equals(inputId) && pw[i].equals(inputPw) ) { //id[i].equals(inputId) && pw[i].equals(inputPw)
						System.out.println("로그인에 성공했습니다.");
						isCheck = false ; //이부분 이해가 안감 
					}
						
					if(isCheck) {
						System.out.println("로그인 실패");
					}
					
					
				}
				
				
				
				
			}else if (choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
