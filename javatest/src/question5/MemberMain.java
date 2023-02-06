package question5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		ArrayList<MemberDTO> listDTO = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("======SMHRD 회원관리 프로그램======");

			System.out.println("[1] 회원가입 [2] 로그인 [3] 전체회원목록 [4]회원정보 수정 [5] 종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("ID 입력 : ");
				String id = sc.next();

				System.out.print("PW 입력 : ");
				String pw = sc.next();

				System.out.print("NICK 입력 : ");
				String nick = sc.next();

				dao.join(id, pw, nick);
				int row = dao.join(id, pw, nick);

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

				dto = dao.login(id, pw);


				if (dto != null) {
					System.out.println("로그인 성공!");
					System.out.println(dto.getNick() + "님 환영합니다~");

				} else {
					System.out.println("로그인 실패..");
				}

			} else if (choice == 3) {

				System.out.println("==== 회원 조회 ====");
				System.out.printf("%s\t %s\t %s\t%n", "아이디", "이름", "전화번호");

				listDTO = dao.selectAll();

				String id, pw, nick;
				for (int i = 0; i < listDTO.size(); i++) {

					id = listDTO.get(i).getId();
					pw = listDTO.get(i).getPw();
					nick = listDTO.get(i).getNick();

					System.out.printf("%s\t%s\t%s%n", id, pw, nick);
				}
				
			} else if (choice == 4) {
				
				System.out.println("==== 회원 수정 ====");
				System.out.print("현재 ID 입력 : ");
				String id = sc.next();

				System.out.print("현재 PW 입력 : ");
				String pw = sc.next();
				

				System.out.print("수정 이름 입력 : ");
				String nick = sc.next();


				dto = new MemberDTO(id,pw,nick);  
				int row = dao.update(dto);
				
				if (row > 0) { 
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패 ㅜ.ㅜ ");
				}

			} else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("정확한 값을 입력해주세요");
			}

		} while (true);

	}

}
