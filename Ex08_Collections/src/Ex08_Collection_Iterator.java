import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Collection Framework
나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준 정의

Iterator Interface
1. hasNext(), next(), remove() ....구현해
2. Iterator : 순방향 데이터 read 보장한다.
3. ListIterator : 양방향 데이터 read 보장 표준화
쓰지 않아도 데이터 조회는 가능하다......... 표준화 고민

*/

public class Ex08_Collection_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		// 순방향 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + list.get(i) + "]");
		}
		System.out.println("-------------------------------");
		// 역방향 출력
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println("[" + list.get(i) + "]");
		}
		// 표준화된 형식의 나열된 데이터 출력하기
		// Iterator 인터페이스
		// Collection (Iterator iterator(); 추상함수)
		// List extends Collection
		// ArrayList implements List
		// ArrayList iterator() 강제 구현 ....{ 실행 블럭 구현 }
		// 부모 타입인 Iterator 통해서 ArrayList가 구현한 자원에 접근한다.
		System.out.println("-------------------------------");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// int의 참조 형식 >> Integer 클래스
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(44);
		numbers.add(55);
		numbers.add(66);

		System.out.println("-------------------------------");
		Iterator<Integer> iterator2 = numbers.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		System.out.println("-------------------------------");
		// Iterator 순방향 조회만 가능하다. (역방향 x)
		// >> ListIterator

		ListIterator<Integer> listIterator = numbers.listIterator();
		// Iterator 순방향 조회만 가능하다. (역방향 x)
		// >> ListIterator 사용하면 가능
		// 순방향 조회 >> 그 다음 역방향 조회
		// 바로 역방향 불가능

		// 순방향
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("-------------------------------");
		// 역방향
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
