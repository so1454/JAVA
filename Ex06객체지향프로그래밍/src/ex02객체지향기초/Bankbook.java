package ex02객체지향기초;

public class Bankbook {

	// 속성
	// 잔액
	int money;

	// 기능
	// 입금하다(-)
	public void deposit(int Money1) {
//		money = Money1 + money;
		money += Money1;
//		System.out.println("-----------");
//		System.out.println("입금 금액할 금액 >> "+Money1+"원");

	}

	// 출금하다(-)

	public void withdraw(int Money2) {
//		money = money - Money2;
		money -= Money2;
//		System.out.println("-----------");
//		System.out.println("출금 금액할 금액 >> "+Money2+"원");
	}
	// 잔액 보기

	public void showMoney() {
		
		System.out.println("현재 잔액 : " + money + "원");
	}

}
