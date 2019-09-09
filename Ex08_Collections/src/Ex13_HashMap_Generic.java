import java.util.*;

/*
HashMap<k,v>
HashMap<String,String>
HashMap<String, Integer>
HashMap<String, Emp> // value값으로 Emp 타입의 주소값
**map.put("Hong", new Emp())**

HashMap<String, ArrayList<Emp> 
map.put("Hong", new ArrayList)


*/

class Student {
	int kor = 100;
	int math = 80;
	int eng = 20;
	String name;

	public Student(String name) {
		this.name = name;
	}
}

public class Ex13_HashMap_Generic {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("hong", new Student("홍길동"));
		map.put("kim", new Student("김유신"));
		Student st = map.get("hong");
		System.out.println(st.eng + "," + st.kor + "," + st.math);

		// key, value값 동시 출력
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Value가 Object 일때
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(((Student) m.getValue()).name);
		}
	}
}
