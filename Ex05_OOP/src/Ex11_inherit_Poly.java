
//자바에서 다형성 상속관계
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Ebase extends Pbase {
	int e = 300;
}

public class Ex11_inherit_Poly {
	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase);
		// 다형성 : 부모타입의 참조 변수가 자식 타입의 주소값을 가질 수 잇다,.
		// 단 생성된 모든 객체에 접수 하는 것이 아니라 자신 타입에 객체만 접근 가능

		Pbase pbase = cbase;
		System.out.println(cbase);
		System.out.println(pbase);
	}
}
