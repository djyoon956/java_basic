import java.util.function.IntPredicate;

/*
객체지향언어
1. 상속 (재사용성)
2. 캡슐화 (private) -> 함수 (read , write): 간접할당(자원보호)  -> 캡슐화된   member field
   read(get) , write(set) 전용함수  -> setter , getter -> 약속   getEmpno, setEmpno
3. 다형성 

[다형성 하는 녀석 한 부분 ....]

[method overloading ]
하나의 이름으로 여러가지 기능을 하는 함수 
사용: System.out.println()
특징: 오버로딩은 성능 향상에 도움을 준다(x)
     why> 편하게 사용할려고    >> 개발자
          고민(설계도 어떤 점을 생각하면) >> 함수의 활용이 많은 경우 ( 다양한  parameter  사용)
     ^^ static 함수  why ....

문법: 함수의 이름은 같고   parameter 의 [개수]와 [타일]을 달리하는 방법
1.함수의 이름은 같아야 한다
2.[parameter] 개수 또는 [Type] 은 달라야 한다
3.return type overloading 판단기준( x )
4. parameter 순서가 다름을 인정한다          

*/

class Human {
	String name;
	int age;
}

class OverTest {
	void add(Human h) { // 개수는 같지만 Type 틀리면 인정
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println("parameter h �ּҰ� :" + h);
	}

	int add(int i) {
		return i + 100;
	}

	String add(String s) {
		return "Hello" + s;
	}

	int[] add(int[] param) { // 주소값(int[] 참조 주소값)
		int[] target = new int[param.length];
		for (int i = 0; i < param.length; i++) {
			target[i] = param[i] + 1;
		}

		return target;
	}

	int[] add(int[] so, int[] so2) {
		so = so2;
		return so;
	}
}

public class Ex11_Method_Overloading {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
//		System.out.println(ot.add(100));
//		System.out.println(ot.add("100"));
//		Human m = new Human();
//		System.out.println("m �ּҰ� :" + m);
//		ot.add(m);
//		System.out.println(m);

		// Array parameter로 또는 return type으로 사용
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = ot.add(source);
		System.out.println(source == target);

		// 개선된 for문
		for (int value : target)
			System.out.println(value);

		int[] so = { 10, 20, 30 };
		int[] ta = { 11, 21, 31 };
		int[] ta2 = ot.add(so, ta);
		System.out.println();
	}
}
