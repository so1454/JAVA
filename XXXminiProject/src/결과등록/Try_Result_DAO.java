package 결과등록;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Try_Result_DAO {

	public int Tryreult(Try_Result_DTO Tdto) {

		PreparedStatement psmt = null;
		Connection conn = null;
		int row = 0;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
			String user_id = "cgi_3_0131_2";
			String user_pw = "smhrd2";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "insert into TRYRESULT values(TRID_seq.NEXTVAL,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, Tdto.getStuid());
			psmt.setInt(2, Tdto.getQueId());
			psmt.setString(3, Tdto.getIsSuccess());
			psmt.setInt(4, Tdto.getGetScore());

			row = psmt.executeUpdate();

			

		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return row;

	}

}
