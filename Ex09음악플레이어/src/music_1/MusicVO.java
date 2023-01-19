package music_1;

public class MusicVO {
	//설계도
	private String singer ,title, path; //동시선언 가능
//	private String title;
//	private String path;

	

	
//	우클릭 source - generate constructor using field(생성자)
	// 생성자 만듬
	public MusicVO(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}
	
	// getter를 만듬
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public String getPath() {
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
