import kr.or.bit.Airplane;

class InitTest {
	static int cv = 1;

	int iv = 1;

	static { // static 초기자 : static 변수 초기화
				// cv를 method 영역에 올린 후
				// stack영역에서 static{} 실행
				// - 변경점
				// >> cv=0 => main 영역 진입시 초기값
				// >> cv=1 => 할당시
				// >> cv=2 => static 초기화 진입시 변경
		cv = 2;
	}

	{ // instance 초기자 : instance 초기화
		// new InitTest()가 실행되는 시점에 실행된다.
		iv = 2;
	}
}

public class Ex06_Static_Airplane {

	public static void main(String[] args) {

		InitTest initTest = new InitTest();
		System.out.println(initTest.cv);

		Airplane airplane1 = new Airplane();
		airplane1.setAirplane("비행기", 1);
		airplane1.printAirplaneInfo();

		Airplane airplane2 = new Airplane();
		airplane2.setAirplane("비행기", 2);
		airplane2.printAirplaneInfo();

		Airplane airplane3 = new Airplane();
		airplane3.setAirplane("비행기", 3);
		airplane3.printAirplaneInfo();

		System.out.printf("누적 대수 : %d\n", airplane1.getTotalAirplaneCount());
	}
}
