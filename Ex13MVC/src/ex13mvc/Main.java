package ex13mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.memberDAO;
import model.memberDTO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 디자인 패턴 : 계속해서 같은 문제가 발생하여, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분
		Scanner sc = new Scanner(System.in);
		System.out.println("====SHRD 회원관리 프로그램 ====");

		// 다른 객체를 불러오는건 다른 클래스에 있는 것만 한다.
		// 원래 같은 클래스에 있는 메소드는 불러주기만 하면되는데
		// 다른 클래스에 있는 객체는 불러오려면 new 로 해서 불러줘야한다
		memberDAO dao = new memberDAO(); // 그래서 불러줌 // 지역변수라 뺴줌
		ArrayList<memberDTO> listDTO = null;

		while (true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 전체회원목록 [4] 회원정보수정 [5] 회원탈퇴 [6] 종료 >> ");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("ID 입력 : ");
				String id = sc.next();

				System.out.print("PW 입력 : ");
				String pw = sc.next();

				System.out.print("이름 입력 : ");
				String name = sc.next();

				System.out.print("Tel 입력 : ");
				String tel = sc.next();

				dao.join(id, pw, name, tel);
				int row = dao.join(id, pw, name, tel);

				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (choice == 2) {

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// 2. id, pw가 DB에 저장된 정보와 일치하는지 체크
				// 로그인 메소드 사용
				memberDTO dto = dao.login(id, pw);

				// 로그인 성공 유무 판단.

				if (dto != null) {
					System.out.println("로그인 성공!");
					System.out.println(dto.getName() + "님 환영합니다~");

				} else {
					System.out.println("로그인 실패..");
				}

			} else if (choice == 3) {
				// 전체 회원 목록
				System.out.println("==== 회원 조회 ====");
				System.out.printf("%s\t %s\t %s\t%n", "아이디", "이름", "전화번호");

				listDTO = dao.selectAll();

				String id, pw, name, tel;
				for (int i = 0; i < listDTO.size(); i++) {

					id = listDTO.get(i).getId();
//					pw = listDTO.get(i).getPw();
					name = listDTO.get(i).getName();
					tel = listDTO.get(i).getTel();

					System.out.printf("%s\t%s\t%s%n", id, name, tel);

				}

			} else if (choice == 4) {
				// 회원정보 수정
				System.out.println("==== 회원 수정 ====");
				System.out.print("현재 ID 입력 : ");
				String id = sc.next();

				System.out.print("현재 PW 입력 : ");
				String pw = sc.next();
				

				System.out.print("수정 이름 입력 : ");
				String name = sc.next();

				System.out.print("수정 Tel 입력 : ");
				String tel = sc.next();

				// 2. 회원의(누구의) pw, name, tel를 수정

				//쌤이한거 // 일단 dot불러주고 DTO에 값을 담음
				memberDTO dto = new memberDTO(id,pw,name,tel);  // 이렇게 담아줘도 set으로 담기나봄
				int row = dao.update(dto); // dto에 담은거 row로 리턴해줄꺼니까
				
//				 내가한거
//				dao.update(name, tel, id, pw);
//				int row = dao.update(name, tel, id, pw);
				
				// 리턴한 row값을 받아서 돌림
				if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패 ㅜ.ㅜ ");
				}
				
				
			} else if (choice == 5) {
				// 회원탈퇴
				
				System.out.println("==== 회원 탈퇴 ====");
				System.out.print("현재 ID 입력 : ");
				String id = sc.next();

				System.out.print("현재 PW 입력 : ");
				String pw = sc.next();
				
				
//				memberDTO dto = new memberDTO(id, pw, "", ""); 이렇게 해야 더 짧겠쥬?
				memberDTO dto = new memberDTO();  // 일단 dto먼저 불러주기
				dto.setId(id); // setId로 담아줌
				dto.setPw(pw);  // 이렇게 세줄로 표현해줘도 된긴한다. // 근데 가시적으로 이게 보기 쉽다.
				
				int row = dao.delete(dto);
				
//				dao.delete(id,pw);
//				int row = dao.delete(id,pw);

				if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
					System.out.println("탈퇴성공");
				} 
				
				
			} else if (choice == 6) {
				// 종료
				System.out.println("종료합니다.");
				break;

			}

		}

	}

}
