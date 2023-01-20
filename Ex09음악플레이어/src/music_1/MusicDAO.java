package music_1;

import java.util.ArrayList;

public class MusicDAO {
	//지금 이거하는게 뮤직플레이어(메인) 간단하게 해줄라고 하는거임 나는.. 왜하나했네..
	// 이건 그럼 머겠어 재생시키는 기능을 간단하게 하려고 하겠지!!
	private ArrayList<MusicDTO>musicList;
	
	
	public ArrayList<MusicDTO> select(){
		
		musicList = new ArrayList<>();
		
		
//		MusicVO music1 = new MusicVO("뉴진스", "Hype boy", "C:/music/뉴진스-HypeBoy.mp3");
		MusicDTO music2 = new MusicDTO("르세라핌", "AntiFragile", "C:/music/르세라핌-Antifragile.mp3");
		MusicDTO music3 = new MusicDTO("아이브", "LoveDive", "C:/music/아이브-LoveDive.mp3");
		MusicDTO music4 = new MusicDTO("윤하", "사건의 지평선", "C:/music/윤하-사건의지평선.mp3");
		MusicDTO music5 = new MusicDTO("카라", "When I Move", "C:/music/카라-WhenIMove.mp3");

		musicList.add(new MusicDTO("뉴진스", "Hype boy", "C:/music/뉴진스-HypeBoy.mp3"));
		musicList.add(music2);
		musicList.add(music3);
		musicList.add(music4);
		musicList.add(music5);
		
		
		return musicList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
