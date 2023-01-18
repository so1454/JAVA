package mine;

public class ex06multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//꼭.. 다시 풀쟈...
		
//		77*1
//		76*2
//		75*3
//		..
//		1*77
		

		int i = 1;
		int j = 77;
		int sum = 0;
		while (i <= 77) {
			sum += j * i;
			i++;
			j--;
		}
		System.out.println(sum);

		
		
		
	}

}
