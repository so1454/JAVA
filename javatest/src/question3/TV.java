package question3;

public class TV {
	public String color;
	public int channel;
	public void print() {
		System.out.printf("Tv의 현재 채널은 : %d이고, Tv의 색깔은 %s 입니다%n",channel,color);
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
	}

}
