package kr.or.bit;

public class Computer {
	boolean power;
	boolean sleepMode;

	public void Input(String str) {
		System.out.printf("Input : %c\n", str);
	}

	public void Output(String str) {
		System.out.printf("Output : %c\n", str);
	}

	public void PowerOff() {
		power = false;
	}

	public void PoweOn() {
		power = true;
	}

	public void SleepModeOff() {
		sleepMode = false;
	}

	public void SleepModeOn() {
		sleepMode = true;
	}

}
