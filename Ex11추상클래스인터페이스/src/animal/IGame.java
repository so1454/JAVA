package animal;

public interface IGame {

	
	// 두 개의 랜덤한 정수를 만드는 기능!
	// 범위 1~9
	// 3과 5
	public abstract void makeRandom();
	
	// 콘솔창에 문제를 출제
	// 위에서 만들어진 랜덤한 정수를 통해 문제 출제!
	// 예> " 3+ 5 = "
	public abstract void quiz();
	
	public abstract boolean checkAnswer(int answer);
	
	
	
	
	
	
	
	
	
	
}
