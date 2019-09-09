import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
Set 인터페이스 구현
순서(x), 중복(x) 데이터 집합
ex) HashSet, TreeSet
*/

public class Ex09_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo1 = hs.add(55);
		System.out.println(bo1);

		System.out.println("size() : " + hs.size());
		System.out.println(hs.toString());

		boolean bo = hs.add(1); // 중복 데이터로 추가되지 않는다.(false)
		System.out.println(bo);

		hs.add(2);
		System.out.println(hs.toString());

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2.toString());

		// 1. 중복 데이터(x)
		String[] obj = { "A", "B", "A", "C", "D", "B", "A" };
		HashSet<String> hs3 = new HashSet<String>();
		for (String s : obj)
			hs3.add(s);
		System.out.println(hs3.toString());

		// Quiz
		// HashSet 사용해서 1~45까지의 난수 6개를 넣으세요
		// 단 중복값이 있으면 안된다.
		HashSet<Integer> hs4 = new HashSet<>();
//		for (int i = 0; hs4.size() < 6; i++) {
//			int random = (int) (Math.random() * 45 + 1);
//			hs4.add(random);
//		}

		int index = 0;
		while (hs4.size() < 6) {
			System.out.println("index :" + ++index);
			int random = (int) (Math.random() * 45 + 1);
			hs4.add(random);
		}
		System.out.println(hs4.toString());

		HashSet<String> hs5 = new HashSet<>();
		hs5.add("AA");
		hs5.add("DD");
		hs5.add("ABC");
		hs5.add("FFFF");
		System.out.println(hs5.toString());

		Iterator<String> s = hs5.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}

		// Collections.sort(List<T> list); //Parameter 로는 List 인터페이스 를 구현하는 객체의 주소
		// Vector , Stack , ArrayList >> Array [][][][]
		// HashSet >> (x)
		// Collections.reverse(List<T> list);

		// Set 집합 안에 있는 데이터 순서를 주고 싶어요
		// 1. 저장구조 >> Array
		List list = new ArrayList(hs5);
		System.out.println("무작위 before: " + list.toString());
		Collections.sort(list);
		System.out.println("정렬 after: " + list.toString());
		Collections.reverse(list);
		System.out.println("reverse : " + list.toString());

	}
}
