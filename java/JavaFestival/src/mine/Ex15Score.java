package mine;

public class Ex15Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] array = score.split(",");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < array.length; i++) {
			if ("A".equals(array[i])) {
				a += 1;
			} else if ("B".equals(array[i])) {
				b += 1;
			} else if ("C".equals(array[i])) {
				c += 1;
			} else if ("D".equals(array[i])) {
				d += 1;
			} else if ("F".equals(array[i])) {
				f += 1;
			}
		}
		
		System.out.println("A :"+ a +"명" );
		System.out.println("B :"+ b +"명" );
		System.out.println("C :"+ c +"명" );
		System.out.println("D :"+ d +"명" );
		System.out.println("F :"+ f +"명" );
		
		
		
		
		

	}

}
