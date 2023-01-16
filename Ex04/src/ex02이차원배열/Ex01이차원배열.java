package ex02이차원배열;

public class Ex01이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이차원 배열은 배열안에 배열이 있는거
		//3행 3열 2차원 배열 만들기
		int [] [] array = new int [3][3]; //안에 숫자가 행과 열의 갯수임
		
		array [0][0] = 10;
		array [0][1] = 20;
		array [0][2] = 30;
		
		array [1][0] = 40;
		array [1][1] = 50;
		array [1][2] = 60;
		
		array [2][0] = 70;
		array [2][1] = 80;
		array [2][2] = 90;
		
		System.out.print(array[0] [0] + " ");
		System.out.print(array[0] [1] + " ");
		System.out.print(array[0] [2] + " ");
		System.out.println(" ");
		System.out.print(array[1] [0] + " ");
		System.out.print(array[1] [1] + " ");
		System.out.print(array[1] [2] + " ");
		System.out.println(" ");
		System.out.print(array[2] [0] + " ");
		System.out.print(array[2] [1] + " ");
		System.out.print(array[2] [2] + " ");
		System.out.println(" ");
		
		//이차원 배열의 길이를 알 수 있는 방법
		// 행의 길이를 알 수 있는 방법
		System.out.println("행의 길이 : "+ array.length);
		
		//0열의 길이를 알 수 있는 방법
		System.out.println("0열의 길이 : " + array[0].length);
		
		
		
		
	}

}
