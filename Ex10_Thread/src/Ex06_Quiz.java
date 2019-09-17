import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

class QuizInfo {
	String question;
	String answer;
	boolean result;

	public QuizInfo(String question, String answer, boolean result) {
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

	public String toString() {
		return String.format("문제 : %s\t쓴답 : %s\t채점 : %s", question, answer, result);
	}
}

class Input extends Thread {
	String quiz;
	String result;

	public Input(String quiz) {
		this.quiz = quiz;
	}

	@Override
	public void run() {
		result = JOptionPane.showInputDialog(quiz);
	}
}

class Timer1 extends Thread {
	boolean isEnd;

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
		isEnd = true;
	}
}

public class Ex06_Quiz {
	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<>();
		List<QuizInfo> results = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 9) + 1;
			int num2 = (int) (Math.random() * 9) + 1;
			quiz.put(num1 + "*" + num2, Integer.toString(num1 * num2));
		}

		Timer1 timer = new Timer1();
		timer.start();
		int successCount = 0;
		int failCount = 0;
		for (String key : quiz.keySet()) {
			String input = JOptionPane.showInputDialog(key);
			if (timer.isEnd) {
				System.out.println("시간 초과!");
				break;
			}

			boolean result = input.equals(quiz.get(key));
			if (result) {
				successCount++;
				System.out.println("---------정답---------");
			} else {
				failCount++;
				System.out.println("---------오답---------");
			}

			results.add(new QuizInfo(key, input, result));
		}

		try {
			timer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("게임 종료");

		System.out.println("--------------결과--------------");
		System.out.println("문제 개수 : " + quiz.size() + "개");
		System.out.println("정답 개수 : " + successCount + "개");
		System.out.println("오답 개수 : " + failCount + "개");
	}
}
