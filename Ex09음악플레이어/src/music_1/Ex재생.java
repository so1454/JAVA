package music_1;

import javazoom.jl.player.MP3Player;

public class Ex재생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다른 개발자들이 만들어둔 압축파일 가지고와서 그거 스캔이나 랜덤처럼 불러서 사용할 것임
		
				//jar(java Archive)
				// : 다른 개발자가 만들어 둔 JAVA class 모음집
				
				// 추가방법 : Java Project 우클릭 --> 
				
				
				//MP만 쳐도 ctrl + space 누르면 바로 임포트됨
		MP3Player mp3 = new MP3Player();
		
		 // 음악 폴더 가서 재생시킬 음악--> 속성 --> 보안에 경로 있음
		String path = "C:/music/윤하-사건의지평선.mp3";
//		"C:/music/뉴진스-HypeBoy.mp3"; 
//		‪C:/music/윤하-사건의지평선.mp3
//		C:/music/
//		C:/music/르세라핌-Antifragile.mp3
//		C:/music/아이브-LoveDive.mp3
//		C:/music/카라-WhenIMove.mp3
		
		// 여기 오류나니까 걍 수기로 치는게 좋을 듯
		mp3.play(path);
		
		
		
		
		
		
		
	}

}
