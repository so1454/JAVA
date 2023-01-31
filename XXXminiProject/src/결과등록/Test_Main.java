package 결과등록;

import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Result_DAO tdao = new Try_Result_DAO();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("학생 아이디 입력 >> \t");
		String StuId = sc.next();
		
		System.out.print("문제 번호 입력 >> \t");
		int QueId = sc.nextInt();
		
		System.out.print("성공여부 입력(O,X) >> \t");
		String isSuccess = sc.next();
		
		System.out.print("획득 점수를 입력 >>  \t");
		int getScore = sc.nextInt();

		Try_Result_DTO tdto = new Try_Result_DTO(StuId,QueId,isSuccess,getScore);  // 이렇게 담아줘도 set으로 담기나봄
		
		
		int row = tdao.Tryreult(tdto);
		
//		if(){//학생 무결성
//				// 학생테이블을 선언해주고 거기 데이터를 메소드로 arraylist에 담아서
//		              							가져와서 비교해주면 될듯)
//			System.out.println("학생이 없습니다.");
//		}
		
		
		if(tdto.getQueId() > 37) { //문제 무결성
			System.out.println("문제가 없습니다.");
		}
		
		
		if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
			System.out.println("결과등록 성공");
		} else {
			System.out.println("결과등록 실패");
		}
		
		
		
		
		
	}

}
