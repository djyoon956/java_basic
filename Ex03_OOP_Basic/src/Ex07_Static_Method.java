
class StaticClass {

	int iv;
	static int cv;

	void m() { // 일반함수
		// 1. iv 값 처리 가능
		iv = 100;
		// 2. cv 값 처리 가능
		cv = 100;
		StaticClass.cv = 100;
		// **static 자원은 일반 자원보다 먼저 메모리에 할당된다.**
	}

	static void sm() { // static 함수
		// 1. iv 값 처리 불가능
		// 2. cv 값 처리 가능
		// **static 변수만 처리 가능**
		StaticClass.cv = 2000;
	}
}

public class Ex07_Static_Method {
	public static void main(String[] args) {
		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);

		// StaticClass sc= new StaticClass();
	}
}
