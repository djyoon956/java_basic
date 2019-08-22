package java_doc;

public class OperatePromotion {
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;

		// *정수형 연산 리터럴은 int이기때문에 num1+num2 = int 값으로 계산된다.
		// short result= num1+num2;
		short result = (short) (num1 + num2);
		System.out.println(result);
	}
}
