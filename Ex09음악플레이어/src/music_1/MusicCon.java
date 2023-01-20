package music_1;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicCon {
	// 재생중이면 멈추고 인덱스를 주면 그 노래를 재생하는 메소드 만들꺼임

	// 접근제한자 (Access Modifier)
	// public : 어디서든 접근 가능
	// protected : 상속관계에서 접근 가능 + 같은 패키지 내에서 접근 가능
	// (default) --> 아무것도 안씀(생략함을 의미) : 같은 패키지 내에서 접근 가능
	// private : 클래스 내부에서만 접근
	private MP3Player mp3 = new MP3Player(); //여기 중간에 바꾸셨는데..머라고..?
	private ArrayList<MusicDTO> musicList;

//	private MP3Player mp3 = new MP3Player(); (이렇게 하면 머가 안좋대)

	public void stop() { //멈추는기능
		
		if(mp3.isPlaying() == true) {
			mp3.stop();
			System.out.println("종료되었습니다.");
		}
	}
	
	public void play(int index) {  //플레이하는 기능

		MusicDAO dao = new MusicDAO();
		musicList = dao.select();

		String singer = musicList.get(index).getSinger();
		String title = musicList.get(index).getTitle();
		String path = musicList.get(index).getPath();

//		if(mp3.isPlaying()) 이렇게 써도됨
		if (mp3.isPlaying() == true) {
			mp3.stop();
		}

		mp3.play(path);
		System.out.printf("%s - %s%n", singer, title);
//						   가수 - 제목
	}

}
