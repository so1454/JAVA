package ex01메소드;

public class Ex07배열의평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 50,25,25 };

		// 배열 인덱스 안의 모든 값의 평균을 구하는
		// getAverage() 메소드를 만드시오
		// 추가문제. 평균값에 소수점 두번째 자리수까지만 나오게하세요
		double average = getAverage(array);
		
//		System.out.println("array의 평균은 : " + String.format("%.2f", average));
		//이 위에건 내가 만든 매소드에 적용한거고
		
		System.out.println("array의 평균은 : " + average);
	}

	public static double getAverage(int[] array) {
		// TODO Auto-generated method stub

		double num = 0;
		
		for (int i = 0; i < array.length; i++) {
			num += array[i];
		}
		
		num = num / array.length;
		
		int temp = (int)(num*100);
		double result = temp * 0.01;
		
		return result;
	}

}
