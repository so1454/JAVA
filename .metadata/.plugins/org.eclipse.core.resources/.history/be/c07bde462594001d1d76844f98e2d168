package ex02do_while문;

import java.util.Scanner;

public class Ex02로그인프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while로 만들었던 로그인 프로그램으
		//do-while로 변경해서 작성하시오.
		
		String loginId = "som";
		String loginPw = "1234";
		
		System.out.println("----로그인 프로그램-----");
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			
			if (loginId.equals(id) && loginPw.equals(pw)) {
			System.out.println("로그인 성공");
			break;
			
			}else {
				System.out.println("로그인 실패..");
			}
		} while (true);

	}

}
