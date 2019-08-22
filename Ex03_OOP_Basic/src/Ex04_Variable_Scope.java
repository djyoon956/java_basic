
class Variable {
	int iv;

	static int cv;
	/*
	 1. Class variable (Ŭ���� ����), Static variable(���� ����)
	 2. ���� : ������ ��°� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�) : ��ü�� ���� �ڿ�
	 	heap�� ������ ��ü���� �����ڿ�(�����ڿ�)	
 	3. Ư¡ : ���� ��� >> Class ��.static������ (��ü�� ��������� ���� ��Ȳ������ ������ ����)
 			ex) Math.Random 
	4. �������� : javac ������ >> java ~(����) >> 
					class loader�� ���ؼ�
					1. Ŭ���� ����(metadata)�� �о �� ������ class area (static area) �ø���.
					static �ڿ��� ���� memory�� �ø���.
					>> static �ڿ��� ��ü���� ������ memory �ö󰡴� �ڿ�
					
	*/
	
	void method() {
		int lv = 0;
		/*
		local variable (�Լ� ���� ���� : �ݵ�� �ʱ�ȭ)
		�����ֱ� : �Լ� �� ��
		
		*/
	}
}

public class Ex04_Variable_Scope {
	public static void main(String[] args) {
		Variable.cv = 100;
		Variable variable = new Variable();
		System.out.println(variable.cv);
		
		//����
		System.out.println("variable.cv : "+variable.cv);
	}
}
