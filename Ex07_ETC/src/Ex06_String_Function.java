import javax.lang.model.element.VariableElement;

public class Ex06_String_Function {
	public static void main(String[] args) {
		String str = "";

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String value : strarr)
			System.out.println(value);

		String ssString = "hello";
		String concatstr = ssString.concat(" world");
		System.out.println(concatstr);

		System.out.println(ssString.contains("el"));
		System.out.println(ssString.contains("ho"));

		String ss2 = "a b c d"; // [a][ ][b][ ][c][ ][d][ ]
		System.out.println(ss2.length());
		System.out.println(ss2.substring(3));

		String filename = "hello java, world";
		System.out.println(filename.indexOf(","));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("jeva"));
		// return -1은 배열안에 존재하지 않는 값

		System.out.println(filename.lastIndexOf("a"));
		// length, indexof, subString, replace, Splite,,

		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(0, 0)); // 출력x
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(1, 1)); // 출력x
		System.out.println(result.substring(2, 3));

		// Quiz
		String filename2 = "hong.png"; // hong.png or 1.txt
		int index = filename2.indexOf(".");
		System.out.println("파일명 : " + filename2.substring(0, index));
		System.out.println("확장자 : " + filename2.substring(++index));

		// replace
		String s4 = "ABCD";
		System.out.println(s4.replace("A", "안녕"));

		// etc
		System.out.println(s4.charAt(0));
		System.out.println(s4.endsWith("A"));
		System.out.println(s4.equalsIgnoreCase("abcD"));

		// **Point**
		String s6 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		for (String value : s6.split(","))
			System.out.println(value);
		for (String value : filename2.split("\\."))
			System.out.println(value);

		// 정규표현식
		// 특수한 문자로 패턴 설계한다.
		// 설계한 형식으로 유효성검증
		// ex) 주민번호, 전화번호, 핸드폰 번호, 차량 번호, 우편 번호

		// 010-{\d4}-0000 -> 정규표현
		// 010-456-0000 -> false
		// 010-4567-0000 -> true

		// Quiz
		String s8 = "홍            길             동";
		// 저장시 공백 제거해서 저장
		System.out.println(s8.replace(" ", ""));
		String s9 = "           홍길동             ";
		System.out.println(s9.trim());

		String s10 = "                홍            길         동                  ";
		System.out.println(s10.replace(" ", ""));

		// 여러개의 함수 연결
		System.out.println(s10.trim().replace(" ", ""));

		// Quiz-1
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// 배열에 있는 문자 값들의 합을 sum에 담아 출력하세요.
		for (String value : numarr)
			sum += Integer.parseInt(value);
		System.out.println("sum : " + sum);

		// Quiz-2
		// 주민 번호의 합을 구하세요
		String jumin = "123456-1234567";
		String result22 = jumin.replace("-", "");

		sum = 0;
		for (int i = 0; i < result22.length(); i++)
			sum += Integer.parseInt(result22.substring(i, i + 1));
		System.out.println("sum : " + sum);

		sum = 0;
		for (char c : jumin.replace("-", "").toCharArray())
			sum += Character.getNumericValue(c);
		System.out.println("sum : " + sum);

		// String class Static 자원
		System.out.println(String.format("%d-%s", 100, "qwer"));

		// 

	}
}
