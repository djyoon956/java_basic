//클래스 == 타입(큰타입)
class Data {
	int i;
}

public class Ex10_Method_Call {
	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		// POINT (d 라는 변수는 주소값(참조) 어떤 타입을 갖는: Data)
		scall(d);
		System.out.println("scall ȣ�� �� : " + d.i);

		vcall(d.i);
		System.out.println("vcall ȣ�� �� : " + d.i);
	}

	static void scall(Data data) { // void m(int i) : 주소값 전달
		// data 라는 변수는 Data라는 클래스의 주소값을 받으면 되요
		// Data 가 의미하는 것은 주소값
		System.out.println("scall ȣ�� : " + data.i);
		data.i = 1111;
	}

	static void vcall(int x) { // (call by value)
		System.out.println("before : " + x);
		x = 8888;
		System.out.println("after : " + x);
	}
}
