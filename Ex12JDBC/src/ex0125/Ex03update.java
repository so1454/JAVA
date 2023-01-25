package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 항상 주석으로 sql문을 써보고 진행해보기!

		// 회원 정보를 수정하는 기능

		// 1. id, pw, name, tel을 입력을 받고!
		Scanner sc = new Scanner(System.in);
		
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

		PreparedStatement psmt = null; // 준비된상태의 psmt
		Connection conn = null;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어차피 오라클 db가져올꺼니까 그대로 가져와도됨

//			3) DB연결 통로 생성 // join에서 쓴거 그대로 가져옴(어차피 내 컴터에서 가져올꺼니까) - jdbc가 원래 복붙잘하는 사람들이 잘함
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			
			String sql = "Update big_member set name = ?,tel =? where id =? and pw =?";
//			update table명
//			   set col1 = val01,
//			       col2 = val02,
//			       col3 = val03
//			 where 조건식  ;
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setString(2, tel);
			psmt.setString(3, id);
			psmt.setString(4, pw);
			
//			psmt.setString(5, id1); // -->set+자료형 (데이터를 수정받아 채움)
//			psmt.setString(6, pw1);
			
			int row = psmt.executeUpdate();

			if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패 ㅜ.ㅜ ");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
