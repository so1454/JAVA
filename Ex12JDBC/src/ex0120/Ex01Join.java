package ex0120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오라클 db 먼저 레퍼런스로 받기 (javaproject에 가져와야됨 - buildpath - oracle파일 가져오기)
		// 그래야 가지고올 수 있음
		
		System.out.println("==== 회원 가입 ====");
		
		// 아이디, 비밀, 이름, 전화번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력 : ");
		String id = sc.next();
		
		System.out.println("PW 입력 : ");
		String pw = sc.next();

		System.out.println("이름 입력 : ");
		String name = sc.next();

		System.out.println("Tel 입력 : ");
		String tel = sc.next();

		// JDBC

		// ++ 런타입 오류(에러) : 실행 중 발생하는 에러(문법문제는 없음)--> 실행할때 오류가 날 수 있으니 미리 예외처리 해주자
		// Syntax error : 문법 자체에 오류가 있는거, 보통 sql.syntax뭐 이런식으로 에러났다고 하면 sql문의 문법을 틀린거임

		// try - catch : 예외처리 구문
		// 예외상황이 발생하더라도 실행을 멈추지 않을 것임(catch문을 실행할꺼임)
		// try 문 안에 있는 코드를 실행(이 코드한번 실행해봐라)
		// 만약에 try실행하다가 예외상황(오류발생 등)이 발생한다면 실행을 멈추고 catch문을 실행

		
		PreparedStatement psmt = null; // 준비된상태의 psmt
		Connection conn = null;
		try {
			// 1. 드라이버 동적로딩(데이터베이스 종류 결정)
			// 동적로딩이란?
			// : 실행하는 순간에 자료형을 결정하는 것
//			Class.forName("쓰려고하는 클래스 이름(대소문자, 맞춤법 정확해야함)")
			// --> 이렇게 치니까 빨간줄떠서 create 누르니까 만들어짐
			Class.forName("oracle.jdbc.driver.OracleDriver");// 레퍼런스의 오라클 드라이버 패키지에서 가져왔다.
//				*클래스이름은 패키지만 다르면 이름은 중복가능 -->그니까 어떤 패키지 안에 어떤 파일인지 지정을 해줘야됨
//														그래서 이 안의 '.'은 ~안의~~이런뜻임
			
			// 2. DB연결 통로를 열어주는 작업 (레퍼런스로 받고 동적로딩을 한 db의 통로를 열어줄꺼임)
			// --> url, userid, password 필요
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdvc url을 담기위해 선언 
//					(오라클(oracle)로 내 컴퓨터(localhost)로 들어갈꺼다. 1521번 문으로 들어갈꺼다. xe는 데이터베이스의 이름)
//									다른 사람꺼 들어갈때 localhost만 다른사람이름으로 바꾸면 다른사람꺼로 들어가기 가능
			String user_id = "hr";		// 아무한테나 다 접속할 수 있도록 할것이 아니니까
			String user_pw = "hr";
			
//			Connection conn = DriverManager.getConnection(url, user_id, user_pw);//지역변수라서 밖으로 꺼내줘야 finally에서 사용가능
			conn = DriverManager.getConnection(url, user_id, user_pw);// -->커넥션: Db에 연결하는 객체가 커넥션!!
			// 뒤가 주소만 출력하는 객체라서 conn에 담아서 출력시키려고함 //△△△주소만 출력하는 객체이다!

			// 3. sql문 준비(Sql developer들어가기)
			// 회원가입 >> big_member 테이블 데이터 추가
			// insert구문
			String sql = "insert into big_member values(?,?,?,?)";// 물음표를 넣어서 정보가 들어갈 곳을 정함
			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기

			// 4. sql문 전송(실행)
//			PreparedStatement psmt = conn.prepareStatement(sql); //지역변수라서 밖으로 꺼내줘야 finally에서 사용가능
			psmt = conn.prepareStatement(sql); // 준비된 psmt에 sql실행전 준비(prepare)하는 것을 담아줄꺼다.
			// --> 전송하기 전에 sql문을 담아서 전송할 수 있는 형식으로 변경

			// 먼저 ?인자 채우는 작업 진행(!! 반드시 실행 전에 진행할 것!!)
			// 데이터 바인딩(data binding)작업
//			 psmt.setString(?의 몇번째를 채울꺼야?, 어떤 데이터를 채울꺼야?);
			psmt.setString(1, id); // -->set+자료형 (데이터를 수정받아 채움)
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);

			// 반드시 물음표 인자를 전부 채워준 후에 실행해야 한다!!
			int row = psmt.executeUpdate(); // 원래 0인데 실행되면 행이 +1씩됨
			// --> 쿼리문을 실행하는거다
			// excuteUpdate() : 실행 메소드 insert, Update, delete DML쿼리문 에만 사용
			// --> 여러가지 insert Update 등의 기능을 수행하면 이 row에 데이터가 담김
			// 			몇줄을 이어갔는지? --> 테이블에 변화를 주는 아이들!

			// 5. 결과를 이용한 작업처리
			// 사용자한테 어떤 결과를 보여줄지 정의
			
			if( row > 0 ) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패 ㅜ.ㅜ ");
			}
			
			
		} catch (Exception e) { // 이렇게 하나만 해줘도 됨
			// 얘네 먼저 정의해주고 위에 try안을 정리해주세요

			e.printStackTrace(); // 예외상황시에 이 코드를 실행시킬꺼다.
		} finally {
			// try까지 하고 마지막에 했음
			// 위에서 예외상황이 발생하더라도 반드시 한번은 들어오는 구간 (예비전력같은거) 왜냐면 꼭 닫아줘야하니까 
			
			// 6. DB 연결 종료 --> 자원반납
			try { // null이 아닐때 // 사용을 했을때만 닫을꺼야(null이 아니면 값이 있다는 말이니까 사용을 했다는뜻)
				if (psmt != null) // psmt가 1행이라도 차있다면!(만들어졌다면) 		// *if문이 한 줄일때 중괄호 없이 가능 
						psmt.close(); //psmf를 닫아준다.	//얘만 해도 빨간줄뜨면 그거 그대로 create하면 만들어짐
				if(conn != null)
						conn.close(); //실행된건 무조건 종료시켜야됨
				// ++** 닫는 순서는 사용한 순서의 반대로 닫아야한다.
				// conn을 먼저 사용하고 psmt를 사용했으니까 psmt를 먼저 닫아줌
			} catch (SQLException e) {
				
				e.printStackTrace();  // 예외 상황이 있다면 이 코드를 실행시켜줄꺼야
			}
		
		
		}
		
	
		// 이렇게 두개로 정의해 줘도 되고!
//		} catch (ClassNotFoundException e) { //클래스가 없을때..?만 관리
//			// 예외상황 발생시 내용을 출력
//			e.printStackTrace();
//		} catch(SQLException e) {  // SQL예외상황만 관리
//			e.printStackTrace();
//		}

	}

}
