// import java.lang.Math;

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;
		// 대입연산자 (+= , -= , *= , ) 습관적으로
		sum += 1;// sum=sum+1;
		sum -= 1;// sum=sum-1;
		System.out.println("sum:" + sum);

		// 간단한 학점 계산기
		// 학점 ... A+ , A- , B+ , B- (score)
		// 점수: 94점
		// 95점 이상 A+
		// 그외는 A-

		// 90점 이상이면 A 인데 ... 95 A+ ,93 A-
		int score = 90;
		String grade = ""; // 문자열 초기화
		System.out.println("당신의 점수는 : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				// grade = grade+"+";
				grade += "+"; // A+
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 학점은 : " + grade + "입니다");

		// syso + ctrl+space 자동완성
		// 코드 정렬하기
		// ctrl + A 블럭선택 > ctrl + shift + F (자동정렬)
		
		int data =100;
		switch(data) {
			case 100: System.out.println("100입니다");
				break;
			case 90: System.out.println("90입니다");
				break;
			case 80: System.out.println("80입니다");
				break;
			default: System.out.println("default");	
		}
		
		//break 강제 사항이 아닙니다 (필요에 따라서)
		//case 조건 만족하는 그 이후부터 다 실행
		data = 80;
		switch(data) {
			case 100: System.out.println("100입니다~");
			case 90: System.out.println("90입니다~");
			case 80: System.out.println("80입니다~");
			default: System.out.println("default~");	
		}
		
		int month = 2;
		String res="";
		switch(month) {
			case 1: System.out.println("1");
			case 3: System.out.println("3");
			case 5: System.out.println("5");
			case 7: System.out.println("7");
			case 8: System.out.println("8");
			case 10:System.out.println("10");
			case 12:res = "31";
			break;
			
			case 4:
			case 6:
			case 9:
			case 11: res="30";
			break;
			
			case 2: res="29";
			break;
			
			default : res="월이 아닙니다";

		}
		System.out.println(month + "월은" + res + "일까지 입니다.");
		
		//난수(랜덤값 : 임의의 추출값)
		//java.lang.Math (Math 클래스)
		//default > java.lang.Math
		//java 페이지 default 열어 놓은 폴더가 있어요 (java.lang) >> import java.lang.*
		//페이지 상단(원칙) import java.lang.Math 사용하겠습니다
		
		//Math.Random()
		//static Random() 객체 생성 없이도 사용 가능(static 함수 자주 사용하니까)
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		//결과 : 0.0 <= random < 1.0 
		
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() * 10: " + Math.random() *10);
		//0~9 까지의 정수값만
		System.out.println("(int)(Math.random() *10): " + (int)(Math.random() *10));
		
		//1~10까지의 정수값만
		System.out.println("(int)(Math.random() *10): " + ((int)(Math.random() *10) + 1));
		
		/*
		우리는 백화점 경품 시스템을 만들려고 한다
		경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
		
		경품 추첨시 1000 점수가 나오면
		경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
		
		경품 추첨시 900 점수가 나오면
		경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
		
		경품 추첨시 800 점수가 나오면
		경품으로  냉장고 , 한우세트 , 휴지
		
		경품 추첨시 700 점수가 나오면
		경품으로  한우세트 , 휴지
		
		경품 추첨시 600 점수가 나오면
		경품으로  휴지
		
		그외 점수는 100 ~ 500 까지는 칫솔 
		
		경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
		
		*/
		  int jumsu = ((int)(Math.random()* 10) + 1)*100;
		  System.out.println("추첨번호 : " + jumsu);
		  String msg="";//초기화
		  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
		  switch(jumsu) {
		  	case 1000:msg+="Tv ";
		  	case 900:msg+="NoteBook ";
		  	case 800:msg+="냉장고 ";
		  	case 700:msg+="한우 ";
		  	case 600:msg+="휴지 ";
		  	     break;
		  	default:msg+="칫솔";     
		  }
		  System.out.println(msg);
	}
}