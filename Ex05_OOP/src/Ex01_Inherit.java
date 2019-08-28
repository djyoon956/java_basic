/*
 OOP특징
 1. 상속
 2. 캡슐화(은닉화)
 3. 다형성
 
 1. 상속
 -java >> child extends Base
 -C#   >> child : Base
 
 2. 상속 특징
 2.1 다중 상속 불가능
 2.2 단일 상속 지원(여러개의 클래스를 상속받으려면, 계층적 상속을 통해서만 가능하다)
 2.3 Interface는 다중상속 가능
 
 3. 상속의미
 진정한 의미 : 재사용성
 단점 : 초기 비용 증가
 
 재사용성 >> 설계 >> 비용(시간, 공통 모듈)
 
 4. 상속 관계에서 memory 순선
 	GrandFather > Father > Child 순으로 heap memory에 올라간다.
 	
 	사용자가 만드는 모든 클래스는 default Object를 상속한다.
 	
*/
class GrandFather { // 최상위 클래스에는 extends Object가 생략되어있다.
	public int gmoney = 5000;
	private int pmoney = 5000;

	public GrandFather() {
		System.out.println("GrandFather Constructor");
	}
}

class Father extends GrandFather {
	public int fmoney = 1000;

	public Father() {
		System.out.println("Father Constructor");
	}
}

class Child extends Father {
	public int cmoney = 100;

	public Child() {
		System.out.println("Child Constructor");
	}
}

public class Ex01_Inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("child.gmoney : " + child.gmoney);
		System.out.println("child.fmoney : " + child.fmoney);
		System.out.println("child.fmoney : " + child.fmoney);
	}
}
