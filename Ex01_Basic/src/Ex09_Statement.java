import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		//ctrl + Shift + O  (import 자동 생성하기)
		/*
		if(sc.hasNextInt()) {  //의문형 함수 >> true, false
			System.out.println("정수값이야");
		}else {
			System.out.println("다른값인데");
		}
		*/
		//sc.hasNextLine() //너 문자열 데이터야 >> true , false
		
		//제어문 (암기하자)
		//조건문 (if 3가지) (switch(){case  .. break})
		//반복문 for(반복횟수 명확) , while(true,false) , do~while()
		//분기문 break(블럭 탈출) , continue(아래 구문 skip)
		
		int count=0;
		if(count < 1) {
			System.out.println("True 입니다");
		}
		
		//실행블럭 생략 가능
		//자바 ; 세미콜론 문장의 끝 (해석의 단위)
		if(count < 10)
			System.out.println("{True}");
		
		char data ='A';
		switch(data) { //switch(인자값) 숫자(정수) ,char , String 가능
			case 'A' : System.out.println("문자비교");
				break; //탈출의 범위 (switch 블럭)
			default : System.out.println("else 모든 것");
		}
		
		//반복문
		int sum=0;
		for(int i =1; i <= 10 ;i++) {
			//System.out.println(i);
			//누적값
			sum+=i;//sum = sum + i;
		}
		System.out.println("sum 1~10 : " + sum);
		
		//for문을 사용해서 1~10까지의 홀수의 합을 구해보세요
		//단 for 문 하나만 가지고 해결하세요 (for 문에 if문 쓰지 마세요)
		int sum2=0;
		for(int i =1; i <= 10 ;i+=2) { //i = i + 10
			//System.out.println(i);
			sum2+=i; //홀수의 합
		}
		System.out.println("1~10 까지의 홀수의 합 : " + sum2);
		
		//1~100까지의 합
		//짝수의 합을 구하세요 (if 문 사용)
		int sum3 = 0;
		for(int i =1 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				sum3+=i; //sum3 = sum3 + i
			}
		}
		System.out.println("1~100까지 짝수의 합 : " + sum3);
		
		//입사시험 (필수)
		//구구단 (중첩 for문 사용하기)
		//2~9
		//2 > 1~9  >> 연산
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				//System.out.println("i : " + i + "-" + "j : " + j);
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		//key point : break 탈출 , continue 스킵
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(i == j) {
					break; //안쪽 for문 탈출
				}
				//System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(i == j)continue; 
				//if(i == j){ continue; }
				
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.printf("%s","*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < i; j++) { // j <= 9
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 100; i >= 0; i--) { // 연습
			System.out.println(i);
		}

		System.out.println("피보나치 수열");
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(" " + c);
		}
	}
}