package model;

public class memberDTO {

	// 데이터를 담기위해서 만들어줌
	// DTO : Data Transfer Object 계층간 데이터를 이동할 수 있게하는 나만의 자료형
	// Table마다 하나씩 DTO를 가진다.( 여러가지 테이블을 만들면 그만큼 여러개의 DTO를 만들어줘야함 )
	// Table 컬럼들을 필드로 가짐
	
	// 필드
	// 아이디, 패스워드, 이름, 전화번호

	// 생성자 메소드
	
	private String id ;
	private String pw ;
	private String name ;
	private String tel ;
	
	//기본 생성자도 만들어주면 좋다.
	// 왜? 들어있는게 아무것도 없는 이 생성자 안에 setter메소드를 이용해서
	// 원하는 데이터만 채울 수 있게 되기 때문이다. (ex.memberDTO를 매개변수로 넣어주고 
//										dto.getName() = 변수이름.get~ 하면 값을 출력시켜줌
//									   메인에서 dto.setName(name) = set~(담아줄 메인에서 선언된 변수) 이렇게 하면됨)
//										참고 > 여기서 메소드로쓴 dto와 메인으로 쓴 dto는 선언해주는 변수명대로 달라질 수 있음
//								memberDTO dto / memberDTO dto1 = new memberDTO(); 이런식으로 변수명은 달라질 수 있다! 
	public memberDTO() {
		
	}
	
	public memberDTO(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
	// getter setter 메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
