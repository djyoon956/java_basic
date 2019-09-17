/*
동기화

*/

class Wroom {
	synchronized public void openDoor(String name) {
		System.out.println(name + "님 화장실 입장^^");
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "님 사용 : " + i);
			if (i == 10)
				System.out.println(name + "님 끙!!");
		}
		System.out.println("시원하다^^!");
	}
}

class User extends Thread {
	private Wroom wr;
	private String who;

	User(String who, Wroom wr) {
		this.who = who;
		this.wr = wr;
	}

	@Override
	public void run() {
		wr.openDoor(who);
	}
}

public class Ex10_Sync_Thread {
	public static void main(String[] args) {
		Wroom wroom = new Wroom();
		User u1 = new User("김", wroom);
		User u2 = new User("이", wroom);
		User u3 = new User("박", wroom);

		u1.start();
		u2.start();
		u3.start();

	}
}
