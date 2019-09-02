
// 게임 : 스타크래프트
// 유닛(unit)

// unit 공통 기능 (이동 좌표, 이동, 멈춘다)
// unit 이동 방법이 다르다.

//abstract class 이른 { abstract method 강제 구현 }

abstract class Unit {
	int x;
	int y;

	void stop() {
		System.out.println("Unit stop");
	}

	// Override 가능하지만 강제성이 없다.
//	void move() {
//		System.out.println("Unit 이동 : " + x + "," + y);
//	}

	// Override 강제성이 있다.
	abstract void move(int x, int y);
}

class Tank extends Unit {
	// 시저모드...
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동 : " + this.x + "," + this.y);
	}

	void changeMode() {
		System.out.println("Tank Change");
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동 : " + this.x + "," + this.y);
	}

	void stimpack() {
		System.out.println("스팀팩 기능");
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip : " + this.x + "," + this.y);
	}

	void load() {
		System.out.println("Unit load");
	}

	void unLoad() {
		System.out.println("Unit unLoad");
	}
}

public class Ex02_Abstract {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500, 200);
		tank.stop();
		tank.changeMode();

		Marine marine = new Marine();
		marine.move(500, 300);
		marine.stimpack();
		marine.stop();

		// 1. Quiz 탱크 3대를 만들고, [같은 좌표]로 이동시킨다.
		Tank[] tanks = { new Tank(), new Tank(), new Tank() };
		for (Tank t : tanks)
			t.move(100, 100);
		System.out.println("------------------------");

		// 2.여러개의 Unit(Tank, Marine, DropShip) [같은 좌표]로 이동시킨다.
		Unit[] units = { new Tank(), new Marine(), new DropShip() };
		for (Unit u : units)
			u.move(200, 200);
	}
}
