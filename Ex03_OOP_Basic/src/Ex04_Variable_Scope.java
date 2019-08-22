
class Variable {
	int iv;

	static int cv;
	/*
	 1. Class variable (클래스 변수), Static variable(공유 변수)
	 2. 목적 : 정보를 담는것 (생성되는 모든 객체가 공유하는 자원) : 객체간 공유 자원
	 	heap에 생성된 객체들의 공통자원(공유자원)	
 	3. 특징 : 접근 방법 >> Class 명.static변수명 (객체가 만들어지지 않은 상황에서도 접근이 가능)
 			ex) Math.Random 
	4. 생성시점 : javac 컴파일 >> java ~(실행) >> 
					class loader에 의해서
					1. 클래스 정보(metadata)를 읽어서 그 내역을 class area (static area) 올린다.
					static 자원을 먼저 memory에 올린다.
					>> static 자원은 객체생성 이전에 memory 올라가는 자원
					
	*/
	
	void method() {
		int lv = 0;
		/*
		local variable (함수 지역 변수 : 반드시 초기화)
		생명주기 : 함수 블럭 내
		
		*/
	}
}

public class Ex04_Variable_Scope {
	public static void main(String[] args) {
		Variable.cv = 100;
		Variable variable = new Variable();
		System.out.println(variable.cv);
		
		//검증
		System.out.println("variable.cv : "+variable.cv);
	}
}
