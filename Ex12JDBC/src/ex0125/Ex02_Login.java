package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조인 클래스랑 같은 결의 jDBC(db에 저장하도록 연결해주는)작업임
		// 로그인 프로그램

		System.out.println("==== 회원 로그인 ====");
		// 1. id , pw 입력받기
		Scanner sc = new Scanner(System.in); // 스캐너라는 객체 생성

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		// 2. id, pw가 DB에 저장된 정보와 일치하는지 체크
		
		
			////////////////여기까지는 동일함
		
//			1) try - catch 구문 
		Connection conn = null; // 지역변수가 아니게끔 만들어줌
		PreparedStatement psmt = null; // 준비된상태의 psmt
		ResultSet rs = null; // 얘도 닫아줘야해서 위로뺌 Select문을 실행할 때 사용
		
		try { // (try하고 자동완성하면 바로 만들어짐)

//			2) driver(일꾼) 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어차피 오라클 db가져올꺼니까 그대로 가져와도됨

//			3) DB연결 통로 생성 // join에서 쓴거 그대로 가져옴(어차피 내 컴터에서 가져올꺼니까) - jdbc가 원래 복붙잘하는 사람들이 잘함
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);
			
			////////////////여기까지는 동일함

//			4) SQL문 준비 // sql문만 잘쓰면 java코딩 로직이 간단해질 수 있대요!
			String sql = "select * from big_member where id =? and pw =? "; // 모든 bigmember라는 테이블을 조회할꺼다. 
														// 근데 이제 조건이 id,pw가 같은 사람만 조회할꺼다.
			

//			5) SQL문 실행 준비상태 만들기
			psmt = conn.prepareStatement(sql);
//			psmt.setString(열번호 몇번째,? 값);
			psmt.setString(1,id); // 첫 번째 물음표는 id
			psmt.setString(2,pw); // 두 번째 물음표는 pw

//			6) 실행
			// excuteUpdate() : DML(insert,delete, update)  		// 얘는 따로 닫아줄 필요 없었는데
//								--> 결과가 몇 행 변경 일어났는가(join에서는 insert를 해서 이걸씀)
			
			// executeQuery() : Select문을 실행할 때 사용
			//					ResultSet 타입으로 리턴! 나중에 close해줘야하는 객체임
			rs = psmt.executeQuery(); // 여기서 rs는 ResultSet타입
			
//			7) 결과를 통합 작업처리
			// ResultSet은 행을 가리키는 커서를 가지고 있다.
			// 처음에는 열 이름을 가리킨다. (id, pw, name, tel 같은 열이름을 가리킴)
			
			// rs.next() : 커서를 밑으로 한줄 내림
			// 				해당하는 행에 데이터가 있으면 true / 없으면 false를 리턴
			
			// 만약에 커서를 한칸 내렸을때, 데이터 있음 == 로그인 성공
			//						데이터 있음 == 로그인 실패
		
			if(rs.next() == true ) {  
					// 해당행에 데이터가 채워져 있는게 확인되면 로그인 성공 
				System.out.println("로그인 성공!");
				
				// 커서가 가리키고 있는 행에서 데이터 꺼내기
				// rs.get...(int) : 왼쪽부터 몇번째 열에서 데이터를 꺼낼 것인지
				// -1. rs.getString string타입을 가져올꺼다(int, double.. 타입변환가능)
				String uid = rs.getString(1); 
				String upw = rs.getString(2);
				
				// -2. rs.get...("컬럼이름") : 컬럼이름을 이용해서 직접 꺼내는 방법
				String uname = rs.getString("name"); // 이 컬럼이름이 틀리면 안가져와짐
				String utel = rs.getString("tel");
				// 이렇게 두가지 방법으로 꺼내올 수 있다.
				// 더 편한거로 써라
				
				System.out.println(uname +"님 환영합니다~");
			}else {  
					// 없으면 로그인 실패
				System.out.println("로그인 실패..");
			}
			

		} catch (Exception e) {
			e.printStackTrace(); // e.(catch문에 있는 이름) 치면 자동완성으로 나오는데 // 에러를 콘솔창에 출력해줌(무슨 에러가 어디서 어떻게 났는지를 알려줌)
		} finally {// 닫아주는 과정(가장 마지막)

			try {
				if(rs != null) 
					rs.close();
				if(psmt != null) 
					psmt.close();
				if(rs != null) 
					conn.close();

				// 8) 사용했던 객체를 닫기(나중에 만들어진 것부터)

			} catch (Exception e2) { // <<<-- 요기
				e2.printStackTrace(); // e2(catch문에 있는 이름)

			}

		}

	}

}
