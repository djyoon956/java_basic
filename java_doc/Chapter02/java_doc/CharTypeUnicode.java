package java_doc;

public class CharTypeUnicode {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'Ȯ';
		char ch3 = 54736; // ���� '��'�� �����ڵ� ��
		char ch4 = 54869; // ���� 'Ȯ'�� �����ڵ� ��
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;

		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
	}
}
