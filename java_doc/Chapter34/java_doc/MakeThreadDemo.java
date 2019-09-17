package java_doc;

public class MakeThreadDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};

		Thread t = new Thread(task);
		// Thread t = new Thread(task, "task name 1"); // 두번째 파라미터 값으로 Thread name을 직접 지정할 수 있다.
		t.start();

		System.out.println("End " + Thread.currentThread().getName());
	}
}
