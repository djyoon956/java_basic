package kr.or.bit;

/*
 -요구사항
 1. 비행기를 생상하고 비행기의 이름과 번호를 부여해야 합니다.
 2.비행기가 생산되면 비행기의 이름과 번호 맞게 부여되어 있는 확인 작업이 필요합니다.
 3.공장장은 현재까지 만들어진 비행기의 총대수(누적)을 확인 할 수 있습니다.
 
 비행기 3대 생산 정보 확인하고 누적대수 확인
 
 -조건
 생성자 사용 금지
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
		System.out.printf("누적 대수 : %d\n", totalCount);
	}
}
