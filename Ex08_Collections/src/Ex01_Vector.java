import java.util.Vector;

/*
CollectionFramwork
[다수의 데이터를] 다루는 표준화된 인터페이스를 구현하고 있는 클래스 집합

Collection 인터페이스 <- List(상속) <---구현 ArrayList(*) ... 
  						 <- Set(상속) <---구현 HashSet, TreeSet
Map 인터페이스 (Key, Value) <- HashMap(*)
--------------------------------------------------------
List 인터페이스 
: 순서, 중복 허용, >> 내부적으로 데이터(자료, 객체) 배열 관리 -> Array[0][1][2]

1. Vertor(구버전)


List 인터페이스를 구현한 클래스
1. 배열의 크기를 동적으로 확장, 축소가 가능 >> 배열의 재할당
2. 순서를 유지(Array) >> 순서(Index) >> 중복값 허용
3. 데이터 저장 공간 (Array)
4. List 인터페이스를 구현하는 클래스는 new를 통해서 객체 생성하고 사용해야한다.
5. 구현한 클래스의 데이터 저장 공간으 타입 : int[] list= new int[10], Emp[] elist={}
	default Type : Object 타입 >> 최상위타입 >> 장점 >> [모든 타입]을 데이터로 사용가능
	>> Object[] obj = new Object[10]; >> obj[0]=10, obj[1]=new Car()
	>> 단점(타입 체크) >> 해결 >> 제네릭(generic) 타입
	>> 제너릭(generic) : 타입을 강제해서 하나의 타입 처리..
*/

public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 capacity : " + v.capacity());
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);

		System.out.println(v);
		System.out.println(v.toString());

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));

		for (Object value : v)
			System.out.println(value);

		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		v2.add("king");
		System.out.println(v2);
		System.out.println(v2.toString());
		System.out.println("size : " + v2.size());
		System.out.println("capacity : " + v2.capacity());

		Vector v3 = new Vector();
		System.out.println("초기 capacity : " + v3.capacity());
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		v3.add("a");
		System.out.println("capacity : " + v3.capacity());
		v3.add("a");

		System.out.println("size : " + v3.size());
		System.out.println("capacity : " + v3.capacity());
	}
}
