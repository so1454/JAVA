package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberDAO {

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체!
	// DB랑 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성
	// jdbc 로직 보면 보통 SQL쿼리를 실행하고, 실행결과를 리턴받음

	// 회원가입 메소드
	// 보여지는 부분뺴고 가져옴

	// ++ 현진쌤시간에 추가로 중복적인 부분은 밖으로 빼고 따로 정리해줌(더 보기 편해지게)
	// 중복으로 선언되고 있는 변수들을 --> DAO의 필드
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;

	// --------------------------------------------
	// 중복으로 작성되고 있는
	// driver 동적로딩 ~ 연결 생성 --> 메소드로 빼기
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
	// --------------------------------------------
	// 닫는 메소드도 만들어주기
	public void close() {
		
		try {
			if (rs != null)
				rs.close(); // --> 악영향이 없는 코드
							// 어차피 없으면 없는대로 만약에 안들어가는거니까
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
	
	
	public int join(String id, String pw, String name, String tel) {
		int row = 0;
//		PreparedStatement psmt = null;
//		Connection conn = null;

		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			getConn(); // 위에서 만들어준 메서드 아래로 내려줌 위에 주석처리한거를 간단하게 표현한 메소드

			String sql = "insert into big_member values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);

			row = psmt.executeUpdate(); // 결과값이 전부 row에 담겨있음

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			
			close(); // 얘도 너무 중복되니까 하나로 묶어줌
			
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}

		}

		return row;

	}
	////////////////////////////////////////////////////////////////////// 회원가입 끝

	public memberDTO login(String id, String pw) {

//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
		memberDTO dto = null;

		try {

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			getConn(); // 위에서 만들어준 메서드 아래로 내려줌

			String sql = "select * from big_member where id =? and pw =? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery(); // 행 하나하나를 rs에 담아둠

			if (rs.next() == true) {

				String uid = rs.getString(1);
				String upw = rs.getString(2);

				String uname = rs.getString("name");
				String utel = rs.getString("tel");

				// rs 에 담겨있는 데이터를 DTO에 옮겨담기
				dto = new memberDTO(uid, upw, uname, utel);
				// 그럼 행하나하나 담겨있는 rs에 담겨있는 데이터를 DTO에 옮겨 담아줬으니까
				// dto를 리턴해주면됨

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			close(); // 얘도 너무 중복되니까 하나로 묶어줌
		}

		return dto;

	}

	///////////////////////////////////////////////////// 로그인끝
	public ArrayList<memberDTO> selectAll() {

//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;

		ArrayList<memberDTO> dtolist = new ArrayList();
		memberDTO dto = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user_id = "hr";
		String user_pw = "hr";
		String sql = "select * from big_member";

		try {

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			getConn(); // 위에서 만들어준 메서드 아래로 내려줌

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(sql);

			while (rs.next()) {

				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");

				dto = new memberDTO(id, pw, name, tel);
				dtolist.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			close(); // 얘도 너무 중복되니까 하나로 묶어줌
		}
		return dtolist;

	}
	public int update(memberDTO dto1) {

//		PreparedStatement psmt = null; // 준비된상태의 psmt
//		Connection conn = null;
		int row = 0;
		try {

//			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어차피 오라클 db가져올꺼니까 그대로 가져와도됨
//
////			3) DB연결 통로 생성 // join에서 쓴거 그대로 가져옴(어차피 내 컴터에서 가져올꺼니까) - jdbc가 원래 복붙잘하는 사람들이 잘함
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			getConn(); // 위에서 만들어준 메서드 아래로 내려줌

			String sql = "Update big_member set name = ?,tel =? where id =? and pw =?";

			psmt = conn.prepareStatement(sql);
			
			//내가한거
//			psmt.setString(1, name);
//			psmt.setString(2, tel);
//			psmt.setString(3, id);
//			psmt.setString(4, pw);
			
			//왜 굳이.. dto로 받아주는건지...암튼 썜이한거
			psmt.setString(1, dto1.getName());
			psmt.setString(2, dto1.getTel());
			psmt.setString(3, dto1.getId());
			psmt.setString(4, dto1.getPw());
			
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			close(); // 얘도 너무 중복되니까 하나로 묶어줌
		}

		return row;

	}

	///////////////////////////////////////////////////// 업데이트 끝

	public int delete(memberDTO dto3) {
//
//		PreparedStatement psmt = null;
//		Connection conn = null;
		int row = 0;
		try {

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			getConn(); // 위에서 만들어준 메서드 아래로 내려줌

			String sql = "delete from big_member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,dto3.getId());
			psmt.setString(2,dto3.getPw());
			
//			psmt.setString(1, id);
//			psmt.setString(2, pw);
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			close(); // 얘도 너무 중복되니까 하나로 묶어줌
		}

		return row;

	}

}
