package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Try_Result_DAO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		결과 등록 // 문제를 풀고 
//		1. 학생 ID (F) - Student (이건 받아와야하는거)
//		2. 문제 ID (F) - Question (얘도 근데 출력은 시켜야되잖아)
//		3. 성공여부
//		4. 획득점수

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("학생 아이디 입력 >> ");
		String StuId = sc.next();
		
		System.out.print("문제 번호 입력 >> ");
		int QueId = sc.nextInt();
		
		System.out.print("성공여부 입력(O,X) >> ");
		String isSuccess = sc.next();
		
		System.out.print("획득 점수를 입력 >>  ");
		int getScore = sc.nextInt();

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
			
			psmt.setString(1, StuId);
			psmt.setInt(2, QueId);
			psmt.setString(3, isSuccess);
			psmt.setInt(4, getScore);

			row = psmt.executeUpdate();
			

			if( row > 0 ) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
				System.out.println("결과등록 성공");
			}else {
				System.out.println("결과등록 실패");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {// 닫아주는 과정(가장 마지막)

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

				// 8) 사용했던 객체를 닫기(나중에 만들어진 것부터)

			} catch (Exception e2) { // <<<-- 요기
				e2.printStackTrace(); // e2(catch문에 있는 이름)

			}

		}

	}

}
