package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 회원 탈퇴 가능
		// 아이디와 비밀번호가 일치하는 경우에만 회원 탈퇴 할 수 있게

//		delete from big_member where id = ? and pw = ? ;

		// 1. id, pw, 을 입력을 받고!
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원 탈퇴 ====");
		System.out.print("현재 ID 입력 : ");
		String id = sc.next();

		System.out.print("현재 PW 입력 : ");
		String pw = sc.next();

		// 2. 회원의(입력받은 정보를 토대로) 탈퇴

		PreparedStatement psmt = null; // 준비된상태의 psmt
		Connection conn = null;
//		ResultSet rs = null;
		try {
				
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어차피 오라클 db가져올꺼니까 그대로 가져와도됨

//			3) DB연결 통로 생성 // join에서 쓴거 그대로 가져옴(어차피 내 컴터에서 가져올꺼니까) - jdbc가 원래 복붙잘하는 사람들이 잘함
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);
			
//			sql문 준비
			String sql = "delete from big_member where id = ? and pw = ?";
			
//			sql문 전송(실행)
			psmt = conn.prepareStatement(sql);
//			 ++ 물음표 채우기	
			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate(); // --> 실행 select문은 execute + Query dml은 execute + Update

			if (row > 0) {
				System.out.println("탈퇴 성공");
			}
//
//			String sqlstr = "select * from big_member";
//			rs = psmt.executeQuery(sqlstr);
//			System.out.printf("%s\t %s\t %s\t%n", "아이디", "이름", "전화번호");
//			while (rs.next()) {
//
//				String id1 = rs.getString(1);
//				String name = rs.getString(2);
//				String tel = rs.getString(3);
//
//				System.out.printf("%s\t %s\t %s\t%n", id1, name, tel);
//			}
	
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
