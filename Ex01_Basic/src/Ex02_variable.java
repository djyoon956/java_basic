//1. Ex02_variable Ŭ����
//2. Ư���� main �Լ��� ������ �ִ� Ŭ����
//3. static void main(String[] args) = ���α׷��� ������ �Ǵ� ������

//4. main �Լ��� ���� Ŭ���� (lib) = �ٸ� Ŭ������ �����ִ� Ŭ����

//Tip) C#�� static void Main(String[] args) m M ����

//���� : variable
//���� scope (��ȿ����) : ����Ǵ� ��ġ
//1. instance variable : ��ü���� class Test {int age}  �ʱ�ȭ ���ص� ��
//2. local variable    : �������� (�Լ��ȿ� �ִ� ����) class Test{public void run(){int age}} �ʱ�ȭ �ʼ�
//2.1 �Լ� �ȿ� if ���, for ��� �ȿ� �ִ� ������ �������������� scope�� �ڽ��� ��� ������
//3. static variable   : ��������(�ڿ�) : ��ü�� �����ڿ�

//��Ģ : �ϳ��� java ������ �ϳ��� Ŭ������ ���´�. Test.java >> class Test {}
//������ : �ϳ��� java���� �ȿ� �������� Ŭ������ ����� ��� ���� (��, class�߿� �ϳ��� public�� ������.)

//class�� ���赵�̴�. == class�� Type�̴�.(���� �������� Ÿ���� ������ �ִ� ū Ÿ��)
class Test {
	int iv = 500;
	// instance variable
	// �� ������ �ʱ�ȭ ���� �ʾƵ� �ȴ�.(�⺻ �� : default)�� ������ �ִ�.
	// Why �ʱ�ȭ�� ���� �ʾƵ� ��� ����? (���赵 �ϳ��� �������� ����Ʈ ������ â���� ������ �ٸ� ���� �ִ�.
	// ��) ��ü���� �ٸ� ���� ���� �� �ֱ� �����̴�.

	int window; // default ���� 0

	Test() { // Ŭ���� �̸����� �Լ� ����� ���� ������(Constructor)��� ��
		// ���� : member fiedl �ʱ�ȭ //��ü ������ ���ÿ� ȣ��

	}

	Test(int data) { // �����ε�(overloading) : �ϳ��� �̸����� �������� ����� ����
		window = data;
	}

	void write() {
		int num = 100; // ��������
						// �Լ��� ȣ��Ǹ� �׶� �޸𸮿� �����ǰ� �Լ��� ����Ǹ� �޸𸮿��� �������.(num)
		iv = 6666;
	}

	void print() {
//			System.out.println(num); �̰� �ȵ� (print �Լ� ����� num �������� �ʴ´�.)
		System.out.println("Test.iv : " + iv);
	}
}

public class Ex02_variable {

	public static void main(String[] args) {
		int lv = 500; // local variable
		System.out.println("lv ���� �� : " + lv);
		// ����(javac�� �������ϰ� java Ex02_variable) ctrl f11

//		int number; //���� 
//		//�ʱ�ȭ�� ���� ���� ������ ����� ��� ���� �߻�
//		System.out.println(number);
//		�ʱ�ȭ ����!

		int number = 0;
		System.out.println("�ʱ�ȭ number : " + number);
		// 1. ���������� �ݵ�� �ʱ�ȭ �ϰ� ����ؾ� �Ѵ�.(�ʱ�ȭ = ó������ �Է��ϴ� ��)
		// 2. ��� (�Լ� �ȿ� �ִ� ������ �ݵ�� �ʱ�ȭ)

		int num; // ����
		System.out.println("������");
		System.out.println("���� ������");
		num = 200; // ����� �Ҵ��� �и� ���������� ���ϴ� �� ����
		System.out.println("num : " + num);

		// Ŭ������ Ÿ���̴�.
//		Test t = new Test();
//		System.out.println(t.iv);

		Test apt = new Test();
		System.out.println("â���� ���� : " + apt.window);

		Test apt2 = new Test(10);
		System.out.println("â���� ���� : " + apt2.window);

		apt2.write();
		apt2.print();

		System.out.println("�ּҰ� : " + apt); // �ּҰ� : Test@15db9742
	}

}