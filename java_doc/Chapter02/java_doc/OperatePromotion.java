package java_doc;

public class OperatePromotion {
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;

		// *������ ���� ���ͷ��� int�̱⶧���� num1+num2 = int ������ ���ȴ�.
		// short result= num1+num2;
		short result = (short) (num1 + num2);
		System.out.println(result);
	}
}
