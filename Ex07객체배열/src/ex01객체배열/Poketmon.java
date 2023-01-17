package ex01객체배열;

public class Poketmon {

	// 1. 필드
	// 이름, 타입, hp, atk(공격력), skill
	private String name;
	private String type;
	private int hp;  //체력
	private int atk; //공격력
	private String skill;
	
	
	
	// 2. 메소드
	// 생성자 메소드
	// 모든 필드의 값을 초기화 시킬 수 있는 생성자
	
//	alt shift s
	
	public Poketmon(String name, String type, int hp, int atk, String skill) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
	}
	

	// getter/setter메소드 만들기 alt shift s
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
	
	
}
