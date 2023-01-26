package mine;

import java.util.Scanner;

public class Ex18jungsuplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		
		// int > String 하려면 .Integer.toString(숫자);
		// String 클래스 > length(); 문자열의 길이를 알수있다. "ABC" => 3
		
		String str = Integer.toString(num);  //원래 int로 선언된거를 string으로 바꿔줌
		
		// 배열 선언 입력받은 정수 담아줄꺼임
		int[] array = new int[str.length()];
		
		
		
		// 각 배열에 값 담아주기
		for (int i = 0; i <array.length; i++) {
			
		array[array.length -i-1] = num % 10; 
		// num %10을 반복적으로 해주면 12345678 / 10 = 몫이 1234567 나머지가 8
		//						1234567 /10 = 몫이 123456 나머지가 7
		num = num / 10; // num에 몫을 넣어줘야 계속 돌아가면서 새 값이 들어가니까
		}
		
		
		
		// 배열에 담은 값 누적으로 더해주기
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		sum += array[i];
		}
		
		System.out.println("합은 " + sum +"입니다.");
		
		sc.close();
		
	}

}
