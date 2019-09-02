import kr.or.bit.Emp;

class Test2 {
	void print() {
		System.out.println("부모함수 (test2)");
	}
}

class Test3 extends Test2 {
	@Override
	void print() {
		System.out.println("자식 함수 (test3)");
	}

	// overloading
	void print(String s) {

	}
}

public class Ex05_inherit_override {
	public static void main(String[] args) {
		Emp emp = new Emp(7788, "홍길동");
		System.out.println(emp.toString());
		System.out.println(emp);
	}
}
