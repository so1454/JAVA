package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04_SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 모든 회원의 아이디 ,이름 , 전화번호 출력
		// select * from big_member ; <-- 이 sql문으로 가져오게됨
		// 입력받을것은 없음 그냥 전체 회원번호를 출력할꺼임
		// ex. smhrd2 스마트인재개발원 010 1234 5678
		
		System.out.println("==== 회원 조회 ====");
		Connection conn = null;
		PreparedStatement psmt = null; 
//		java.sql.Statement psmt = null; 
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user_id = "hr";
		String user_pw = "hr";
		String sql = "select * from big_member";
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어차피 오라클 db가져올꺼니까 그대로 가져와도됨

			conn = DriverManager.getConnection(url, user_id, user_pw);

//			psmt = conn.createStatement();
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery(sql);
			
			
			// 한개만 출력할때는 if문 여러개 출력시에는 while문 해주기                 
			System.out.printf("%s\t %s\t %s\t%n","아이디","이름","전화번호");
			
			while(rs.next()) { // 커서를 한줄 내림 하나씩 내리면서 id, name, pw를 출력해준다는 말
//				
//				String id = rs.getString(1);
//				String pw = rs.getString(2);
//				String uname = rs.getString("name");
//				String utel = rs.getString("tel");
//				
//				System.out.println(" ");
				
				String id = rs.getString("id");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
			
				System.out.printf("%s\t %s\t %s\t%n",id,name,tel);
			}


		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				if( rs != null) 
					rs.close();
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
