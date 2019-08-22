package kr.or.bit;
// ���� �ּ�
/*
������ : ȫ�浿
��¥ : 2019-08-05
���� : �� ������ ���� �����Դϴ�.

class�� ���赵�̴�. �ɰ� �� ���� ���� �� �ɰ���.
���赵 �⺻���� �������(��������(�Ӽ�):���� + ��������(���):�Լ�)

�ڵ��� ���赵 >>
��������(�Ӽ�) : ��̷�, ����, Ÿ�̾�, â��, �ڵ�, �ӵ� >> ���� >> int speed = 0
��������(�Ӽ�)
��������(���) : �޸���, �����, �ӵ��� ���δ� �� >> �Լ� >> public void speedUp(){++speed}

���� ���赵 : ��Ϲ���, ����, �⸧ �� 
*/
public class Emp { //����̶�� ���赵
	public int empno; //����� ����� ������ �ִ�.(����� ���� �������̴�.)
	//���� -> ����(��������) -> member field -> instance variable
	
	public String ename; //�̸�
	public String job; //����
	
	private int data; //private ������� �����Ҵ� ���� �����Ҵ� ��Ų��.
	
	//Ư���� ���� : ĸ��ȭ �� �ڿ��� ���� set, get >> setter �Լ�, getter �Լ�
	public int getData() { //���(��������) >> method
		return data;
	}
	public void setData(int input) {
		if(input < 100) {
			this.data = input;
		}else {
			this.data = 0;
		}
	}
	//�� ¥���� �ڵ� = �������� ����(������, �Լ���)


	//��������(���) : �Լ�(method)
	//�Լ��� �ݵ�� ȣ�⿡ ���ؼ� ������ �Ѵ�.
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job;
	}
}