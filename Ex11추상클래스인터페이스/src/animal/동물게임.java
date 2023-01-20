package animal;

public class 동물게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		호랑이 호랑이1 = new 호랑이();
		토끼 토끼1 = new 토끼();
		기린 기린1 = new 기린();
		토끼 토끼2 = new 토끼();
		기린 기린2 = new 기린();
		토끼 토끼3 = new 토끼();
		기린 기린3 = new 기린();
		
//		포유류[] 동물들 = new 포유류[] {호랑이1,토끼1,기린1,토끼2,기린2,토끼3,기린3};
		포유류[] 동물들 = {호랑이1,토끼1,기린1,토끼2,기린2,토끼3,기린3};
		
		for(int i = 0 ; i< 동물들.length ; i ++) {
			동물들[i].울다();  // --> 이제 배열의 순서대로 가져오겠지
			
			if(동물들[i] instanceof 호랑이 ) { // 동물들 i가 호랑이랑 일치하면 트루다
				((호랑이)동물들[i]).헤엄치다();
						
			}
		}
		
		
		
		
		
		
		
		

	}

}
