
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("main Tread start");
		worker();
		worker2();
		System.out.println("main Tread end");
	}

	static void worker() {
		System.out.println("1 worker");
	}

	static void worker2() {
		System.out.println("2 worker");
	}
}
