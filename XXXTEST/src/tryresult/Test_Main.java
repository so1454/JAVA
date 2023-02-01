package tryresult;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Result_DAO tdao = new Try_Result_DAO();

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 아이디 입력 >> ");
		String StuId = sc.next();
		///////////////////////

		tdao.notNum(StuId);

		///////////////////////

		System.out.print("문제 번호 입력 >> "); // 성공하면 문제와 그에 따른 획득점수 불러오기
		String QueId = sc.next();

		///////////////////////

		tdao.notNum2(QueId);

		///////////////////////

		System.out.print("성공여부 입력(O,X) >> "); // 만약 성공을 했따고 ㅏ하면
		String isSuccess = sc.next();


		
		Try_Result_DTO tdto = new Try_Result_DTO(StuId, QueId, isSuccess,isSuccess); // 이렇게 담아줘도 set으로 담기나봄

		
		int row = tdao.Tryreult(tdto);
		
		

		if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
			System.out.println("결과등록 성공");
		} else {
			System.out.println("결과등록 실패");
		}

	}

}
