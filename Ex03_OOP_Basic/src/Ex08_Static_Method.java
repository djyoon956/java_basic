public class Ex08_Static_Method {

	public static void method() {
		System.out.println("일반 함수 호출");
	}

	public static void smethod2() {
		System.out.println("static 함수 호출");
	}

	public static void main(String[] args) {
		Ex08_Static_Method ex=new Ex08_Static_Method();
		ex.smethod2();
		ex.method();
	}
}
