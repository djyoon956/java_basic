// Ŭ���� == Ÿ��(ū Ÿ��)
class Data {
	int i;
}

public class Ex10_Method_Call {
	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		// Point (d ��� ������ ������, � Ÿ���� ���� : Data)
		scall(d);
		System.out.println("scall ȣ�� �� : " + d.i);

		vcall(d.i);
		System.out.println("vcall ȣ�� �� : " + d.i);
	}

	// static�� ��ü ���� ���� �޸𸮿� �ö�
	static void scall(Data data) { // �ּҰ� ���� (reference by value)
		// data ������ Data��� Ŭ������ �ּҰ��� ������ �ȴ�.
		// Data�� �ǹ��ϴ� ���� �ּҰ�
		System.out.println("scall ȣ�� : " + data.i);
		data.i = 1111;
	}

	static void vcall(int x) { // �� ���� (call by value)
		System.out.println("before : " + x);
		x = 8888;
		System.out.println("after : " + x);
	}
}
