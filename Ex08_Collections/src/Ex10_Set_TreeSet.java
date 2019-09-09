import java.util.*;

public class Ex10_Set_TreeSet {
	public static void main(String[] args) {
		// Set(순서 유지(x), 중복(x))
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());

		// HashSet 확장 > LinkedHashSet(순서유지) >> Linked(주소) >> node
		// 넣은 순서를 보장(Array(x) > node 개념)
		Set<String> hs2 = new LinkedHashSet<>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println(hs2.toString());

		// TreeSet
		// 자료 구조(순서(x), 중복(x), 정렬(o))
		// 검색하거나 정렬을 필요로 하는 자료구조
		Set<Integer> numbers = new TreeSet<Integer>();
		while (numbers.size() < 6) {
			int random = (int) (Math.random() * 45) + 1;
			numbers.add(random);
		}
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
