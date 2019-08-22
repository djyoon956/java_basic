package kr.or.bit;

/*
 * 함수는 하나의 기능만 구현한다.*
 
함수(Method) : 기능, 행위의 최소 단위
ex) 먹다, 걷는다, 잔다...

클래스의 구성요소 : 필드 + 생성자 + 함수

ex) 게임방 : 게임기(동전 넣는) >> 1번
	 		    캡슐뽑기 (동전 넣고... 무조건 반환) >> 3번
함수의 종류 (4가지)
1. void parameter (o) : void print(String str) { 실행코드 }
2. void parameter (x) : void print(){ 실행코드)
3. return type, parameter (o) : int print (int data) { return 100; }
4. return type, parameter (x) : int print () { return 100; }

* void (돌려주는 것이 없다) : return value가 없다.
* return type : 기본타입  + String + 참조타입(객체의 주소) + 배열 + Collection + Interface
* return type 있으면 반드시 {return 키워드가 존재해야한다.}
* parameter(인자, 인수, 매개변수) : 동전 구멍
* 함수의 이름이나 변수의 이름은 의미있는 단어의 조합으로 구성한다. : getChannelNumber(), getReadNumber()
* 
함수는 반드시 호출(Call) 되어야만 실행한다.

*/

public class Fclass {
	public int data;

	public void m() {
		System.out.println("일반함수  : void, parameter (x)");
	}

	public void m2(int i) {
		System.out.println("parameter value (scope 함수 내부): " + i);
		System.out.println("일반함수 : void, parameter (o) ");
	}

	public int m3() {
		return 100; // return Type 반드시 명시
	}

	public int m4(int i) {
		return i + 1; // return Type 반드시 명시
	}

	// 확장 (parameter 개수의 변화)
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// private (접근자, 한정자)
	// 1. 클래스 내부에서는 의미 없다.
	// 2. 객체 입장에서는 private 보이지 않는다.

	// 클래스 내부에서 다른 함수를 도와줄 목적으로 만드는 경우
	// ex) 출력 전용 함수
	// 공통 함수
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum2(int data) {
		int result = operationMethod(data); // 다른 함수 호출하기
		if (result > 0)
			return 1;
		else
			return -1;
	}

	// Quiz
	// a 와 b 둘중에 큰 값을 리턴하는 함수 생성
	// ex) Max(500,300);
	public int Max(int a, int b) {
		return a > b ? a : b; // 삼항 연산자
	}

	public String Concat(String s, String s2, String s3) {
		String result = s + "/" + s2 + "/" + s3;
		return result;
	}

	// 클래스는 타입이다.
	/*
	 * public int call(){ return 100; } public Tv call(){ return new Tv(); }
	 * 
	 * [Today Point] 클래스는 memory 올려야 사용 할 수 있다. Tv tv= new Tv(); //Tv한대 만들어졌다.
	 * 
	 * public int call(Tv t){...} //t라는 변수는 Tv타입의 주소를 받을 수 있다. public Tv call(){...}
	 * // Tv 타입의 주소값을 리턴한다.
	 * 
	 */

	public Tv objMethod() {
		Tv tv = new Tv(); // Tv 타입의 주소값 return 유일한 방법 new 생성
		tv.brand = "LG";

		return tv;
	}

	public Tv objMethod2() {
		return new Tv();
	}

	public Tv objMethod3(Tv t) {
		return t;
	}

}
