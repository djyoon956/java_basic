import java.util.Arrays;
import java.util.function.IntPredicate;

// 배열은 객체다
// new, memory (heap) 
// 고정(정적) 배열(크기가 고정) >> 단점 >> Collection(동적 배열)
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		// int score = 10, score1 = 20, score3 = 30;

		int[] scores = new int[3];
		System.out.println("scores 변수 주소 : " + scores);
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		// Array 는 각각의 방을 가지고 있다. (방의 크기(int크기) :4byte)
		// 각각의 방의 접근 : 첨자, index >> 0 번 부터 시작한다.
		// 배열의 타입의 기본값을 초기값으로 갔는다.
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		System.out.println("-for문을 이용해 배열 출력");
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
		}

		// Tip Array 도와주는 보조 클래스
		System.out.println("-Arrays 배열 출력");
		System.out.println(Arrays.toString(scores));

		// Today Point
		// 배열 생성 방법

		// 기본
		int[] arr = new int[5];
		int[] arr2 = new int[] { 100, 200, 300 };
		int[] arr3 = { 11, 22, 33, 44, 55 };

		// javaScript : let cars= [11,22,33,44,55];

		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d] : %d\n", i, arr3[i]);
		}

		// 객체 선언 할당 분리
		// Car c; 선언
		// c = new Car();

		// 배열은 객체다
		int[] arr4;
		arr4 = new int[] { 21, 22, 23, 24, 25 }; // 할당 arr4라는 변수에 주소값을 넘기는 행위

		int[] arr5 = arr4;
		System.out.println(arr5.equals(arr4));

		String[] strarry = new String[] { "가", "나", "다라마" };
		char[] charray = new char[10]; // '\u0000' -> 빈문자값

		for (int i = 0; i < charray.length; i++) {
			System.out.println(">" + charray[i] + "<");
		}
		
		// Car[] cars= new Car[10];
		
		
		
		
	}
}
