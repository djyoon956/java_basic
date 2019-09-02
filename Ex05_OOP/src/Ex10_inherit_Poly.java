// 다형성 (상속 관계에서)
// 다형성 : 여러가지 성질(형태)를 가질 수 있는 능력

// JAVA : [상속관계]에서 하나의 참조 변수가 여러개의 타입을 가질 수 있다.
// 			 단) 하나의 참조 변수는 부모 타입이어야한다.
// 조상 클래스의 타입의 참조변수로 여러개의 자식 클래스 객체를 참조 가능하다.

// Java : 자식은 부모에게 조건없이 드린다(현실 반대)

class Tv2 { // 부모(일반화, 추상화) 공통자원을 가지고있다.
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch++;
	}
}

class CapTv extends Tv2 {
	String text;

	String caption() {
		return "현재 자막 처리중...";
	}
}

public class Ex10_inherit_Poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("전원 : " + tv.power);
		tv.chUp();
		System.out.println("채널 : " + tv.ch);
		System.out.println("자막 : " + tv.caption());

		Tv2 tv2 = tv;
		// 상속관계에서 부모타입은 자식 타입의 주소를 가질 수 있다.
		// 단 부모는 자신 타입의 객체만 볼 수 있다. (주소는 가지고잇다.)
		// >> 있는 메모리를 그대로 사용하기 위해
		System.out.println("tv 주소값 : " + tv);
		System.out.println("tv2 주소값 : " + tv2);
	}
}
