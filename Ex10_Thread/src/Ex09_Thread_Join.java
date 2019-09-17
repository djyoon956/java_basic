/*
join() 
	복잡한 계산을 여러개의 쓰레드로 나눌때
	각각의 스레드에 만든 결과를 취합 할 때
*/

class Thred_Join extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.println("---------------------");
	}
}

class Thred_Join2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.println("||||||||||||||||||||||");
	}
}

public class Ex09_Thread_Join {
	public static void main(String[] args) {
		Thred_Join t1 = new Thred_Join();
		Thred_Join2 t2 = new Thred_Join2();

		t1.start();
		t2.start();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++)
			System.out.println("^^^^^^^^^^^^^");

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 3개의 Thread 총 작업 시간
		System.out.println("3개의 Thread 총 작업 시간");
		System.out.println("startTime : " + startTime);
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println("Main End");
	}
}
