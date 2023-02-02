package 결과등록;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문제 번호 입력 >> ");
		int QueId = sc.nextInt();
//		
//		ArrayList<StudentMemberDTO> Sidlist = new ArrayList<StudentMemberDTO>();
//		StudentMemberDAO sdao = new StudentMemberDAO();
//		Sidlist = sdao.StudentSelectall();
//		
//		String[] array = new String [Sidlist.size()];
//		
//		for (int i = 0; i < Sidlist.size(); i++) { // 일단 아이디 등록된거 다 불러오는건 성공함
//			array[i] = Sidlist.get(i).getSTUDENTID();
//		}
//		
//		ArrayList<String> slist = new ArrayList<>(Arrays.asList(array));
//		
//		
//		if(!slist.contains(StuId)) {
//			System.out.println("없음");
//		}
		
		
		
		
		ArrayList<QuestionDTO> Qidlist = new ArrayList<QuestionDTO>();
		QuestionDAO qdao = new QuestionDAO();
		
		Qidlist = qdao.SelectALL();
		
		String [] array = new String [Qidlist.size()];
		
		for (int i = 0; i < Qidlist.size(); i++) { // 일단 아이디 등록된거 다 불러오는건 성공함
			array[i] = Qidlist.get(i).getQUESTIONID();
		}
		
		ArrayList<String> slist = new ArrayList<>(Arrays.asList(array));
		
		
		if(!slist.contains(QueId)) {
			System.out.println("없는 번호 입력");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
