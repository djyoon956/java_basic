package kr.or.bit;

/*
 * �Լ��� �ϳ��� ��ɸ� �����Ѵ�.*
 
�Լ�(Method) : ���, ������ �ּ� ����
ex) �Դ�, �ȴ´�, �ܴ�...

Ŭ������ ������� : �ʵ� + ������ + �Լ�

ex) ���ӹ� : ���ӱ�(���� �ִ�) >> 1��
	 		    ĸ���̱� (���� �ְ�... ������ ��ȯ) >> 3��
�Լ��� ���� (4����)
1. void parameter (o) : void print(String str) { �����ڵ� }
2. void parameter (x) : void print(){ �����ڵ�)
3. return type, parameter (o) : int print (int data) { return 100; }
4. return type, parameter (x) : int print () { return 100; }

* void (�����ִ� ���� ����) : return value�� ����.
* return type : �⺻Ÿ��  + String + ����Ÿ��(��ü�� �ּ�) + �迭 + Collection + Interface
* return type ������ �ݵ�� {return Ű���尡 �����ؾ��Ѵ�.}
* parameter(����, �μ�, �Ű�����) : ���� ����
* �Լ��� �̸��̳� ������ �̸��� �ǹ��ִ� �ܾ��� �������� �����Ѵ�. : getChannelNumber(), getReadNumber()
* 
�Լ��� �ݵ�� ȣ��(Call) �Ǿ�߸� �����Ѵ�.

*/

public class Fclass {
	public int data;

	public void m() {
		System.out.println("�Ϲ��Լ�  : void, parameter (x)");
	}

	public void m2(int i) {
		System.out.println("parameter value (scope �Լ� ����): " + i);
		System.out.println("�Ϲ��Լ� : void, parameter (o) ");
	}

	public int m3() {
		return 100; // return Type �ݵ�� ���
	}

	public int m4(int i) {
		return i + 1; // return Type �ݵ�� ���
	}

	// Ȯ�� (parameter ������ ��ȭ)
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// private (������, ������)
	// 1. Ŭ���� ���ο����� �ǹ� ����.
	// 2. ��ü ���忡���� private ������ �ʴ´�.

	// Ŭ���� ���ο��� �ٸ� �Լ��� ������ �������� ����� ���
	// ex) ��� ���� �Լ�
	// ���� �Լ�
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum2(int data) {
		int result = operationMethod(data); // �ٸ� �Լ� ȣ���ϱ�
		if (result > 0)
			return 1;
		else
			return -1;
	}

	// Quiz
	// a �� b ���߿� ū ���� �����ϴ� �Լ� ����
	// ex) Max(500,300);
	public int Max(int a, int b) {
		return a > b ? a : b; // ���� ������
	}

	public String Concat(String s, String s2, String s3) {
		String result = s + "/" + s2 + "/" + s3;
		return result;
	}

	// Ŭ������ Ÿ���̴�.
	/*
	 * public int call(){ return 100; } public Tv call(){ return new Tv(); }
	 * 
	 * [Today Point] Ŭ������ memory �÷��� ��� �� �� �ִ�. Tv tv= new Tv(); //Tv�Ѵ� ���������.
	 * 
	 * public int call(Tv t){...} //t��� ������ TvŸ���� �ּҸ� ���� �� �ִ�. public Tv call(){...}
	 * // Tv Ÿ���� �ּҰ��� �����Ѵ�.
	 * 
	 */

	public Tv objMethod() {
		Tv tv = new Tv(); // Tv Ÿ���� �ּҰ� return ������ ��� new ����
		tv.brand = "LG";

		return tv;
	}

	public Tv objMethod2() {
		return new Tv();
	}

	public Tv objMethod3(Tv t) {
		return t;
	}

}
