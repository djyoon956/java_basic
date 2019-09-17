
/*
데몬(보조) Thread
한글 작업시 3초 작업 내용 저장
한글 작업 종료하면 3조 저장도 끝나야한다.
*/
public class Ex08_Demon_Thread implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread thread = new Thread(new Ex08_Demon_Thread());
		thread.setDaemon(true); // 해당 thread는 main thread의 보조
		thread.start();

		for (int i = 0; i <= 30; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Main Thread 동작 : " + i);
			if (i == 5) {
				System.out.println("i : " + i);
				autoSave = true;
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}
			if (autoSave)
				autoSave();
		}
	}

	public void autoSave() {
		System.out.println("문서가 3초 간격으로 자동 저장되었습니다.");
	}
}
