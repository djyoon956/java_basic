package kr.or.bit;

// 공통 : 새는 날 수 있다. 새는 빠르다.

public class Bird {
	public void fly() {
		System.out.println("i am flying");
	}

	protected void moveFast() { // 재정의를 해주었으면 하는 바램
		fly();
	}
}