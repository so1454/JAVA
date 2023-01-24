package mine;

public class Ex19cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1 = 50;
		int num2 = 15;
		char op = '+';
		
		System.out.println("계산결과 = " + cal(num1,num2,op));
		
		
		
		
		
		
		
	}

	private static int cal(int num1, int num2, char op) {
		// TODO Auto-generated method stub
		
		int result = 0;
		if(op == '*') {
			result = num1 * num2;
		}else if (op =='-') {
			result = num1 - num2;
		}else if (op == '/') {
			result = num1 / num2;
		}else if (op == '+') {
			result = num1 + num2;
		}else {
			result = -1;		//이상한 데이터나 돌려줄 데이터가 없으면 보통 -1을 담아 리턴해줌
		}
		
		
		
		
		return result;
	}
	
	
	
	

}
