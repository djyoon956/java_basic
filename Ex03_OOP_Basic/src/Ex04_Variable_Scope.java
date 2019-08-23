/*
instance variable  (class Car { String color; }
local variable     (class Car { void move(){ int speed; } }
static variable    (공유자원 , 객체생성이전에 memory 올라가는 자원)  
*/

class Variable {
	int iv;
	/*
	 1. member field , instance variable  
	 2. Variable v = new Variable();  heap 메모리에 iv 생성 ....
	    Variable v2 = new Variable(); heap 메모리에 iv 생성 ....
	 3. 목적 : 정보를 담을 려고 한다 (정보에 맞는 Type 정보를 가져야 한다)
	         - 정보(속성) >> 고유 , 상태 , 부품(참조) 
	         - 정보는 객체마다 다른 값을 가질 수 있다. 
	         -그러기 때문에 굳이 초기화 하지 않아요 (default 값을 가지고 있어요)
	          int >> 0 , float >> 0.0 , boolean > false 
	          String >> 참조(클래스) >> null
	 4. 생성시점 : new 라는 연산자를 통해서 heap 객체가 만들어지고 나서 바로 변수 생성         
	                      
	*/
	
	static int cv;
	/*
	1. class variable (클래스 변수) , static variable(공유변수)
	2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원): [객체간] 공유자원
	   heap 생성된 객체들의 공통자원(공유자원)
	3. 특징 : 접근방법 >> 클래스이름.static변수명 (객체가 만들어지지 않은 상황에서 접근 가능)..
	        ex) Math.Random() >> Math m = new .. 하지 않았어요  
	                접근방법 >> 참조변수.static변수명 
	                (Variable v = new Variable() >> v.cv)
	                (Variable v2 = new Variable() >> v2.cv)  
    4. 생성시점 : javac 컴파일 >> java Variable (실행) >>	
               class loader 의해서
               1. 클래스 정보(metadata)를 읽어서 그 내역을 class area (method area) 올려요                
	              static 자원을 먼저 memory 올려요  
	              >>static 자원은 객체생성 이전에 memory 올라가는 자원
	*/
	
	void method() {
		int lv = 0;
		/*
		  local variable (함수 지역변수 : 반드시 초기화) 
		   생명주기 : 함수 시작 생성 ~ 함수 끝나면 같이 소멸
		  
		   함수안에 if 블럭 (블럭변수)  , for 블럭 (for (int i =0 ....)
		*/
	}
}

public class Ex04_Variable_Scope {
	public static void main(String[] args) {
		Variable.cv = 100;
		Variable variable = new Variable();
		System.out.println(variable.cv);

		// 검증
		System.out.println("variable.cv : " + variable.cv);
	}
}
