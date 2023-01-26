package mine2;

import java.lang.reflect.Array;

public class Ex05arrayloca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]point = {92,32,52,9,81,2,68};
		int a = 0 ; // 인덱스 1
		int b = 0;	// 인덱스 2 
		int distance = Math.abs(point[0] - point[1]); // 임의의 값임 (확정이 아니라)
		
		
		for(int j = 0 ; j < point.length ; j ++) {
			
			for(int i = 0 ; i < j ; i ++) {
				int min = Math.abs(point[i] - point[j]); // 거리의 절대값
				if(distance > min) {  //만약 작으면 여기 if 문 안으로 들어가게해서 과정을 진행시킬꺼다. 최솟값 구하기!! 알고리즘
					distance = min;  // 작을 때 값을 바꿔줌(그럼 계속 들어왔다 나갔다 하면서 비교해서 젤 작은 값을 찾겠지)
					a = i ; 
					b = j ; // 그리고 작은 값의 인덱스 값을 여기에 계속 담아줄꺼임
				}
			}
		}
		
		System.out.printf("result = [%d, %d]",a,b);
		
		
		
		
		
		
		
		
		
		
		
	}

}
