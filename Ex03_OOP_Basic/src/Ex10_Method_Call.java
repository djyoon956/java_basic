// 클래스 == 타입(큰 타입)
class Data {
	int i;
}

public class Ex10_Method_Call {
	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		// Point (d 라는 변수는 참조값, 어떤 타입을 갖는 : Data)
		scall(d);
		System.out.println("scall 호출 후 : " + d.i);

		vcall(d.i);
		System.out.println("vcall 호출 후 : " + d.i);
	}

	// static은 객체 생성 전에 메모리에 올라감
	static void scall(Data data) { // 주소값 전달 (reference by value)
		// data 변수는 Data라는 클래스의 주소값을 받으면 된다.
		// Data가 의미하는 것은 주소값
		System.out.println("scall 호출 : " + data.i);
		data.i = 1111;
	}

	static void vcall(int x) { // 값 전달 (call by value)
		System.out.println("before : " + x);
		x = 8888;
		System.out.println("after : " + x);
	}
}
