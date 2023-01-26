package mine2;

import java.util.Scanner;

public class Ex12javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===채점하기====");
		Scanner sc = new Scanner(System.in);
		String ox = sc.next();

		String[] array = ox.split("");
		int cnt = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "o":
				cnt++;
				sum += cnt;
				break;
			case "x":
				cnt = 0;
				break;
			}

		}
		System.out.println(sum+" ");

	}

}
