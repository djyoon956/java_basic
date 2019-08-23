
import kr.or.bit.Airplane;

class InitTest {
	static int cv = 1;

	int iv = 1;

	static {
		cv = 2;
	}

	{
		iv = 2;
	}
}

public class Ex06_Static_Airplane {

	public static void main(String[] args) {

//		InitTest initTest = new InitTest();
//		System.out.println(initTest.cv);
//
//		Airplane airplane1 = new Airplane();
//		airplane1.setAirplane("�����", 1);
//		airplane1.printAirplaneInfo();
//
//		Airplane airplane2 = new Airplane();
//		airplane2.setAirplane("�����", 2);
//		airplane2.printAirplaneInfo();
//
//		Airplane airplane3 = new Airplane();
//		airplane3.setAirplane("�����", 3);
//		airplane3.printAirplaneInfo();
//
//		System.out.printf("���� ��� : %d\n", airplane1.getTotalAirplaneCount());
//
//		Airplane airplane1 = new Airplane("�����", 1);
//		airplane1.printAirplaneInfo();
//		Airplane airplane2 = new Airplane("�����", 2);
//		airplane2.printAirplaneInfo();
//		Airplane airplane3 = new Airplane("�����", 3);
//		airplane3.printAirplaneInfo();
//		airplane1.getTotalAirplaneCount();

	}
}
