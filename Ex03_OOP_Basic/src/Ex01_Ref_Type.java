
import kr.or.bit.FoodInfo;
import kr.or.bit.Person;
import kr.or.bit.Res;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		// int i = 100;

		Person person = null; // ����, stack ������ ������ �����ǰ� null�� �Ҵ�
								// 4byte
		System.out.println("Person : " + person);
		person = new Person(); // �Ҵ�(Person ��ü�� �ּҰ�)
								// Person Ÿ���� �޸𸮸� ���´�.
		System.out.println("Ref Person : " + person); // Ref Person : kt.or.bit.Person@15db9742
		person.print(); // �ʱⰪ ���
		person.name = "ȫ�浿";
		person.age = 10;
		person.print();

		Person myPerson = new Person();
		myPerson.name = "�ƹ���";
		myPerson.age = 100;
		myPerson.print();

		int num = 100;
		Person you;
		// 1. you ���� �ʱ�ȭ (���� ���������� null, �Ϲ������� �ּҰ��� ���� ����)
		you = new Person(); // �ּҰ����� �ʱ�ȭ

		Person my = you;
		System.out.println(my == you);
		System.out.println(my + " : " + you);

		Tv tv1 = new Tv();
		tv1.brand = "�Ｚ";
		tv1.channel = 200;
		tv1.UpChannel();
		tv1.UpChannel();
		tv1.UpChannel();
		tv1.UpChannel();
		System.out.println(tv1.channel);
		tv1.DownChannel();

		Tv tv2 = new Tv();
		tv2.brand = "����";
		tv1.channel = 100;
		tv1.UpChannel();
		tv1.channel = 101;
		tv1.DownChannel();
		
		Res res = new Res();
		res.menuCode = 1111;
		res.name = "¥���";
		res.part = "��";
		res.info.calorie=100;
		res.info.weight=5;
		System.out.println(res.info.calorie);
	}
}
