/*
객체지향언어
1. 상속(재사용)
2. 캡슐화 (private) -> 함수(read, write) : 간접할당(자원보호) -> 캡슐화된 member field에 대해서 read(get), write(set) 전용 함수 -> setter, getter -> 자동생성이용한다.
3. 다형성 

[다형성 한 부분...]

[Method overloading]
하나의 이름으로 여러가지 기능을 하는 함수
ex) System.out.println()
특징 : overloading은 성능 향상에 도움을 주지 않는다.
		why> 편하게 사용하려고... >> 개발자
		설계도를 생각하면 >> 함수의 활용이 많은 경우 (다양한 parameter을 사용하는 경우)
*/

class OverTest {

	int add(int i) {
		return i + 100;
	}

	int add(int i, int j) {
		return i + j;
	}
}

public class Ex11_Method_Overloading {
	public static void main(String[] args) {

	}
}
