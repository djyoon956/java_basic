package kr.or.bit;

public class Car {
	private int window;
	private int speed;

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// 간접 할당의 장점
		if (speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}

	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		if (speed > 0)
			speed -= 10;
		else
			speed = 0;
	}
}
