package ex01메소드;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]array = { 10,50 };
		int num = 0;
		
		int sum = 0;
		for(int i = 0; i < array.length ; i++) {
			num = array[i];
			sum += num;
		}
		int result = sum / array.length;
		
		System.out.println(result);
		
	}

}
