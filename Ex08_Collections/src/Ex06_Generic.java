import java.util.ArrayList;

//Today Point
//Generic
//jdk1.5
//C# , Java 필수기능 ...

//Collection
//1.Object 타입 저항 > 타입 >> 탈피 >> 제너릭
//2.타입 안정성 (타입 강제성)
//3.형변환 (casting)   (Car)Obj (x)

//Generic 은 클래스 설계시 >> 타입을 강제하게 하는 방법
//원리 .....
//당신이 객체를 만들때 타입을 정의 ....
class MyGen<T>{ //Type parameter
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}


/*
class MyGen{ 
	Person obj;
	void add(Person obj) {
		this.obj = obj;
	}
	
	Person get() {
		return this.obj;
	}
}
*/
class Person extends Object {
	int age = 100;
}

public class Ex06_Generic {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//만들어지는 저장공간(Array  타입  default Object)
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		for(Object obj : list) {
			//System.out.println(obj);
			//person 객체임을 판단하고  ... age 값 출력
			if(obj instanceof Person) {
				//System.out.println(obj);
				Person person = (Person)obj;
				System.out.println(person.age);
			}else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person());
		alist.add(new Person());
		for(Person p : alist) {
			System.out.println(p.age);
		}

		MyGen<String> my = new MyGen<String>();
		MyGen<Person> myperson = new MyGen<Person>();
		myperson.add(new Person());
		Person p = myperson.get();
		System.out.println(p.age);
		
	}

}
