package test;

public class TimeWatch {
	
	static String timeBuffer;
	static int oldTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stopwatch(1);
		
		System.out.println("Time on!!엔터키를 누르면 종료됩니다");
		
		pause();
		
		stopwatch(0);
		
		System.out.printf("Time OFF! 경과시간 [%s] %n",timeBuffer);
		
		
		
	}
	public static void stopwatch(int onOff) {
		if(onOff == 1) {  // 타이머 켜기
			oldTime= (int)System.currentTimeMillis()/1000;
					
		}
		if(onOff == 0) {  // 타이머 끄기 시분초를 timebuffer에 넣기
			secToHHMMSS(((int)System.currentTimeMillis()/1000) - oldTime);
			
		}
		
	
		
		
		
		
		
		
	}
	
	
	
	
	public static void secToHHMMSS(int secs) {
		int hour, min, sec;
		sec = secs % 60;
		min = secs / 60 % 60;
		hour = secs / 600;
		
		timeBuffer = String.format("%02d : %02d : %02d", hour, min, sec);
		
	}
	
	public static void pause() {
		
		try {
			System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	

}
