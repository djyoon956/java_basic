
import kr.or.bit.FoodInfo;
import kr.or.bit.Person;
import kr.or.bit.Res;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		// int i = 100;
		// int i;
		// System.out.println(i);

		Person person = null; // 선언 >> stack 이라는 메모리 영역에 변수가 만들어지고 null 값 할당
								// 4byte
		System.out.println("Person : " + person);
		person = new Person(); // 선언 >> stack 이라는 메모리 영역에 변수가 만들어지고 null 값 할당
		// person 타입은 메모리를 갖는다
		System.out.println("Ref Person : " + person); // Ref Person : kt.or.bit.Person@15db9742
		person.print();
		person.name = "홍길동";
		person.age = 10;
		person.print();

		Person myPerson = new Person();
		myPerson.name = "아무개";
		myPerson.age = 100;
		myPerson.print();

		int num = 100;
		Person you;
		you = new Person();

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
		tv2.brand = "1111";
		tv1.channel = 100;
		tv1.UpChannel();
		tv1.channel = 101;
		tv1.DownChannel();

		Res res = new Res();
		res.menuCode = 1111;
		res.name = "111";
		res.part = "11";
		res.info.calorie = 100;
		res.info.weight = 5;
		System.out.println(res.info.calorie);
	}
}
