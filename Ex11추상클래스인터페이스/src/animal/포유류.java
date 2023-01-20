package animal;

// 내가 가진 메소드 중에 하나라도 추상화된 메소드가 있따면
// 클래스는 추상화된 클래스여야 한다.
//public class 포유류 { //원래 이거였는데
public abstract class 포유류 { // 추상화해줌 하나라도 있으면 해줘야하니까
//부모클래스

	protected void 먹다() {
		System.out.println("먹다");
	}

	protected abstract void 울다(); // 추상화된 메소드는 body가 없다.

//	protected void 울다() {  	//이게 원래 써져있던거 
//		System.out.println("울다");
//	}

	protected void 자다() {
		System.out.println("자다");
	}

}
