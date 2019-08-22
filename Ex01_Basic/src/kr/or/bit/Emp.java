package kr.or.bit;
// 라인 주석
/*
만든이 : 홍길동
날짜 : 2019-08-05
설명 : 이 파일은 참조 파일입니다.

class는 설계도이다. 쪼갤 수 없는 것은 또 쪼갠다.
설계도 기본적인 구성요소(상태정보(속성):변수 + 행위정보(기능):함수)

자동차 설계도 >>
상태정보(속성) : 백미러, 엔진, 타이어, 창문, 핸들, 속도 >> 변수 >> int speed = 0
고유정보(속성)
행위정보(기능) : 달린다, 멈춘다, 속도를 높인다 등 >> 함수 >> public void speedUp(){++speed}

엔진 설계도 : 톱니바퀴, 고무줄, 기름 등 
*/
public class Emp { //사원이라는 설계도
	public int empno; //사원은 사번을 가지고 있다.(사번은 숫자 데이터이다.)
	//변수 -> 정보(고유정보) -> member field -> instance variable
	
	public String ename; //이름
	public String job; //직종
	
	private int data; //private 사용으로 직접할당 막고 간접할당 시킨다.
	
	//특수한 목적 : 캡슐화 된 자원에 대해 set, get >> setter 함수, getter 함수
	public int getData() { //기능(행위정보) >> method
		return data;
	}
	public void setData(int input) {
		if(input < 100) {
			this.data = input;
		}else {
			this.data = 0;
		}
	}
	//잘 짜여진 코드 = 가독성이 좋다(변수명, 함수명)


	//행위정보(기능) : 함수(method)
	//함수는 반드시 호출에 의해서 동작을 한다.
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job;
	}
}