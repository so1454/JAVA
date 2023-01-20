package music_1;

public class Ex스태틱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1교시 0915분에 했음 (다시 듣기) 그림ㅇ르 이해를 못하겠음
		//무슨 Heap어쩌구..하시는데.....내가 잘 이해를 못하는 거같음
		
//		System.out.println(add(5,4)); //메소드에 static이 있을때
		
		 
		Ex스태틱 ex = new Ex스태틱();  //메소드에 static 제거했을때 new를 만들어서 불러주어야한다는거같음
		System.out.println(ex.add(5, 0));
		
		
		System.out.println("출력됨");
		
		
		
		//mvc ( model / view / controller)
		// model만 배움
		// DTO(data tranfer object) ,DAO(data access object(통신하는)) 
		
		
		
	}
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	
	

}
