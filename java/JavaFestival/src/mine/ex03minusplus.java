package mine;

public class ex03minusplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// 1 -2 3 -4 5 -6 ~ -100까지 해서 출력하고
		// 결과 : -50
		
		for( int i = 1  ; i <= 100 ; i ++) {
			
			if ( i % 2 ==1 ) {
				System.out.print(i+" ");
			}else if (i %2 == 0) {
				System.out.print("-"+i+" ");
			}
		}
		System.out.println("");
		int num = 0;
	for( int i = 0  ; i <= 100 ; i ++) {
			
			if ( i % 2 ==1 ) {
				num += i;
			}else if (i %2 == 0) {
				num -= i;
			}
			
		}
		
		System.out.println("결과 : "+ num);
		
		
		
		
		
		
	}

}
