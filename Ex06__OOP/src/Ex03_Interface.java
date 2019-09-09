/*
추상 클래스와 인터페이스(표준+약속만 정의)의 공통점
1. 스스로 객체 생성이 불가능하다. (new 키워드 사용 x)
2. 상속, 구현을 통해서만 사용가능 (메모리 적재 가능)
3. 재정의를 통한 강제적 구현 목적

추상클래스와 인터페이스의 차이점
1. 인터페이스는 다중 상속(구현)이 가능하다.
 	>> 하나의 클래스가 여러개의 인터페이스 사용 가능
2. 추상 클래스는 단일 상속이 원칙이다.
3. 추상 클래스(완성된 코드 + 추상 코드)
4. 인터페이스 상수를 제외한 나머지는 추상코드.. JDK8부터는 (Default, Static... 구현)

* 여러개의 약속을 합쳐서 큰 약속을 만들 수 있다.
	>> 인터페이스 간에는 다중 상속이 가능하다.
	
Interface Ib { ... }
Interface Ic { ... }
Interface Id { ... }

Interface If extends Ib,Ic,Id { ... }

* 하나의 클래스가 여러개의 인터페이스 구현 가능하다.

class Test extends Object implements Ib, Ic, Id { ... }
class Test implements Ib, Ic, Id { ... }

**개발자의 입장**
1. 인터페이스를 [다형성] 입장에서 접근(인터페이스  부모타입)
2. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능을 제공 (부모가 동일)
3. 인터페이스는 (~able 할 수 있는)
4. 객체간의 연결 고리 (객체의 소통 역할)

*/

interface Irepairable {
} // 수리 할 수있는

class Unit2 {
	final int MAX_HP;
	int hitPoint; // 에너지

	public Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// 지상 유닛
class GroundUnit extends Unit2 {
	public GroundUnit(int hp) {
		super(hp);
	}
}

// 공중 유닛
class AirUnit extends Unit2 {
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit implements Irepairable {
	public Tank2() {
		super(50);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit {
	Marine2() {
		super(50);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}
}

class CommandCenter implements Irepairable {
	// 다른 방식의 충전
}

class Scv extends GroundUnit implements Irepairable {
	public Scv() {
		super(60);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// 고유 기능
	// repair 기능
	// void repair(Tank2 tank) {
	// if (tank.hitPoint != tank.MAX_HP)
	// this.hitPoint += 5;
	// }
	//
	// void repair(Scv scv) {
	// if (scv.hitPoint != scv.MAX_HP)
	// this.hitPoint += 5;
	// }

	// Marine2는 repair대상이 아니다.
	// void repair(Unit2 unit) {
	// if (unit.hitPoint != unit.MAX_HP)
	// this.hitPoint += 5;
	// }

	// interface 사용으로 해결 : interface Irepairable
	// 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능을 제공 (부모가 동일)
	// 인터페이스도 하나의 데이터 타입이다
	// CommandCenter implements Irepairable
	// Scv extends GroundUnit implements Irepairable
	// Tank2 extends GroundUnit implements Irepairable
	void repair(Irepairable repairUnit) {
		// downCasting : (Tank2)repairUnit, (Scv)repairUnit

		// Command Center >> unit과 다른 방식이다.

		// 요약
		// Tank2 > GroundUnit > Unit2
		// Scv > GroundUnit > Unit2
		// 공통점 : Unit2

		// CommandCenter > Unit2 x
		// > Down casting 불가

		// parameter로 들어온 객체가 Unit2인지 판단한다.
		// >> 객체의 타입 비교 : instanceof 키워드 사용

		if (repairUnit instanceof Unit2) {
			Unit2 unit = (Unit2) repairUnit;
			if (unit.hitPoint != unit.MAX_HP)
				unit.hitPoint = unit.MAX_HP;
		} else {
			// Unit2 부모가 아님
			// CommandCenter
			System.out.println("Unit2 아니예요. Repair 방식이 다릅니다.");
		}
	}
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();

		// 전투
		tank.hitPoint -= 20;
		System.out.println("Tank : " + tank.hitPoint);
		System.out.println("수리 요청");
		scv.repair(tank);
		System.out.println("Tank 수리 완료 : " + tank.hitPoint);

		CommandCenter center = new CommandCenter();
		scv.repair(center);
		// scv.repair(marine); 컴파일 불가
	}
}
