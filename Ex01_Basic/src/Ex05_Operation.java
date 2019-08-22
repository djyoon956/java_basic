//연산자
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // 몫
		System.out.println(result);

		result = 13 % 2; // 나머지 구하는 연산자 %
		System.out.println(result);

		// 증가, 감소(증가감 연산자 : ++, --) 1씩 증가, 1씩 감소
		int i = 10;
		++i;// 전치증가 i=i+1;
		System.out.println(i);
		i++;// 후치증가
		System.out.println(i);
		// 변수가 혼자 : 전치던 후치던 동일

		// POINT : 전치 후치는 다른 연산자와 결합됐을 경우 성질이 나옴
		int i2 = 5;
		int j2 = 4;

		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + " j2 : " + j2);

		// POINT
		// 자바의 연산 규칙
		// 정수의 모든 연산은 int로 변환 후에 처리한다
		// byte + byte => 컴파일러가 int + int
		byte b = 100; // -128 ~ 127
		byte c = 28;
		byte d = (byte) (b + c);
		System.out.println(d);
		// 1. int d = b + c;
		// 2. byte d = (b + c); 데이터 손실이 올 수도 있다.

		// byte + short => int + int
		// char + char => int + int
		// 연산처리시
		// POINT : 연산에서 int보다 작은 타입은 int로 변환한다. (long 제외)
		// 연산(byte, char, short -> int) 바꾸어서 처리

		// 규칙 피연산자 중 표현 범위가 큰 타입으로 형 변환된다.
		// byte + short => int + int
		// char + int => int + int
		// int + long -> long + long

		// 정수 + 실수
		long ll = 10000000000L;
		float ff = 1.2F;
		float fresult = ll + ff; // 실수가 이긴다
		System.out.println(fresult);

		float num2 = 10.45F;
		int num3 = 20;
		float result5 = num2 + num3; // 받는 쪽을 큰 타입으로 하면 상관 없음 float+int >> float + float
		System.out.println(result5);
		// int result5=(int)(num2+num3);
		// System.out.println(result5); //원래 30.45인데 30이 출력되니 0.45만큼 데이터 손실이 일어난다.

		char c2 = '!'; // char은 정수타입 (내부적으로 정수)
		char c3 = '!';

		// c2+c3 결과는?
		// char result6=c2+c3; int + int가 되어버리기 때문에 안됨
		int result6 = c2 + c3;
		System.out.println("result6 : " + result6);
		// 더한 값을 문자로 출력 : 10진수 66을 아스키코드표 문자로 출력
		System.out.println((char) result6);

		// 제어문
		// 중소기업 시험문제(구구단 출력) >> (별 찍기)
		// main 함수안에 있는 local variable
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : "+j);
			if (j % 2 == 0) { // ==는 true, false만 나타낸다.
				// System.out.println("j : " + j);
				sum += j;// sum = sum + j;
			} // j는 for문안에서 실행되고 사라지니 여러번 사용 가능!!!!!
		}
		System.out.println(sum);

		// ==연산자(값을 비교하는 연산자)
		if (10 == 10.0F) { // 값을 비교하기때문에 타입이 달라도 True가 나온다.
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// ! 부정연산자
		if ('A' != 65) { // 같지 않니?
			System.out.println("같지 않아");
		} else {
			System.out.println("같아");
		}
		// 암기하자(POINT)
		// 삼항연산자
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);
		// 삼항연산자는 if문과 호환 가능

		if (p == k) {
			result8 = p;
		} else {
			result8 = k;
		}

		// 진리표
		/*
		 * (논리연산) 0 : false 1 : true OR AND 0 0 0 0 0 1 1 0 1 0 1 0 1 1 1 1
		 * 
		 * sql문 (oracle) select * from emp where empno=1000 and sal > 2000 //그리고
		 * 
		 * select * from emp where empno=1000 or sal > 2000 //또는
		 * 
		 * 연산자 | or 연산자 & and 연산자 0과 1로 변환해서 bit연산을 해라
		 * 
		 * || 논리연산 && 논리연산
		 */

		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x | y));
		System.out.println("x&y : " + (x & y));
		// 십진수 3을 -> 2진수(0과 1로만 이루어진 값으로 바꾸어서)
		// 2 0승, 2 1승
		// 8 4 2 1
		// 0 0 1 1 >> 3의 2진수 값
		// 0 1 0 1 >> 5의 2진수 값
		// 0 1 1 1 >> OR연산 -> 7
		// 0 0 0 1 >> AND연산 -> 1

		// POINT 논리연산(&&(and), ||(or))
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 &&....){실행문} //True, False가 결정되는순간
		// 끝난다.
		// if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ||....){실행문}
	}

}