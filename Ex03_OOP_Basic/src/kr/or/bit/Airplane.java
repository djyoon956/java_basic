package kr.or.bit;

/*
 -�䱸����
 1. ����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�.
 2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ� �ִ� Ȯ�� �۾��� �ʿ��մϴ�.
 3.�������� ������� ������� ������� �Ѵ��(����)�� Ȯ�� �� �� �ֽ��ϴ�.
 
 ����� 3�� ���� ���� Ȯ���ϰ� ������� Ȯ��
 
 -����
 ������ ��� ����
*/
public class Airplane {

//	private static int totalCount;
//
//	private String name;
//	private int number;
//
////	public Airplane(String name, int number) { //Constructor
////		this.name = name;
////		this.number = number;
////		totalCount++;
////	}
//
//	public void setAirplane(String name, int number) {
//		this.name = name;
//		this.number = number;
//		totalCount++;
//	}
//
//	public void printAirplaneInfo() {
//		System.out.printf("name : %s, number : %d\n", name, number);
//	}
//
//	public int getTotalAirplaneCount() {
//		return totalCount;
//	}

	private static int totalCount;
	private String name;
	private int number;

	public Airplane(String name, int number) { // Constructor
		this.name = name;
		this.number = number;
		totalCount++;
	}

	public void printAirplaneInfo() {
		System.out.printf("name : %s, number : %d\n", name, number);
	}

	public void getTotalAirplaneCount() {
		System.out.printf("���� ��� : %d\n", totalCount);
	}
}
