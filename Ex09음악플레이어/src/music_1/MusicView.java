package music_1;

import java.util.Scanner;

public class MusicView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Model : MusicDTO, MusicDAO
		// View : MusicView
		// Controller : MusicCon

		Scanner sc = new Scanner(System.in);

		// 사용하지 않는 클래스 import 해제
		// ctrl + shift + o

		MusicCon con = new MusicCon();
		int index = 0; // play의 index와는 다른 아이임

		System.out.println("=====뮤직플레이어=====");

		while (true) {
			System.out.print("[1] 재생 [2] 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생
				con.play(index); // musicCon에 있는 play라는 메소드안에 있는 구성요소를 실행시켜줄꺼다.

				while (true) {
					System.out.println("[1] 정지 [2] 이전곡 [3] 다음 곡 [4] 이전메뉴");

					int input = sc.nextInt();

					if (input == 1) {
						// 정지
						con.stop();
						
					} else if (input == 2) {
						// 이전 곡
						index--;
						if (index == -1) {
							index = 4;
						}
						con.play(index);

					} else if (input == 3) {
						// 다음 곡
						index++;

						if (index == 5) {
							index = 0;
						}
						con.play(index);

					} else if (input == 4) {
						break; // break하면 if문을 나가서 while로 가는거니까 다시 메인 메뉴로 나감
					}

				}

			} else if (menu == 2) {
				// 종료
				System.out.println("종료 되었습니다.");
				break;
			}
		}

	}

}
