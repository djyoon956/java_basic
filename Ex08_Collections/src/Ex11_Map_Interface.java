import java.awt.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map Interface
Map > (key, value) 쌍의 구조를 갖는 배열
ex) 지역 번호:(02,서울)
Key : 중복 x
Value : 중복 o

Generic

HashTable(구버전:동기화 보장)
HashMap(신버전 :동기화 보장x) >> 성능 고려


*/

public class Ex11_Map_Interface {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1007");
		// ex) id, password 관리로 사용가능

		System.out.println(map);

		// Collection 데이터 가질 수 있다 >> 프로그램이 실행되는 동안에만
		// 휘발성 메모리 >> 프로그램 종료 >> 데이터 보존(파일 기반) >> 사원.txt, 회원.txt
		// 파일은 데이터를 다루기 힘들다. >> RDBMS(관계형 DB)

		System.out.println(map.containsKey("Tiger"));
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));

		// (key,value)
		// key값을 가지고 value값을 찾는다.
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("Hong")); // 해당되는 key가 없으면 null return

		map.put("Tiger", "1008"); // key가 같은 경우에는 value값을 overwrite한다.
		System.out.println(map);
		Object obj = map.remove("superman");
		System.out.println(map);
		System.out.println("size : " + map.size());
		System.out.println(obj);

		// 중복 x, 순서 x
		Set set = map.keySet();
		System.out.println(set);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------");

		// Quiz
		// value출력
		Collection list = map.values();
		System.out.println(list.toString());
	}
}
