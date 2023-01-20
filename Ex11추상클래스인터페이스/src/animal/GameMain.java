package animal;

import java.util.Scanner;

public class GameMain {
//쌤이 한거
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlusGame game = new PlusGame();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			game.makeRandom();
			
			
			game.quiz();
			
			int answer1 = sc.nextInt();
			
			if (game.checkAnswer(answer1)) {
				System.out.println("맞았습니다!! 정답은 " + answer1);
				game.rankup();
			}else {
				System.out.println("틀렸습니다!");
			}
			
		
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
