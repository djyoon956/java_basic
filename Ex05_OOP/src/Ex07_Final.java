/*
변수 <-> 상수
상수 : 한번 값이 초기화되면 변경 불가
상수 자원 : 고유값(주민번호, 시스템 고유 번호, 수학적인 값 Pi...)
상수는 관용적으로 대문자로 표현한다.

java : final int NUM=10;

final 키워드
클래스 앞에 : 상속 불가  
>>final class Car { } >> Math
함수 앞에 : 상속관계에서 재정의 불가
>> public final void print() { } 
*/

// Vcard 타입으로 만든 모든 객체는 KIND값이 고정되어있나요?
// 카드 10장 >> KIND >> "heart"
// 1o장의 카드가 다른 상수값을 가지면 안돼나요?
// 생성자에서 정의한다
class Vcard {
	final String KIND = "heart";
	final int NUM = 10;

	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2 {
	final String KIND;
	final int NUM;

//	Vcard2() {
//		this.KIND = "heart";
//		this.NUM = 10;
//	}

	Vcard2(String kind, int num) {
		// 객체마다 상수값을 줄 수 있다.
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		System.out.println("vcard.KIND : " + vcard.KIND);
		System.out.println("vcard.NUM : " + vcard.NUM);
		vcard.method();

		Vcard2 c2 = new Vcard2("spade", 1);
		System.out.println(c2.toString());
		
		Vcard2 c3 = new Vcard2("heart", 1);
		System.out.println(c3.toString());
	}
}
