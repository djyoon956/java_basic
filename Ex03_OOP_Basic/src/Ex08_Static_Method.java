public class Ex08_Static_Method {

	public static void method() {
		System.out.println("�Ϲ� �Լ� ȣ��");
	}

	public static void smethod2() {
		System.out.println("static �Լ� ȣ��");
	}

	public static void main(String[] args) {
		Ex08_Static_Method ex=new Ex08_Static_Method();
		ex.smethod2();
		ex.method();
	}
}
