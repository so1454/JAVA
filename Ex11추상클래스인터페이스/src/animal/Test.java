package animal;

import java.util.Scanner;

public class Test {
//내가한거
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PlusGame p = new PlusGame();
		
		p.makeRandom();
		p.quiz();
		Scanner sc = new Scanner(System.in);
		int answer1 = sc.nextInt();
		
		
		
		p.checkAnswer(answer1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
