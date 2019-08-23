//This
//1. 객체 자신을 가르킨다. (앞으로 생성될 객체의 주소를 담을 곳이라고 가정한다.
//2. this 객체 자신(생성자 호출) : 원칙(생성자는 객체 생성시 1개만 호출
//	   예외적으로 this 사용 : 여러개의 생성자를 호출 가능하다.

class Test6 {
	int i;
	int j;

	Test6() {

	}

	//paramter 변수명과 instance 변수명을 다르게 사용하면
	Test6(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class Ex15_This {

}
