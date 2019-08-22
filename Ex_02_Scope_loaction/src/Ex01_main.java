import kr.or.bit.common.CommonClass;

/*
클래스 == 설계도 == 타입

클래스의 구성 요소 : 필드 + 생성자 + 함수
- 필드 >> 고유 정보, 상태 정보, 참조 정보
- 생성자 >> 필드의 초기화를 목적으로하는 함수
- 함수 >> 기능

클래스, 필드, 생성자, 함수 :  범위 정의하기 위해서 (접근자, 한정자)
>> public, private, default, protected(상속)
1. public class Test{...}  
2. class Test{...} >> 내부적으로 컴파일러가 default 접근자로 해석
	- default class Test{...} >> default 생략가능 하므로 생략한다.
	- default 접근자 : 같은 폴더 안에서는 접근이 가능, 다른 폴더면 접근 불가하다.
	
ex) 실습
1. kr.or.bit.common.CommonClass
	CommonClass >> public class 
	Ex01_main과 CommonClass  다른 패키지 이다.
	Ex01_main >> CommonClass 접근가능한가? >>YES
	why? ) public 접근자는 어디서든 접근가능하다.
	
2. kr.or.bit.common.DcommonClass
	Ex01_main >> DcommonClass 접근가능한가? >>NO
	why? ) default 접근 불가. 같은 패키지 안에서는 접근 가능, 다른 패키지면 접근 불가
	>> default class 사용 >> 같은 폴더(package)내에서 연습 목적으로 사용
	
3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.
	단 public은 하나의 class만 갖는다(나머지는 default..)
*/

class Test { // default 접근자 (같은 폴더 안에서만...)
	int d_iv; // default 접근자
	public int p_iv; // 전체 접근가능
	private int pri_iv; // 개인적인....캡슐화 구현
}

public class Ex01_main {
	public static void main(String[] args) {
		CommonClass commonClass = new CommonClass();
		commonClass.p_iv = 100; // public 접근자여서 접근 가능
		Test test = new Test();
		test.d_iv = 100; // 같은 폴더이기 때문에 default 접근자에 접근 가능
		test.p_iv = 100; // public은 패키지와 상관없이 접근가능
	}
}
