//1. Ex02_variable 클래스
//2. 특수한 main 함수를 가지고 있는 클래스
//3. static void main(String[] args) = 프로그램의 시작점 또는 진입점

//4. main 함수가 없는 클래스 (lib) = 다른 클래스를 도와주는 클래스

//Tip) C#은 static void Main(String[] args) m M 차이

//변수 : variable
//변수 scope (유효범위) : 선언되는 위치
//1. instance variable : 객체변수 class Test {int age}  초기화 안해도 됨
//2. local variable    : 지역변수 (함수안에 있는 변수) class Test{public void run(){int age}} 초기화 필수
//2.1 함수 안에 if 블록, for 블록 안에 있는 변수도 지역변수이지만 scope는 자신의 블록 까지만
//3. static variable   : 공유변수(자원) : 객체간 공유자원

//원칙 : 하나의 java 파일은 하나의 클래스를 갖는다. Test.java >> class Test {}
//연습용 : 하나의 java파일 안에 여러개의 클래스를 만들어 사용 가능 (단, class중에 하나만 public을 가진다.)

//class는 설계도이다. == class는 Type이다.(작은 여러개의 타입을 가지고 있는 큰 타입)
class Test {
	int iv = 500;
	// instance variable
	// 이 변수는 초기화 하지 않아도 된다.(기본 값 : default)를 가지고 있다.
	// Why 초기화를 하지 않아도 사용 가능? (설계도 하나로 여러개의 아파트 짓지만 창문의 개수는 다를 수도 있다.
	// 답) 객체마다 다른 값을 가질 수 있기 때문이다.

	int window; // default 값은 0

	Test() { // 클래스 이름으로 함수 만드는 것을 생성자(Constructor)라고 함
		// 목적 : member fiedl 초기화 //객체 생성과 동시에 호출

	}

	Test(int data) { // 오버로딩(overloading) : 하나의 이름으로 여러가지 기능을 수행
		window = data;
	}

	void write() {
		int num = 100; // 지역변수
						// 함수가 호출되면 그때 메모리에 생성되고 함수가 종료되면 메모리에서 사라진다.(num)
		iv = 6666;
	}

	void print() {
//			System.out.println(num); 이거 안됨 (print 함수 실행시 num 존재하지 않는다.)
		System.out.println("Test.iv : " + iv);
	}
}

public class Ex02_variable {

	public static void main(String[] args) {
		int lv = 500; // local variable
		System.out.println("lv 변수 값 : " + lv);
		// 실행(javac로 컴파일하고 java Ex02_variable) ctrl f11

//		int number; //선언 
//		//초기화를 하지 않은 변수를 사용할 경우 에러 발생
//		System.out.println(number);
//		초기화 하자!

		int number = 0;
		System.out.println("초기화 number : " + number);
		// 1. 지역변수는 반드시 초기화 하고 사용해야 한다.(초기화 = 처음값을 입력하는 것)
		// 2. 약속 (함수 안에 있는 변수는 반드시 초기화)

		int num; // 선언
		System.out.println("졸려요");
		System.out.println("나두 졸려요");
		num = 200; // 선언과 할당은 분리 가능하지만 안하는 게 좋음
		System.out.println("num : " + num);

		// 클래스도 타입이다.
//		Test t = new Test();
//		System.out.println(t.iv);

		Test apt = new Test();
		System.out.println("창문의 개수 : " + apt.window);

		Test apt2 = new Test(10);
		System.out.println("창문의 개수 : " + apt2.window);

		apt2.write();
		apt2.print();

		System.out.println("주소값 : " + apt); // 주소값 : Test@15db9742
	}

}