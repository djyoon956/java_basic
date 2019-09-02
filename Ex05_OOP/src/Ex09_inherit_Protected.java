import kr.or.bit.Bird;

// protected 접근자는 상속 관계에서 사용
// 사용목적 : 상속 관계에서 재정의(override)
// 당신이 재정의를 해 주었으면 좋겠다는 의도가 숨어있다.

class Ostrich extends Bird {
	// 구체화 특수화 표현
	void run() {
		System.out.println("달린다^^");
	}

	@Override
	protected void moveFast() {
		run();
	}
}

class bi extends Bird {

//		@Override
//		public void moveFast() {
//			super.moveFast();
//		}

}

public class Ex09_inherit_Protected {
	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.moveFast();

		bi b = new bi();
	//	 b.moveFast();
	}
}
