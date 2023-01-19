package music_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class musicPlayer {

	
	static ArrayList<MusicVO> musicList = null;  //경로를 여기에서 잡아줌(아니 뭔 개소리여)
	static MP3Player mp3 = null ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5개의 음악이 담긴 뮤직플레이어!!

//		int --> integer : Wrapper Class
//		float --> Float 로 담아야한다.
//		boolean --> Boolean
//		string --> String
//		ArrayList< 요기 안에 타입이나 클래스를 넣음 >
		musicList = new ArrayList<>();

//		MusicVO music1 = new MusicVO("뉴진스", "Hype boy", "C:/music/뉴진스-HypeBoy.mp3");
		MusicVO music2 = new MusicVO("르세라핌", "AntiFragile", "C:/music/르세라핌-Antifragile.mp3");
		MusicVO music3 = new MusicVO("아이브", "LoveDive", "C:/music/아이브-LoveDive.mp3");
		MusicVO music4 = new MusicVO("윤하", "사건의 지평선", "C:/music/윤하-사건의지평선.mp3");
		MusicVO music5 = new MusicVO("카라", "When I Move", "C:/music/카라-WhenIMove.mp3");

		musicList.add(new MusicVO("뉴진스", "Hype boy", "C:/music/뉴진스-HypeBoy.mp3"));
		musicList.add(music2);
		musicList.add(music3);
		musicList.add(music4);
		musicList.add(music5);

		mp3 = new MP3Player();

		Scanner sc = new Scanner(System.in);
		
		int index= 0; // 현재 재생되고 있는 음악의 인덱스
		
		while (true) {

			System.out.println("메뉴를 선택하세요.");
			System.out.print(" [1] 재생  [2] 검색  [3] 노래추가 [4] 노래삭제 [5] 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생
				
				playSong(index);{
					
				}
				
				
				
				
//				String singer = musicList.get(index).getSinger();
//				String title = musicList.get(index).getTitle();
//				String path = musicList.get(index).getPath();
//				
//				mp3.play(musicList.get(index).getPath());
//				
//				System.out.printf("%s - %s%n", singer, title);
				

				while (true) {

					System.out.print(" [1] 정지 [2] 이전곡 [3] 다음곡 [4] 이전 메뉴 >> ");
					int inPut = sc.nextInt();

					if (inPut == 1) {
						// 정지
						mp3.stop();
					} else if (inPut == 2) {
						// 이전곡
						if (mp3.isPlaying() == true) {
							
							mp3.stop();
						}
						index--;
						if(index == -1) {
							index = 4;
						}
						
						playSong(index);
//						mp3.play(musicList.get(index).getPath());
						
						
						
					} else if (inPut == 3) {
						// 다음곡 --> 앞 노래 정지하고 그 다음곡 재생을 해줄꺼임
						mp3.stop(); 

						if (mp3.isPlaying() == true) {  // 현재 노래가 재생되고 있을때 사용해야 에러가 안남.
							// 그래서 애를 써줌
							mp3.stop();
						}
						index++;
						
						if(index == 5) {
							index = 0 ;
						}
						// 만약, index가 범위를 벗어난다면
						// index를 다시 0으로
						
						playSong(index);
//						mp3.play(musicList.get(index).getPath());
						// 여기서 play는 우리가 가져온 mp3에 있는 변수임
						
						
						
						

					}else if (inPut==4) {
						break;
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}

				}

			} else if (menu == 2) {
				// 검색
			} else if (menu == 3) {
				// 노래추가
			} else if (menu == 4) {
				// 노래 삭제
			} else if (menu == 5) {
				System.out.println("종료 되었습니다.");
				mp3.stop();
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	public static void playSong(int index) {
		// 재생
		String singer = musicList.get(index).getSinger();
		String title = musicList.get(index).getTitle();
		String path = musicList.get(index).getPath();
		
		mp3.play(musicList.get(index).getPath());
		
		System.out.printf("%s - %s%n", singer, title);
		
	}
	
	
	
	
}
