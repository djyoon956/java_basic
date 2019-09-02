
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;

//		for (int i = 0; i < 10; i++) {
//			int random = (int) (Math.random() * 10);
//			if (random == 0) {
//				i--;
//				continue;
//			}
//			result = num / random;
//			System.out.println("result : " + result + ", i : " + i);
//		}

		for (int i = 0; i < 10; i++) {
			try {
				result = num / (int) (Math.random() * 10);
			} catch (ArithmeticException e2) {

			} catch (Exception e) { // ** 객체의 주소값 **
				System.out.println("연산 예외 발생.");
				System.out.println(e.getMessage());
			}
			System.out.println("result : " + result + ", i : " + i);

			System.out.println("Main 함수 종료...");

			// 연산 관련 예외 객체 발생
			// 예외가 발생하면 그 문제에 따른 객체를 생성한다(new 하지 않아도 자동으로...)
		}
	}
}
