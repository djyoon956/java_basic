/*
String Class
String str = new String("홍길동");
8가지 값 타입과 동일하게 사용해도 문제없이 설계 가능하다.
String str = "홍길동";

 1. String Class : 데이터 저장 구조 >> char[] 배열 저장
 	ex) String ename ="abc"; >> 저장구조 : char[] 생성 >> [a][b][c]
*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str.length());

		String str1 = "AAA";
		String str2 = "AAA";

		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1==str2 : " + str1 == str2);

		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		System.out.println("str3 == str4 : " + str3 == str4);
	}
}
