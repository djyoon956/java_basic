import kr.or.bit.Emp;

public class Ex06_Array2_Basic {
	public static void main(String[] args) {
		// 2차원 배열
		// [행][열]

		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);

		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 100;
		score[1][1] = 200;

		score[2][0] = 100;
		score[2][1] = 200;

		// 행의 수
		System.out.println(score.length);
		// 열의 수
		for (int i = 0; i < score.length; i++)
			System.out.println(i + "행의 열의 수 : " + score[i].length);

		// Today Point
		// 개선된 for문
		// Java : for (Type 변수명 : 배열 or Collection){ 실행구문 }
		// C# : for (Type 변수명 in 배열 or Collection) {}
		int[] arr3 = { 5, 6, 7, 8, 9 };
		for (int value : arr3)
			System.out.println(value);

		String[] strarr = { "A", "B", "C", "D", "FFF" };
		for (String value : strarr)
			System.out.println(value);

		Emp[] list = { new Emp(1, "A"), new Emp(2, "B"), new Emp(3, "C") };
		for (Emp value : list)
			value.empInfoPrint();

		// Quiz!
		int[][] score3 = new int[][] { { 11, 12 }, { 13, 14 }, { 15, 16 } };
		for (int[] value : score3) {
			for (int num : value)
				System.out.print(num + " ");
		}
	}
}
