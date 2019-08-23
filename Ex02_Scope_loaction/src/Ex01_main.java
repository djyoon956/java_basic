import kr.or.bit.common.CommonClass;

/*
클래스 == 설계도 == 타입

클래스의 구성요소 : 필드 + 생성자 + 함수
*필드 >> 고유정보 , 상태정보 , 참조정보 
*생성자 >> 필드의 초기화를 목적으로하는 함수
*함수 >> 기능

클래스 , 필드 , 생성자 , 함수 : 범위 정의하기 위해서 (접근자, 한정자 , 수정자)
>> public , private , default , protected (상속에서)

1. public class Test {}

2. class Test{} >> 컴파일러가  내부적으로 default 접근자를 붙인다
   >>>>> default class Test {}
   >>default 쓰지 않는다 .....
   >>default 접근자는 : 같은 폴더 안에서는 접근 가능 , 다른 폴던에 있으면 서버 접근 불가 
   >>default class 언제 사용하는 거지 : 같은 폴더(package)내에서 연습목적으로 ....
  
3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다    (0)
      단 public 은 하나의 class 만 갖는다 (나머지 default ...) 
   
   
ex) 실습
1. kr.or.bit.common 폴더 
   CommonClass >> public class >>
   Ex01_main 과 CommonClass 다른 폴더에 있다
   Ex01_main 클래스에서 >> CommonClass 자원 접근 가능
   why? public 접근자 어디에서나 사용가능

2. kr.or.bit.common 폴더
   Ex01_main 클래스에서 >> DcommonClass 자원 접근 가능
   why? default 접근불가
*/

class Test { // default 접근자 (같은 폴더 안에서만)
	int d_iv; // 컴파일러가 알아서 default int d_iv 해석합니다
	public int p_iv; // 누구나 어디서나 사용가능
	private int pri_iv; // 개인적인 ... 캡슐화구현 ....
}

public class Ex01_main {
	public static void main(String[] args) {
		CommonClass commonClass = new CommonClass();
		commonClass.p_iv = 100; // why ? public int p_iv
		Test tt = new Test();
		tt.d_iv = 200; // 같은 폴더 (default 접근자 접근 가능)
		tt.p_iv = 300; // public 은 폴더와 상관없이 접근 가능
		// tt.pri_iv 접근불가
	}
}
