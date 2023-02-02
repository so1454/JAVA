package tryresult;

import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Result_DAO tdao = new Try_Result_DAO();
		Try_Result_DTO tdto = new Try_Result_DTO();
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

		System.out.print("정답여부 입력(O,X) >> "); // 만약 성공을 했따고 ㅏ하면
		String isSuccess = sc.next();
		if( isSuccess.equals("O") || isSuccess.equals("o") ) {
			
			tdto = new Try_Result_DTO(StuId, QueId, isSuccess,""); // 이렇게 담아줘도 set으로 담기나봄
			
			System.out.println("해당 문제의 배점 >> " + tdao.getScroeFromQid(QueId));
			
			
			tdao.Tryreult(tdto);
			
			System.out.println("정답으로 등록 완료");
			
		}else if (isSuccess.equals("X") || isSuccess.equals("x")) {
			
			tdto = new Try_Result_DTO(StuId, QueId, isSuccess,"");
			tdao.Tryreult2(tdto);
			
			System.out.println("오답으로 등록완료");
		}
		
		
		
		
		


	}

}
