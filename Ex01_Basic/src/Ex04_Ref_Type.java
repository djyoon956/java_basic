//Ŭ������ ���赵�̴�. Ŭ������ Ÿ���̴�.
//Ŭ���� == ���赵 == Ÿ��
//Ŭ������ ��üȭ�ؼ� ���(���� ���� ����)
//���α׷� ���迡���� new�� ���� ��üȭ ��Ŵ(�޸𸮿� ��üȭ ��Ŵ) >> �ν��Ͻ�instance, ��ü

//���赵�� �ۼ��Ѵ�.
//Ŭ������ ũ�� 2����(������(main)�� ������ Ŭ����, maint�Լ� ���� Ŭ����(ȥ�� ������� ����))

class Apt{
	int door=10;
	int window=100;
}
public class Ex04_Ref_Type { //maint �Լ��� �ִ� ���赵

	public static void main(String[] args) {
		//Apt��� ���赵�� ������ ��üȭ(����Ʈ ����)
		Apt lgapt = new Apt();
		//lgapt(��������, ��ü����:�ּҸ� ������ �ִ� ����)
		System.out.println("�ּ� �� : " + lgapt);
		//lgapt �༮�� ��ü�� �ּҸ� ������ ���(��Ģ������ new�ϳ�)
		
		Apt ssapt = lgapt; //�Ҵ絵 ����� �ϳ���. = ����Ʈ ���踦 �����ִ� ��
		ssapt.door = 1111;
		System.out.println(lgapt.door);
		
	}

}
