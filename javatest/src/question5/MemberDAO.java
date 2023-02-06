package question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	MemberDTO dto = new MemberDTO();
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int row = 0;
	
	public void getConn() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void close() {
		
		try {
			if (rs != null)
				rs.close(); 
							
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
	public int join(String id, String pw, String nick) {
		// TODO Auto-generated method stub
		try {
		getConn();
		
		String sql = "insert into big_member values(?,?,?)";

		psmt = conn.prepareStatement(sql);

		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, nick);

		row = psmt.executeUpdate(); 

	} catch (Exception e) {

		e.printStackTrace();
	} finally {
		
		close(); 

	}

	return row;
		
		
		
	}
	public MemberDTO login(String id, String pw) {
		// TODO Auto-generated method stub
		
		try {


			getConn(); 

			String sql = "select * from big_member where id =? and pw =? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery(); 

			if (rs.next() == true) {

				String uid = rs.getString(1);
				String upw = rs.getString(2);

				String unick = rs.getString("nick");

				dto = new MemberDTO(uid, upw, unick);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			close(); 
		}

		return dto;

	}
	
	public ArrayList<MemberDTO> selectAll() {


		ArrayList<MemberDTO> dtolist = new ArrayList();

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user_id = "hr";
		String user_pw = "hr";
		String sql = "select * from big_member";

		try {

			getConn();

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(sql);

			while (rs.next()) {

				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");

				dto = new MemberDTO(id, pw, nick);
				dtolist.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			close();
		}
		return dtolist;

	}
	public int update(MemberDTO dto2) {
		// TODO Auto-generated method stub
		
		
		try {

			getConn(); 

			String sql = "Update big_member set nick = ? where id =? and pw =?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getNick());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());
			
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			close(); 
		}

		return row;

	}
	
	
	
}
