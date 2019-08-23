
class StaticClass {

	int iv;
	static int cv;

	void m() { // 일반함수
		// 1. iv 값을 처리 (0)
		iv = 100;
		// 2. cv 값을 처리 (0) >> Today Point (생성시점)
		// static 자원은 일반자원보다 먼저 memory 에 올라간다.
		StaticClass.cv = 1000; // cv= 1000;
	}

	static void sm() { // static 함수
		// 1. iv 값을 처리 (x) : why? 생성시점 >> static 자원은 일반 자원이전에
		// memory 에 생성된다.
		// static 은 static 끼리 놀아라 ( 그러면 error 는 없을 것이니 ^^)
		// 함수 입장에서 보면 iv는 메모리에 없어요

		// 2. cv 값을 처리 (0)
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
