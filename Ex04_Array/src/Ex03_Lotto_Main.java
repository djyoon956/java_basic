/*
 * 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요.
 * 		int number=Math.random()*45+1
 * 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안돼요 (중복 값 검증)
 * 3. 배열에 있는 6개의 값은 낮은 순으로 정렬하세요 (정렬)
 * 4. 위 결과를 담고 있는 배열을 출력하세요
*/

public class Ex03_Lotto_Main {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = i - 1; j >= 0; j--) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}

		System.out.print("정렬 전 >> ");
		for (int number : lotto)
			System.out.print(number + " ");
		System.out.println();

		for (int i = 0; i < lotto.length; i++) {
//			for (int j = 0; j < lotto.length - 1; j++) {
//				if (lotto[j] > lotto[j + 1]) {
//					int temp = lotto[j + 1];
//					lotto[j + 1] = lotto[j];
//					lotto[j] = temp;
//				}
//			}

			// 선택정렬
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		System.out.print("정렬 후 >> ");
		for (int number : lotto)
			System.out.print(number + " ");
	}
}
