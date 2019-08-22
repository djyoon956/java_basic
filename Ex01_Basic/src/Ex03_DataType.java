/*
 1. 자바는 시스템에서 기본 8가지 타입 제공(자료형)
 2. 8가지 기본 타입은 값을 저장하는 타입
 3. 숫자 -> 정수(음의 정수, 0, 양의 정수) -> byte(-128~127)
 								  -> char(한 문자를 표현하는 자료형)
 								  >>한문자(2Byte) >> 한글 1자 2byte, 영문자, 특수, 공백도 다 2byte
 								  >>unicode 형식이라 부름
 								  ->short
 								  ->int(-21억 ~ 21억) : **java 정수의 연산 기본 타입(4byte)**
 								  ->long(8byte) : int보다 큰 값
 				->실수(부동소수점) ->float(4byte) , double(8byte)
 				->정밀도(표현 범위가 크다) >> double **java 실수 연산 기본은 double**
 		논리형 -> 참, 거짓 -> boolean >> 프로그램 논리의 흐름 제어
 		
 		궁금한점 : 문자열의 표현 ??? >> 홍길동, hello 등
 		String은 참조타입(클래스) >> String s = new String("안녕");
 		ex) String str= "홍길동";
 		일단 그냥 int나 double처럼 사용하세요
 		
 		자바는 크게
 		1. 값 타입 >> 숫자, 논리 등 8가지
 		2. 참조 타입 >> 클래스, 배열등 >> 변수에 주소값을 담는 것이다.
 		2.1 class == 설계도 == Type
 		
 */

class Car { // Car라는 Type : 설계도
	String color;
	int window;
}

public class Ex03_DataType {

	public static void main(String[] args) {
		Car c = new Car();
		// c 변수는 car라는 타입을 갖고 있다.
		// c 는 주소값을 가지고 있다. (참조 변수)
		System.out.println("c라는 변수의 값 : " + c); // Car@15db9742 주소값 : 클래스명 + @ + 주소

		Car c2; // 선언
		c2 = new Car(); // 주소값 할당
		System.out.println("c2라는 변수의 값 : " + c2);

		Car c3 = c; // 주소값 할당
		System.out.println(c + ":" + c3);
		System.out.println(c == c3);
		c3.color = "black";
		System.out.println(c.color + ":" + c3.color);

		// 값 타입 (8가지 + String)
		int i = 200; // 선언과 할당
		System.out.println("i라는 변수의 값 : " + i);

		int j; // 선언
		j = 1000;// 할당(초기화)

		int a, b; // 각각 초기화
		a = 10;
		b = 20;

		int k = 1111;
		int k2 = k; // 값 할당
		System.out.println("k2 : " + k);
		k2 = 2222;
		System.out.println("변경 후 k2 : " + k2);
		// **Today Point**//
		// int(-21억~21억)
		// int p = 2200000000; 빨간줄 생김
		// long p = 2200000000; 숫자 리터럴이 int라서 안됨(강제가 필요하다 접미사 L필요)
		long p = 2200000000L; // 숫자 범위는 일단 int기준이다.
		System.out.println(p);

		// char : 2byte(정수 값)
		// 한 문자를 표현하는 자료형
		// 일반적
		// 1. 한글한자 >> 2byte
		// 2. 영문자, 공백, 특수문자 >> 1byte
		// 한글, 영문 모두 2byte로 표현(unicode)
		// 아스키 코드표를 기준으로 확인

		// java 문자열 : "가", String str = "홍길동", String str = "fjdaskfljsadf"
		// java 문자 : '가', char c = 'A';
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		// 저장하고 있는 정수값...
		// casting 타입 변환
		int intch = 'A'; // 내부적으로 암시적 형변환이 일어남
		System.out.println(intch);
		System.out.println((int) ch); // type casting //기준은 아스키 코드표

		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int) ch2);

		int intch2 = 65; // ***************값을 보지 말고 Type을 보자***************
		char ch3 = (char) intch2; // *******강제적(명시적) 형변환*********(큰것을 작은것으로 옮길때는 데이터 손실이 발생할 수 있음)
		System.out.println(ch3);
		System.out.println(intch2);

		int intch3 = ch3;// 암시적 형변환
		// int intch3=(int)ch3; //작은것을 큰것으로 자동변환 굳이 int 붙일 필요 없음
		System.out.println(intch3);
		// Today Point
		// 1. 변수가 가지고 있는 값을 보지 말고 변수의 Type을 보자!!!!!!!!!!!!!!!!!!!!!
		// 2. 변수의 타입 크기를 확인하자
		// 3. 큰타입에는 작은 타입 값을 넣을 수 있다.
		// 4. but, 작은타입에는 큰 타입을 넣을 수 없다.
		// char <- int >>> char <- (char)int
		// int <- char 가능(내부적으로 변환) >>> int <- (int)char

		// 버려지는 값이 생길 수 있다. (주의하자.)
		int intvalue = 1908094;
		byte bytevalue = (byte) intvalue;
		System.out.println(bytevalue); // 쓰레기값이 발생.....

		// String (문자열) 타입으로 보자
		// String 값 타입이 아니고 클래스 타입(사실은 new를 통해서 메모리에 올리고 사용)
		// 원칙 : String str = new String("홍길동");
		// POINT : String 은 그냥 일반 타입처럼 사용한다.

		String str = "hello world";
		System.out.println(str);

		String str2 = str + "월요일"; // DB(oracle + 연산자(산술만함), 결합 연산자 ||)
		System.out.println(str2); // 'hello world' || '월요일'
		// Tip) java에서 특수문자 사용하기
		// 문자를 인지시키기 위해서 \사용한다
		char sing = '\'';
		System.out.println(sing);

		// 홍"길"동 이라는 문자열 출력
		String name = "홍\"길\"동";
		System.out.println(name);

		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result);

		System.out.println("100" + 100 + 20);// 문자열이 하나라도 있으면 문자열이 이김
		System.out.println(100 + "100" + 20);
		System.out.println(100 + 100 + "20");
		System.out.println(100 + (100 + "20"));

		// C:\Temp 문자열로 출력
		String path = "C:\\temp"; // \t:탭 \n:new line
		System.out.println(path);

		// 실수(부동소수점)
		// float(4byte)
		// double(8byte) : *****실수의 기본타입(리터럴)은 double(정밀도가 높다.=소수이하 자리수 표현 더많이함)*****

		float f = 3.14F; // 모든 실수는 double 타입 >> 3.14라는 리터럴 값은 double
							// float 타입의 리터럴 f,F
		float f2 = 1.123456789f; // 대략 7자리 반올림처리
		System.out.println(f2);
		double d = 1.123456789123456789; // 대략 16자리표현 반올림처리
		System.out.println(d);

		// Quiz
		byte q = (byte) 128;
		System.out.println(q); // 수의 범위가 넘어가면 한바퀴 돈다

		double d2 = 100; // 암시적 형변환 double d2=(double)100;
		System.out.println(d2);

		// Quiz
		double d3 = 100;
		int i5 = 100;

		// int result2=d3+i5; int = int + double;
		// 1. double result2=d3+i5; 데이터 손실이 없다
		// 2. int result2=(int)d3+i5; 큰타입을 작은 타입으로 변경하는 것은 데이터 손실이 발생할 수 있다
		// 3. int result2 = (int)(d3+i5); 데이터 손실이 있을 수 있다
		// Today Point
		// 작은타입 + 큰타입 >> 큰타입
		// 타입간 변환 >> 변수가 가지는 값을 보지 말고 변수의 타입을 보고 판단하자
		// 명시적 형변환(casting) (int)
		int i6 = 100;
		byte b2 = (byte) i6;//명시적 형변환
		System.out.println(b2);
		
		byte b3=20;
		int i7=b3;
		System.out.println(i7); //컴파일러가 내부적으로 (int)b3 생성 = 암시적 형변환
		
		// 각각 타입에 대해서 (2진수, 8진수 등 틈틈이)
	}

}
