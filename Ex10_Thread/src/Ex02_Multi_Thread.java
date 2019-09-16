/*
Thread : 프로세스에서 하나의 최소 실행 단위(Method)
 Thread 생성 방법
 1. Thread 클래스 상속-> class Test extends Thread { }
 	[반드시] run() 함수 재정의
 	Thread 일반 클래스 : Thread 스스로 객체 생성 가능
 2. implements Runnable 구현 -> class Test implements Runnable { }
 	[반드시] run() 함수 구현
 	Test 클래스는 Thread일까요?? (x) -> Thread th = new Thread(new Test());
	
 why?
 
*/

class Thread_1 extends Thread {
	@Override
	public void run() { // main과 같은 역할 , 새로우 stack에 처음 올라가는 함수
		for (int i = 0; i < 1000; i++)
			System.out.println(this.getName() + " : " + i);
		System.out.println(this.getName() + "END");
	}
}

class Thread_2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++)
			System.out.println("Thread_2 : " + i);
		System.out.println("Thread_2 END");
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		Thread_1 t = new Thread_1();
		t.start(); // stack 생성하고 run함수 올려놓기

		for (int i = 0; i < 1000; i++)
			System.out.println("main : " + i);

		Thread t2 = new Thread(new Thread_2());
		t2.start();
		
		System.out.println("main End");
	}
}
