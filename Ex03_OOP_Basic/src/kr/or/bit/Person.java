package kr.or.bit;

//class == 설계도 == Type
//설계도는 구체화(메모리에 올려서)를 통해서 객체로 생성되어야 한다.
//구체화된 것을 >> 객체, 인스턴스
// 설계도가 가지는 기본적인 구성요소 (필드+생성자+함수)
//class Tire { }
//class Car{  Tire tire; }
public class Person {
	public String name; // instance variable (default값을 가지고 있다.)
	public int age;

	public void print() { // method
		System.out.println(name + " / " + age);

	}
}
