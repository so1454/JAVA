package animal;

public class 호랑이 extends 포유류 implements 물,나무	{  //오..안써도 메뉴에서 바로 만들 수 있는 방법도 있음
								//인터페이스는 물,나무 다중 가능
//자식클래스
	
	protected void 울다() {
		System.out.println("어흥");
	}

	@Override
	public void 헤엄치다() {
		System.out.println("멋있게 헤엄");
		
	}

	@Override
	public void 잠수하다() {
		System.out.println("1분만 잠수");
		
	}

	@Override
	public void 나무타기() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
