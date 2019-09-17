/*
default : 우선순위(5) : Min(1)~Max(10)
*/

class Pth extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("-------------------");
		}
	}
}

class Pth2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("||||||||||||||||||");
		}
	}
}

class Pth3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("***************");
		}
	}
}

public class Ex07_priorty {
	public static void main(String[] args) {
		Pth p1 = new Pth();
		Pth2 p2 = new Pth2();
		Pth3 p3 = new Pth3();

		System.out.println("p1.getPriority() : " + p1.getPriority());
		System.out.println("p2.getPriority() : " + p2.getPriority());
		System.out.println("p3.getPriority() : " + p3.getPriority());

		p1.setPriority(10); // 먼저 end(빈도수로)

		p1.start();
		p2.start();
		p3.start();
	}
}
