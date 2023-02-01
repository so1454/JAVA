package tryresult;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int getScore = 0;
//		System.out.print("획득 점수 >> " + getScore); // 이부분을 굳이 입력받지 않고 불러주는거지
		Scanner sc = new Scanner(System.in);
		ArrayList<QuestionDTO> Qidlist = new ArrayList<QuestionDTO>();

		QuestionDAO qdao = new QuestionDAO();

		Qidlist = qdao.SelectALL();

		System.out.print("성공여부 입력(O,X) >> "); // 만약 성공을 했따고 ㅏ하면
		String isSuccess = sc.next();

		
		
		
		
		
		String[] array = new String[Qidlist.size()];

		for (int i = 0; i < Qidlist.size(); i++) { // 일단 아이디 등록된거 다 불러오는건 성공함
			array[i] = Qidlist.get(i).getQUESTIONID();

		}
		
		
		
		
		

		String[] array2 = new String[Qidlist.size()];

		for (int i = 0; i < Qidlist.size(); i++) {
			array2[i] = Qidlist.get(i).getQSCORE();

		}
		
		
		
		
		
		
		
		
		
		

		if (isSuccess == "O") {

			for (int i = 0; i < Qidlist.size(); i++) {
				if (array[i].equals(array2[i])) {
					System.out.println("획득 점수 >> " + array2[i]);
				}
			}

		} else if (isSuccess == "X") {
			System.out.println("획득점수 >> 0점");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
