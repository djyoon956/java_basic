import kr.or.bit.Pclass;

/*
public, protected, private

상속 관계에서 [protected]
양면성  : (default / pulbic)
상속이 없는 protected 접근자는 default와 같다.

*/

class Child2 extends Pclass {
	void method() {

	}
}

class Dclass {
	private int o;
	public int j;
	int p;
	protected int k;
}

public class Ex08_inherit_protected {
	public static void main(String[] args) {

		Pclass p = new Pclass();
		Child2 c = new Child2();
	}
}
