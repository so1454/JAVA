package ex03for문;

public class Ex11반복문복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for(초기화구문;조건식;반복후작업){
		// 조건식이 true일때 실행하는 문장
		// }

		// 문제 .1부터 10까지 출력하기
//		for (int i = 1; i <= 10 ; i++) {
//			System.out.println(i);
//		}

		// 문제. 1부터 10까지 숫자중 홀수만 출력
//		for(int i = 1 ; i<=10 ; i ++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
//		1 2 5 10
		// 문제. 10의 약수만 출력
//		for(int i = 1 ; i<=10; i++) {
//			if (10 % i == 0) {
//				System.out.println(i);
//			}
//		}
		// 문제. 완전 수 구하기 like 6 -> 1,2,3,6이 약수인데
//							여기서 자기빼고 더하면 6이됨

//		6 = 1 + 2 + 3 6%1/6%2/6%3 ==0
//		28=  1 + 2 + 4+  7+ 14
//		j(1000까지 돌려봐야지) % i(1,2,3,..대입) == 0
//		&& 나온 i 다 더하기

		for (int j = 1; j <= 1000; j++) {
			int sum = 0; // 자기 자신을 제외한 약수의 총합을 저장할 변수
						//sum을 한번 돌릴때마다 누적합을 초기화 해줘야됨 j랑 같은 수가 나올때만 출력되게
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == j) {
				System.out.println(j);
			}
		}
		

		
		
		
		
		
		
		
		
		
	
	}

}
