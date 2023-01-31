package 결과등록;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		SELECT * FROM VW_SCOREVIEW;
		
		System.out.println("==== 점수 조회 ====");
		
		Connection conn = null;
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
			String user_id = "cgi_3_0131_2";
			String user_pw = "smhrd2";
			 
			conn = DriverManager.getConnection(url, user_id, user_pw);
			
			String sql = "SELECT * FROM VW_SCOREVIEW";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery(sql);
			
			
			// 한개만 출력할때는 if문 여러개 출력시에는 while문 해주기                 
			System.out.printf("%s\t %s\t %n","팀 이름","합산획득점수");
			
			while(rs.next()) { // 커서를 한줄 내림 하나씩 내리면서 id, name, pw를 출력해준다는 말
				
				String teamN = rs.getString("TEAMNAME");
				String Fscore = rs.getString("FINALSCORE");
			
				System.out.printf("%s\t %s\t%n",teamN,Fscore);
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
