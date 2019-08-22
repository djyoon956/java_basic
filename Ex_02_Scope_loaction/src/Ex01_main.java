import kr.or.bit.common.CommonClass;

/*
Ŭ���� == ���赵 == Ÿ��

Ŭ������ ���� ��� : �ʵ� + ������ + �Լ�
- �ʵ� >> ���� ����, ���� ����, ���� ����
- ������ >> �ʵ��� �ʱ�ȭ�� ���������ϴ� �Լ�
- �Լ� >> ���

Ŭ����, �ʵ�, ������, �Լ� :  ���� �����ϱ� ���ؼ� (������, ������)
>> public, private, default, protected(���)
1. public class Test{...}  
2. class Test{...} >> ���������� �����Ϸ��� default �����ڷ� �ؼ�
	- default class Test{...} >> default �������� �ϹǷ� �����Ѵ�.
	- default ������ : ���� ���� �ȿ����� ������ ����, �ٸ� ������ ���� �Ұ��ϴ�.
	
ex) �ǽ�
1. kr.or.bit.common.CommonClass
	CommonClass >> public class 
	Ex01_main�� CommonClass  �ٸ� ��Ű�� �̴�.
	Ex01_main >> CommonClass ���ٰ����Ѱ�? >>YES
	why? ) public �����ڴ� ��𼭵� ���ٰ����ϴ�.
	
2. kr.or.bit.common.DcommonClass
	Ex01_main >> DcommonClass ���ٰ����Ѱ�? >>NO
	why? ) default ���� �Ұ�. ���� ��Ű�� �ȿ����� ���� ����, �ٸ� ��Ű���� ���� �Ұ�
	>> default class ��� >> ���� ����(package)������ ���� �������� ���
	
3. �ϳ��� �������� �ڹ������� �������� Ŭ������ ���� �� �ִ�.
	�� public�� �ϳ��� class�� ���´�(�������� default..)
*/

class Test { // default ������ (���� ���� �ȿ�����...)
	int d_iv; // default ������
	public int p_iv; // ��ü ���ٰ���
	private int pri_iv; // ��������....ĸ��ȭ ����
}

public class Ex01_main {
	public static void main(String[] args) {
		CommonClass commonClass = new CommonClass();
		commonClass.p_iv = 100; // public �����ڿ��� ���� ����
		Test test = new Test();
		test.d_iv = 100; // ���� �����̱� ������ default �����ڿ� ���� ����
		test.p_iv = 100; // public�� ��Ű���� ������� ���ٰ���
	}
}
