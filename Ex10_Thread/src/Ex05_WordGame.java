import javax.swing.JOptionPane;

/*
문제
main Thread를 제외한 Thread를 두개 만드세요
1개는 시간 제어 기능 (Timer)
2 단어 입력을 처리하는 기능

main 에서 2개 실행

단어를 하나라고 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요.
hint) 공유 자원

Thread 상태 정보

join() : thread에 종료를 기다린다.
		  ex) 계산 작업을 하는 스레드가 모든 계산을 마쳤을 때 그 결과값을 
*/

class Timer extends Thread {

	@Override
	public void run() {
		for (int i = Ex05_WordGame.time; Ex05_WordGame.time > 0; Ex05_WordGame.time--) {
			System.out.println("남은 시간 :" + Ex05_WordGame.time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---타이머 종료---");
	}
}

class Word extends Thread {
	@Override
	public void run() {
		String inputData = JOptionPane.showInputDialog("값을 입력하세요 :");
		Ex05_WordGame.time = 0;
		System.out.println("입력값 : " + inputData);
	}
}

public class Ex05_WordGame {
	static int time = 10;

	public static void main(String[] args) {
		Timer timer = new Timer();
		Word word = new Word();
		timer.start();
		word.start();

		try {
			timer.join();
			word.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main end...");
	}
}
