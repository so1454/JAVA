package mine;

public class Ex14_getMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMiddle("power"));

	}

	private static String getMiddle(String middle) {
		// TODO Auto-generated method stub
		String[] array = middle.split("");

		String result = "A";

		if (array.length % 2 == 0) {
			//지금 1이랑 2나와야됨
						// 길이에 2를 나누고 -1 하면 1임 
			result = array[array.length / 2 - 1] + array[array.length / 2];

		} else if (array.length % 2 == 1) {
			// 가운데 숫자만 받아와야함
			// 2나와야됨
			result = array[array.length / 2];
		}

		return result;
	}

}
