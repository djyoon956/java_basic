
class StaticClass {

	int iv;
	static int cv;

	void m() { // �Ϲ��Լ�
		// 1. iv �� ó�� ����
		iv = 100;
		// 2. cv �� ó�� ����
		cv = 100;
		StaticClass.cv = 100;
		// **static �ڿ��� �Ϲ� �ڿ����� ���� �޸𸮿� �Ҵ�ȴ�.**
	}

	static void sm() { // static �Լ�
		// 1. iv �� ó�� �Ұ���
		// 2. cv �� ó�� ����
		// **static ������ ó�� ����**
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
