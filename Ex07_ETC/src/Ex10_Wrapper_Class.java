import java.util.ArrayList;

/*
8가지 기본 타입 제공(값 타입) : JAVA API

Wrapper Class
-8가지 기본 타입에 대해서 객체 형태로 사용 가능하도록 만든것

기본 타입 때로는 객체 형태로 다루어져야하는 경우
1. 매개 변수로 객체가 요구 될 때
2. 기본값이 아닌 객체로 저장되어야 할 때
3. 객체 간의 비교가 필요할 때

*/
public class Ex10_Wrapper_Class {
	public static void main(String[] args) {
		// Integer.parseInt(s);
		// ArrayList<Integer> // Generic 값 타입 대입 불가
		Integer n = new Integer(500);
		System.out.println("n : " + n.toString()); // Integer 내부에서 toString 재정의(값이 출력 되도록)

		// Point (Wrapper Class 활용)
		// parameter로 값 타입이 객체로 사용될 때,
		// Generic 사용시

		System.out.println("----------------------");
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		for (int value : li)
			System.out.println(value);

		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println("i2 == i3 : " + (i2 == i3)); // false
		System.out.println("i2.equals(i3) : " + i2.equals(i3)); // true

		Integer t = new Integer(500);
		integerMethod(t); // 참조 변수의 주소값
		intMethod(t); // 참조 변수가 가지는 값
	}

	static void integerMethod(Integer i) {
		System.out.println("Integer parameter : " + i);
	}

	static void intMethod(int i) {
		System.out.println("int parameter : " + i);
	}
}
