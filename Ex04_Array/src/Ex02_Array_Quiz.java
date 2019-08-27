
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// 수학과 학생의 기말고사 시험 점수
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // 79
		int min = score[0]; // 79

		// 제어문을 사용해서 max라는 변수에 시험 점수 최대값을 min 변수에는 최소값을 담는다.
		// 출력 : max = 97, min = 54
		// 조건 : for문 1회 사용
		for (int i = 1; i < score.length; i++) {
//			if (score[i] > max)
//				max = score[i];
//			if (score[i] < min)
//				min = score[i];
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.printf("max = %d, min = %d\n", max, min);

		int[] number = new int[10];
		// 10개의 값을 1~10까지의 값으로 초기화하세요
		// 조건 : for문 1회 사용
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.printf("number[%d] = %d\n", i, number[i]);
		}

		// 어느 학생의 기말고사 시험 점수입니다.(5과목)
		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };
		/*
		 * 1. 총 과목수 
		 * 2. 과목의 합 
		 * 3. 과목의 평균 
		 * 조건 : 2,3번 문제는 for문 1회 사용
		 */
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];

			if (i == jumsu.length - 1)
				average = (float) sum / jumsu.length;
		}

		System.out.println("총 과목의 수 : " + jumsu.length);
		System.out.println("과목의 합 : " + sum);
		// System.out.println("과목의 평균 : " + (float)sum/jumsu.length);
		System.out.println("과목의 평균 : " + average);
	}
}
