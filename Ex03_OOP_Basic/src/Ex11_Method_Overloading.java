/*
��ü������
1. ���(����)
2. ĸ��ȭ (private) -> �Լ�(read, write) : �����Ҵ�(�ڿ���ȣ) -> ĸ��ȭ�� member field�� ���ؼ� read(get), write(set) ���� �Լ� -> setter, getter -> �ڵ������̿��Ѵ�.
3. ������ 

[������ �� �κ�...]

[Method overloading]
�ϳ��� �̸����� �������� ����� �ϴ� �Լ�
ex) System.out.println()
Ư¡ : overloading�� ���� ��� ������ ���� �ʴ´�.
		why> ���ϰ� ����Ϸ���... >> ������
		���赵�� �����ϸ� >> �Լ��� Ȱ���� ���� ��� (�پ��� parameter�� ����ϴ� ���)
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
