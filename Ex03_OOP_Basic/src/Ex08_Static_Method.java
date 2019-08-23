public class Ex08_Static_Method {

	public static void method() {
		System.out.println("일반");
	}

	public static void smethod2() {
		System.out.println("static");
	}

	public static void main(String[] args) {
		Ex08_Static_Method ex=new Ex08_Static_Method();
		ex.smethod2();
		ex.method();
	}
}
