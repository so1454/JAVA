package animal;

import java.util.Random;

public class PlusGame implements IGame {

	int num1 = 0;
	int num2 = 0;
	int 난이도= 9;  //난이도 올리기
	 
	public void rankup() {  //난이도 올리기
		난이도 *= 10 ;
	}

	
	@Override
	public void makeRandom() {
		Random r = new Random();
		num1 = r.nextInt(난이도)+1;  //맞을때 마다 난이도 올리기
		num2 = r.nextInt(난이도)+1;
	}

	@Override
	public void quiz() {
		// TODO Auto-generated method stub
		System.out.print(num1 + " + "+ num2+ " = ");
		
	}

	@Override
	public boolean checkAnswer(int answer) {
		// TODO Auto-generated method stub
		
		return answer == num1 + num2;
		
		
		//내가한거 test main에 출력시켜보면 맞음 (권장하지 않는 방법 출력의 경우에는 내 눈에 보이게 하는게 가시적으로 좋음)
//		if ((num1 + num2) == answer) {
//			System.out.println("맞았습니다!! 정답은 " + answer);
//		}else {
//			System.out.println("틀렸습니다!");
//		}
		
//		return false;
		
		
		
	}

}
