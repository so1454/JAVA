package ex02객체지향기초;

import java.util.Scanner;

public class BankbookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bankbook B1 = new Bankbook();
		Scanner sc = new Scanner(System.in);
			
		B1.showMoney();
		System.out.print("입금할 금액 >> ");
		B1.deposit(sc.nextInt());  //아래과정을 간단하게 정리가능
//		int in = sc.nextInt();
//
//		B1.deposit(in);
		
		B1.showMoney();

		System.out.print("출금할 금액 >> ");
		B1.withdraw(sc.nextInt());
//		int out = sc.nextInt();
//
//		B1.withdraw(out);
		
		B1.showMoney();

		//그냥 해본거
		
//		do {
//			System.out.print("어떤 업무를 보시겠습니까? :");
//			String inMoney = sc.next();
//			
//			B1.showMoney();
//			if( inMoney.equals("Y")) {
//				System.out.println(" ");
//				System.out.print("입금할 금액 >> ");
//				int in = sc.nextInt();
//
//				B1.deposit(in);
//				B1.showMoney();
//			}
//			
//			else if(inMoney.equals("N")) {
//				System.out.println(" ");
//				System.out.print("출금할 금액 >> ");
//				int out = sc.nextInt();
//				
//				B1.withdraw(out);
//				B1.showMoney();
//			}
//			
//		}while(true);
		
		
		
		
	}

}
