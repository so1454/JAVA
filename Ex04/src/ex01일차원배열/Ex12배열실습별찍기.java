package ex01일차원배열;

public class Ex12배열실습별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이거 복습했으면 지우기(안하면 안지움 너 공부안한거임..)
		//문제 밑의 배열만큼 별을 나타내라 
		//예시 ) 3 : ***
		int[] starCount = { 3, 4, 4, 2, 1 };
		
		
		
		//잘 모르겠으면 이런식으로 먼저 해보고 그대로 출력이 된다고 하면
		//이걸 짧게 줄이는 방법을 또 생각해보기
//		System.out.print(starCount[0] + " : "); //3을 출력시켜야함 //얘도 반복이고 //얘도 for문쓰고
//		
//		System.out.print("*"); 			//얘도 반복임	//얘도 for문써야됨
//		System.out.print("*");
//		System.out.println("*");
//		
//		System.out.print(starCount[1] + " : "); //4를 출력시켜야함
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*");
//		
//		System.out.print(starCount[2] + " : "); //4를 출력시켜야함
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*"); 

		for (int i = 0; i < starCount.length; i++) { // 배열의 길이만큼 증가시킨다는 말
			System.out.print(starCount[i] + " : "); //배열안의 숫자를 출력 

			for (int j = 0; j < starCount[i]; j++) { // 위에서 배열의 숫자를 가져옴, 예시) starCount[i]가 3이 나오면 0부터 3미만으로 적게 별을 출력시킨다는 뜻
				System.out.print("*");
			}
			System.out.println(""); // 엔터대신

		}

		
		
		
		
		
		
		
	}

}
