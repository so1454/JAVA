package ex02이차원배열;

public class Ex03역으로넣고출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  [][] array = new int [5][5];
		
		// 역순으로 출력시키기
		//25 24 23 22 21 
		//30 29 28 27 26 이 순서로
		//35 34 33 32 31
		//40 39 38 37 36
		//45 44 43 42 41
		// 복습 했나용 1.
//		
//		array [0][0] = 25;
//		array [0][1] = 24;
//		array [0][2] = 23;
//		array [0][3] = 22;
//		array [0][4] = 21;
//		
//		array [1][0] = 30;
//		array [1][1] = 29;
//		array [1][2] = 28;
//		array [1][2] = 27;
//		array [1][2] = 26;
//		
//		array [2][0] = 35;
//		array [2][1] = 34;
//		array [2][2] = 33;
//		array [2][2] = 32;
//		array [2][2] = 31;
				
		int cnt = 21; 
		
		for(int j = 0 ; j<5 ; j ++) {
			for(int i = 4; i >= 0 ; i -- ) {
				array[j][i] = cnt;
				cnt++;
			}
			
			for(int i = 0; i < 5 ; i ++ ) {
				System.out.print(  array[j][i] + " ");
			}
			System.out.println(" ");
		}
		
		
//		array[0][0] = 25;
//		array[0][1] = 24;
//		array[0][2] = 23;
//		array[0][3] = 22;
//		array[0][4] = 21; 
//		
//		
//		array[1][0] = 30;
//		array[1][1] = 29;
//		array[1][2] = 28;
//		array[1][3] = 27;
//		array[1][4] = 26;
//		
//		System.out.print(array[0][0] + " ");
//		System.out.print(array[0][1]+ " ");
//		System.out.print(array[0][2]+ " ");
//		System.out.print(array[0][3]+ " ");
//		System.out.print(array[0][4]+ " ");
//		
		

//		int cnt = 21; //21에서 줄어든다고 생각해
		
//		이건 열이 내려가는거 안에 행이 반복되는거 보기
//		for (int i = 4; i >= 0 ; i--) {  //i는 역순으로 떨어지게끔 출력 4,3,2,1,0 이런식으로 왜냐면 거꾸로 출력이 되도록 해야하니까
//			array[0][i] = cnt; //여기서 cnt는 올라가고
//			cnt++;
//		}
//		for (int i = 4; i >= 0 ; i--) {
//			array[1][i] = cnt;     //여기서 늘어나는걸 찾아 그게 반복이 됨
//			cnt++;
//		}
//		for (int i = 4; i >= 0 ; i--) {
//			array[2][i] = cnt;
//			cnt++;
//		}
		
		
//		이건 출력문빼는거 //위랑 아래랑  한번에 j로 묶어서 둘다 증가 시키도록 정리해주면 아주 최고!
		
//		for (int i = 0; i < array.length ; i++) {  //출력문은 따로쓰는게 좋음 뭐든 반복되는거 이런 배열에서!
//			System.out.print(array[0][i] + " ");			//여기서 배열에서 증가하는 값이 있자너! 그걸 반복문으로 생각해
//		}
//												//값을 넣고 순차적으로 빼자
//		
//		for (int i = 0; i < array.length ; i++) {  
//			System.out.print(array[1][i] + " ");			
//		}
//		
//		
//		for (int i = 0; i < array.length ; i++) {  
//			System.out.print(array[2][i] + " ");			
//		}
		
//		여기서 행 열 둘다 반복을 j로 시켜주는거임
		
		////////////////////////////////////////위의 반복되는 문장을 for로 정리만 해준거임 한꺼번에 묶어서
		//답.
//		
//		int cnt = 21;
//	
//		for (int j = 0 ; j < array.length ; j ++) { 
//			
//			for (int i = 4; i >= 0 ; i--) {
//				array[j][i] = cnt;
//				cnt++;
//				
//			}
//			for (int i = 0; i < array[j].length ; i++) {
//				System.out.print(array[j][i] + " ");			
//			}
//		System.out.println(" ");
//		}
//		
		

		
	}

}
