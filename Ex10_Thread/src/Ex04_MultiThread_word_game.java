import javax.swing.JOptionPane;

class WordTime extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("남은 시간 :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex04_MultiThread_word_game {
	public static void main(String[] args) {

		WordTime time = new WordTime();
		time.start();

		String inputData = JOptionPane.showInputDialog("값을 입력하세요 :");
		System.out.println("입력값 : " + inputData);
	}
}
