package mine2;

import java.util.Scanner;

public class Ex10dash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();

		String[] array = num.split("");
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) { // 이 값과 동일한 값을 출력할꺼다 라는 뜻

			case "0": //만약 0이면
				sum += 6; // 6 더해줄꺼다.
				break;
			case "1": // 만약 1이면 
				sum += 2; // 2룰 더해줄꺼다.
				break;
			case "2":
				sum += 5;
				break;
			case "3":
				sum += 5;
				break;
			case "4":
				sum += 4;
				break;
			case "5":
				sum += 5;
				break;
			case "6":
				sum += 6;
				break;
			case "7":
				sum += 3;
				break;
			case "8":
				sum += 7;
				break;
			case "9":
				sum += 6;
				break;

			}

		}

		System.out.println("대시('-')의 총 합 >> " + sum);

	}

}
