import kr.or.bit.Bird;

// protected 접근자는 상속 관계에서 사용
// 사용목적 : 상속 관계에서 재정의(override)
// 당신이 재정의를 해 주었으면 좋겠다는 의도가 숨어있다.

class Ostrich extends Bird {
	void run() {
		System.out.println("i am running");
	}
}

public class Ex09_inherit_Protected {
	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();

	}
}
