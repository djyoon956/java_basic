package java_doc;

class Task extends Thread {
	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();

		System.out.println(name + " : " + (n1 + n2));
	}
}

public class MakeThreadDemo2 {
	public static void main(String[] args) {
		Task task1 = new Task();
		Task task2 = new Task();

		task1.start();
		task2.start();
		System.out.println("End " + Thread.currentThread().getName());
	}
}
