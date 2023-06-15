package test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookH = sc.nextInt();
		
		hour = hour + cookH / 60;
		min = min + cookH % 60;

		if (min > 59) {
			hour += 1;
			min = min - 60;
			if (hour>=23) {
				hour = hour - 24; 
			}
		}
		System.out.println(hour + " " + min);

		sc.close();

	}
}
