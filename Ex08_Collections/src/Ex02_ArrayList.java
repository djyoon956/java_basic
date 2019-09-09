
import java.util.ArrayList;
import java.util.List;

/*

*/
public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);

		System.out.println(arrayList.toString()); // [100, 200, 300]
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("특정 방에 있는 값 : " + arrayList.get(0));
		arrayList.add(0, 111);
		System.out.println(arrayList.toString()); // [111, 100, 200, 300]

		// add(index, element), remove();
		// ArrayList 가지는 함수 공부
		System.out.println("arrayList.contains(200) : " + arrayList.contains(200));
		System.out.println("arrayList.contains(333) : " + arrayList.contains(333));

		System.out.println("arrayList.isEmpty() : " + arrayList.isEmpty());
		arrayList.clear();
		System.out.println("arrayList.isEmpty() : " + arrayList.isEmpty());
		arrayList.add(0, 101);
		arrayList.add(1, 102);
		arrayList.add(2, 103);
		System.out.println(arrayList.toString());
		Object obj = arrayList.remove(0); // 0번째 방 삭제
		System.out.println("삭제 데이터 : " + obj);
		System.out.println(arrayList.toString());

		// Today Point
		List li = new ArrayList();

		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		List eList = li.subList(0, 2);
		System.out.println(eList.toString());
	}
}
